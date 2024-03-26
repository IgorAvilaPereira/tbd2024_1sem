/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import negocio.PessoaFisica;
import negocio.PessoaJuridica;

/**
 *
 * @author iapereira
 */
public class Main {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//      adicionando uma pessoa fisica e uma pessoa juridica
        entityManager.getTransaction().begin();
        PessoaFisica pessoaFisica = new PessoaFisica("iGOR", "11111111111");
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Igor corp");
        pessoaJuridica.setCnpj("12121211");
        entityManager.persist(pessoaFisica);
        entityManager.persist(pessoaJuridica);
        entityManager.getTransaction().commit();

        // obtendo uma pessoa fisica
        PessoaFisica pessoa = entityManager.find(PessoaFisica.class, 1);
        System.out.println(pessoa.getCpf());

        // listando todas as pessoas juridicas
        String jpsql = "SELECT p FROM PessoaJuridica p";
        TypedQuery<PessoaJuridica> query = entityManager.createQuery(jpsql, PessoaJuridica.class);
        PessoaJuridica companhia = query.getResultList().get(0);

//        listando todas as pessoas fisicas
        TypedQuery<PessoaFisica> query2 = entityManager.createNamedQuery("PesssoaFisica.buscar", PessoaFisica.class);
        System.out.println("ok"+query2.getResultList().get(0).getNome());
        
//      atualizando
        entityManager.getTransaction().begin();        
        companhia.setNome("novo nome");
        entityManager.merge(companhia);
        entityManager.getTransaction().commit();
        
        
//        deletando
        entityManager.getTransaction().begin();        
        entityManager.remove(companhia);
        entityManager.getTransaction().commit();
        
        
        
    }
}
