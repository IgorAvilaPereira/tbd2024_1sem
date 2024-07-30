package mongodb;

import org.bson.types.ObjectId;

public class Movie {
    private ObjectId id;
    private String title;

    public Movie(){
        
    }

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    

    
}
