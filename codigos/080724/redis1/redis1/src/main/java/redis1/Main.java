package redis1;


import java.util.Iterator;

import com.google.gson.Gson;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Main {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6379);
        Gson gson = new Gson();

        try (Jedis jedis = pool.getResource()) {
            jedis.select(0);
        
            // salvar
            // Pessoa p = new Pessoa();
            // p.setNome("Igor");
            // jedis.set(p.getId().toString(), gson.toJson(p));

            // atualizar
            // String conteudo = jedis.get("32ea6894-f58c-45da-9f30-e77ab0c78e9d");
            // Pessoa p2 = gson.fromJson(conteudo, Pessoa.class);
            // p2.setNome("joao");
            // jedis.set(p2.getId().toString(), gson.toJson(p2));

            // deletar
            // jedis.del("clientName");

            // listar todos
            Iterator<String> iterator = jedis.keys("*").iterator();
            while(iterator.hasNext()){
                String key = iterator.next();
                System.out.println(key+":"+jedis.get(key));
            }
        }
    }
}