package mongodb;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {

        // relação entre consultas sql e como escrever isso no Mongodb
        // https://www.mongodb.com/docs/manual/reference/sql-comparison/

        //  exemplos de "group by" mais avançados
        // https://mongodb.com/docs/manual/core/aggregation-pipeline/


        // exemplo usando a classe Document
        String uri = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("exemplo");
            MongoCollection<Document> collection = database.getCollection("movies");
            // exemplo de select all
            MongoCursor<Document> iterator = collection.find(eq("duracao", 100)).iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next().toJson());
            }
            
            
            // exemplo de select
            // Document doc = collection.find(eq("title", "x-men")).first();
            // exemplo de update     
            // collection.updateOne(doc, set("title", "x-men2"));


            // collection.updateOne(eq("title", "Ski Bloopers"), doc);

            // exemplo de insert
            // Document docNovo = new Document();
            // docNovo.put("title", "agora vai");
            // collection.insertOne(docNovo);

            // exemplo de delete
            // collection.deleteOne(eq("title", "agora vai"));
            

            // if (doc != null) {
                
            //     System.out.println(doc.toJson());
            // } else {
            //     System.out.println("No matching documents found.");

            // }
        }
    }
}