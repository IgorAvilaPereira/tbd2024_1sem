package redis1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import redis.clients.jedis.JedisPool;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

public class Main {


    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6379);
        // Gson gson = new Gson();
        // tratando o localdate
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                .create();
        PessoaDAO pessoaDAO = new PessoaDAO(pool, gson);


        get("/", (request, response) -> {
            ArrayList<Pessoa> vetPessoa = pessoaDAO.listar();
            return gson.toJson(vetPessoa);
        });

        delete("/deletar/:key", (request, response) -> {        
            pessoaDAO.deletar(request.params(":key"));
            return "ok";
        });

        post("/adicionar", (request, response) -> {  
            Pessoa p = new Pessoa();
            p.setNome(request.queryParams("nome"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            p.setDataNascimento(LocalDate.parse(request.queryParams("data"), formatter));
            pessoaDAO.adicionar(p);      
            return "ok";
        });  


        put("/atualizar", (request, response) -> {  
            Pessoa p = new Pessoa();
            p.setId(UUID.fromString(request.queryParams("id")));
            p.setNome(request.queryParams("nome"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            p.setDataNascimento(LocalDate.parse(request.queryParams("data"), formatter));
            pessoaDAO.atualizar(p);      
            return "ok";
        });  
        // atualizar
        // pessoaDAO.atualizar(p);

    }
}