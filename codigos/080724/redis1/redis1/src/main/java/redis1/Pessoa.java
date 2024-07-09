package redis1;

import java.util.UUID;

public class Pessoa {
    private UUID id;
    private String nome;

    public Pessoa(){
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    
    
}
