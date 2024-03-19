/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.Pessoa;
import negocio.Trabalho;

/**
 *
 * @author iapereira
 */
public class Main {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");
    
    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
      
//        criei um trabalho
//        entityManager.getTransaction().begin();
//        Trabalho trabalho = new Trabalho();
//        trabalho.setDataInicio(LocalDate.now());
//        trabalho.setNome("Trab2");
//        entityManager.persist(trabalho);         
//        entityManager.getTransaction().commit();
//        entityManager.close();

//        criar uma pessoa
//        entityManager.getTransaction().begin();
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("Igor");
//        entityManager.persist(pessoa);         
//        entityManager.getTransaction().commit();
//        entityManager.close();


//        igor trabalha no trab1
//        entityManager.getTransaction().begin();
//        Pessoa pessoa = entityManager.find(Pessoa.class, 1);
//        Trabalho trabalho = entityManager.find(Trabalho.class, 2);
//        trabalho.getFuncionarios().add(pessoa);
//        pessoa.getTrabalhos().add(trabalho);
//        entityManager.merge(pessoa);        
////        entityManager.merge(trabalho); // não precisa colocar merge nos 2 lados       
//        entityManager.getTransaction().commit();
//        entityManager.close();


//        Pessoa pessoa = entityManager.find(Pessoa.class, 1);
//        pessoa.getTrabalhos().forEach(t -> System.out.println(t));


//      igor n trabalha mais no trab2
//        entityManager.getTransaction().begin();
//        Pessoa pessoa = entityManager.find(Pessoa.class, 1);
//        Trabalho trabalho = entityManager.find(Trabalho.class, 2);
//        trabalho.getFuncionarios().remove(pessoa);
//        pessoa.getTrabalhos().remove(trabalho);
//        entityManager.merge(pessoa);        
//        entityManager.merge(trabalho);      
//        entityManager.getTransaction().commit();
//        entityManager.close();   


//      remover trab1
        entityManager.getTransaction().begin();
        Trabalho trabalho = entityManager.find(Trabalho.class, 1);
        entityManager.remove(trabalho);      
        entityManager.getTransaction().commit();
        entityManager.close();     


          
    }
}
