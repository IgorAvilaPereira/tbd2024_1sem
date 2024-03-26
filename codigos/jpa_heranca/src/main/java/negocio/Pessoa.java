/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.persistence.*;

/**
 *
 * @author iapereira
 */
@Entity
// uma unica tabela
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

// uma tabela por subclasse
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

// uma tabela por classe (incluindo a classe pai)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
@Table(name = "pessoa")
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;  
    @Column(name = "nome", nullable = false)
    protected String nome;

    
    public Pessoa () {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



  
    
    
    
    
    
    
}
