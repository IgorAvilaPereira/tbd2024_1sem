/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.Dependente;
import negocio.Pessoa;

/**
 *
 * @author iapereira
 */
public class Main {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Pessoa igor = new Pessoa("222", "Igor");
        entityManager.persist(igor);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        Pessoa p = entityManager.find(Pessoa.class, 1);
//        
        Dependente igorJr = new Dependente();
        igorJr.setNome("IgorJr.");
        igorJr.setPessoa(p);

        p.getDependentes().add(igorJr);
//        
        entityManager.persist(igorJr);

        entityManager.getTransaction().commit();

        Pessoa p2 = entityManager.find(Pessoa.class, 1);

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        System.out.println(gson.toJson(p2));
        
        System.out.println(p2);

    }
}
