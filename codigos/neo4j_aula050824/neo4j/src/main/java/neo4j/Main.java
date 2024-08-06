package neo4j;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.STRING;

import org.neo4j.*;

public class Main {
    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "password"));

        try (Session session = driver.session()) {
            // listar
            // String cypherSearch = "MATCH (p:Person) RETURN p LIMIT 10;";
            // Result result = session.run(cypherSearch);
            // while(result.hasNext()){                
            //     System.out.println(result.next().get("p").get("name"));
            // }

         

            // criar nodo
            // String query  = "CREATE (ee:Person {name: $name, from: $from,  kloutScore: $score})";
            // Map<String, Object> parameters = new HashMap<>();
            // parameters.put("name", "marcos");
            // parameters.put("from", "rio grande");
            // parameters.put("score", "25");           
            // session.run(query, parameters);

            // deletar um novo
            // String query2  = "match(p:Person) where ID(p) = $id DELETE p;";
            // Map<String, Object> parameters2 = new HashMap<>();
            // parameters2.put("id", 176);           
            // session.run(query2, parameters2);

            // criar uma aresta
            String cmdAresta = "MATCH (p1:Person), (p2:Person) where p1.name = \"Igor\" and p2.name = \"geraldo\" CREATE (p1)-[:AMIGO]->(p2)";
            session.run(cmdAresta);



        } finally {
            driver.close();
        }
    }
}