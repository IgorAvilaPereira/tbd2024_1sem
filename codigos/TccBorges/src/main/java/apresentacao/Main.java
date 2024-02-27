/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import persistencia.TarefaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.Localizacao;
import negocio.Tarefa;

/**
 *
 * @author iapereira
 */
public class Main {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        new TarefaDAO(entityManagerFactory).listar().forEach(p -> System.out.println(p));
        
        new TarefaDAO(entityManagerFactory).adicionar(new Tarefa("tarefa", new Localizacao(21,21)));


//      inserindo uma tarefa e sua localizacao
//        entityManager.getTransaction().begin();
//        Tarefa primeiraTarefa = new Tarefa();
//        primeiraTarefa.setDescricao("Primeira tarefa do tcc do borges");
//        primeiraTarefa.setLocalizacao(new Localizacao(32, 45));
//        entityManager.persist(primeiraTarefa);
//        entityManager.getTransaction().commit();
//        
//        entityManager.getTransaction().begin();
//        Tarefa segundaTarefa = new Tarefa();
//        segundaTarefa.setDescricao("Segunda tarefa do tcc do borges");
//        segundaTarefa.setLocalizacao(new Localizacao(15, 15));
//        entityManager.persist(segundaTarefa);
//        entityManager.getTransaction().commit();

//      obtendo a tarefa 1 (juntamente com a sua localizacao
//        entityManager.getTransaction().begin();
//        Tarefa tarefa = entityManager.find(Tarefa.class, 1);
//        entityManager.getTransaction().commit();        
//        System.out.println(tarefa);

//       atualizando alguma informacao da tupla 1
//        entityManager.getTransaction().begin();
//        Tarefa tarefa = entityManager.find(Tarefa.class, 1);
//        tarefa.setDescricao("descricao modificada");
//        entityManager.merge(tarefa);
//        entityManager.getTransaction().commit();        
//        System.out.println(tarefa);


//      remove a tupla 1
//        entityManager.getTransaction().begin();
//        Tarefa tarefa = entityManager.find(Tarefa.class, 1);
//        entityManager.remove(tarefa);
//        entityManager.getTransaction().commit();
//        System.out.println(tarefa);

//        entityManager.getTransaction().begin();
//        List<Tarefa> vetTarefa = entityManager.createQuery("SELECT t FROM Tarefa t").getResultList();
//        entityManager.getTransaction().commit();
//        
//        for (int i = 0; i < vetTarefa.size(); i++) {
//            System.out.println(vetTarefa.get(i));            
//        }

        

    }
}
