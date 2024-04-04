/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Produto {
    protected String nome;
    protected double preco;
    
    protected Promocao p;

    public Produto(String nome, double preco, Promocao p) {
        this.nome = nome;
        this.preco = preco;
        this.p = p;
    }
    
    

    public void setPromocao(Promocao p) {
        this.p = p;
    }
    
    public double calcPreco(){
        return this.p.descontar() * this.preco;
    }
    
    
    
    
    
}
