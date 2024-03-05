/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author iapereira
 */
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Expose 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Expose 
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;
    @Expose 
    @Column(name = "nome", nullable = false)
    private String nome;
    @Expose 

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.REMOVE)
    private ArrayList<Dependente> dependentes;
    
     public Pessoa () {
        this.dependentes = new ArrayList<>();
    }
    
    public Pessoa (String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
        this.dependentes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", dependentes=" + dependentes + '}';
    }
    
    
    
    
    
    
}
