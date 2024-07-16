package redis1;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class PessoaDAO {

    private Gson gson;
    private JedisPool pool;

    public PessoaDAO(JedisPool pool, Gson gson) {
        this.pool = pool;
        this.gson = gson;
    }

    public void adicionar(Pessoa p) {
        try (Jedis jedis = pool.getResource()) {
            jedis.select(0);
            jedis.set(p.getId().toString(), gson.toJson(p));
        }
    }

    public void atualizar(Pessoa p) {
        try (Jedis jedis = pool.getResource()) {
            jedis.select(0);
            jedis.set(p.getId().toString(), gson.toJson(p));
        }
    }

    public void deletar(String key) {
        try (Jedis jedis = pool.getResource()) {
            jedis.select(0);
            jedis.del(key);
        }
        
    }

    public ArrayList<Pessoa> listar() {
        ArrayList<Pessoa> vetPessoa = new ArrayList<>();
        try (Jedis jedis = pool.getResource()) {
            Iterator<String> iterator = jedis.keys("*").iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                vetPessoa.add(gson.fromJson(jedis.get(key), Pessoa.class)); 
            }
        }
        return vetPessoa;
    }

}
