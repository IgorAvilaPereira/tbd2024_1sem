/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

/**
 *
 * @author iapereira
 */
@Entity
@DiscriminatorValue(value = "PessoaFisica")
@NamedQuery(name = "PesssoaFisica.buscar", query = "SELECT p FROM PessoaFisica p")
public class PessoaFisica extends Pessoa {
   
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;  

    public PessoaFisica() {
    }
    
    public PessoaFisica(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
