/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author iapereira
 */

@Entity
public class Tarefa implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String descricao;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Localizacao localizacao;
    
    public Tarefa(){
        this.localizacao = new Localizacao();
        
    }

    public Tarefa(String descricao, Localizacao localizacao) {
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", descricao=" + descricao + ", localizacao=" + localizacao + '}';
    }
   
    
    
    
    
    
    
    
}
