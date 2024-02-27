/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import com.google.gson.Gson;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import negocio.Tarefa;

/**
 *
 * @author iapereira
 */
public class TarefaDAO {

    private final EntityManager entityManager;
    private final Gson gson;

    public TarefaDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
        this.gson = new Gson();
    }

    public List<Tarefa> listar() {

        entityManager.getTransaction().begin();
        List<Tarefa> vetTarefa = entityManager.createQuery("SELECT t FROM Tarefa t").getResultList();
        entityManager.getTransaction().commit();
        return vetTarefa;

//        for (int i = 0; i < vetTarefa.size(); i++) {
//            System.out.println(vetTarefa.get(i));            
//        }
    }
    
    public String listarJSON(){
        List<Tarefa> vetTarefa = this.listar();
        return this.gson.toJson(vetTarefa);
        
    }

    public void adicionar(Tarefa tarefa) {
        entityManager.getTransaction().begin();
        entityManager.persist(tarefa);
        entityManager.getTransaction().commit();
    }

    public boolean remover(int id) {
        try {
            entityManager.getTransaction().begin();
            Tarefa tarefa = entityManager.find(Tarefa.class, id);
            entityManager.remove(tarefa);
            entityManager.getTransaction().commit();
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public String visualizar(int id) {
           try {
            entityManager.getTransaction().begin();
            Tarefa tarefa = entityManager.find(Tarefa.class, id);
            entityManager.getTransaction().commit();
            return this.gson.toJson(tarefa);
        } catch(Exception e){
            return this.gson.toJson(new Tarefa());
        }
    }

}
