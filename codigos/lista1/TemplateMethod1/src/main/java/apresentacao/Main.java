/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Produto;
import negocio.Sedex;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Produto dvdHanson = new Produto();
        dvdHanson.setNome("dvd do hanson");
        dvdHanson.setPeso(2);
        dvdHanson.setPreco(10);
        
        Sedex sedex = new Sedex(3000, dvdHanson, "janeiro");
        System.out.println(sedex.calcularFrete());
    }
}
