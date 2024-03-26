/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import negocio.PessoaFisica;
import negocio.PessoaJuridica;
import static spark.Spark.get;

/**
 *
 * @author iapereira
 */
public class MainSpark {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        get("/", (request, response) -> {
            TypedQuery<PessoaFisica> query2 = entityManager.createNamedQuery("PesssoaFisica.buscar", PessoaFisica.class);

            return "<h1 style='color:blue'>"+query2.getResultList().get(0).getNome() + "</h1>";
        });
    }

}
