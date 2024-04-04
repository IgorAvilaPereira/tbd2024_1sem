/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Random;

/**
 *
 * @author iapereira
 */
public abstract class Frete {

    private double distancia;
    private Produto produto;
    private String mesDaCompra;

    public Frete(double distancia, Produto produto, String mesDaCompra) {
        this.distancia = distancia;
        this.produto = produto;
        this.mesDaCompra = mesDaCompra;
    }
    
    

    /// templateMethod
    public final double calcularFrete() {
        return calculaModalidade(this) + fretePeloPeso(produto) + desconto();
    }

    // parte mutavel => abstract
    protected abstract double calculaModalidade(Frete frete);

    
    private double fretePeloPeso(Produto produto) {
        return this.produto.getPeso();
    }

    private double desconto() {
        switch (mesDaCompra) {
            case "janeiro":
                return 0.9;
            case "fevereiro":
                return 0.5;
            default:
                return 1;
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getMesDaCompra() {
        return mesDaCompra;
    }

    public void setMesDaCompra(String mesDaCompra) {
        this.mesDaCompra = mesDaCompra;
    }

    
}
