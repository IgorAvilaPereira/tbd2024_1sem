/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.TarefaDAO;
import static spark.Spark.get;

/**
 *
 * @author iapereira
 */
public class MainSpark {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");

    public static void main(String[] args) {
        get("/", (req, res) ->  new TarefaDAO(entityManagerFactory).listarJSON());
        get("view/:id", (req, res) ->  new TarefaDAO(entityManagerFactory).visualizar(Integer.parseInt(req.params(":id"))));
        // delete
        get("/:id", (req, res) ->  new TarefaDAO(entityManagerFactory).remover(Integer.parseInt(req.params(":id"))));
    }
    
}
