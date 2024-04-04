/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Sedex extends Frete {

    public Sedex(double distancia, Produto produto, String mesDaCompra) {
        super(distancia, produto, mesDaCompra);
    }

    @Override
    protected double calculaModalidade(Frete frete) {
        return 100+frete.getDistancia();
    }
    
}
