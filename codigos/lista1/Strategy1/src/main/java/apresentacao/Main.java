/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.PromocaoMensal;
import negocio.PromocaoKatiane;
import negocio.SemPromocao;
import negocio.Dvd;
import negocio.Liquidacao;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Dvd dvdHanson = new Dvd("Hanson Mbop", 2.00, new Liquidacao());
//        System.out.println(dvdHanson.calcPreco());
//        dvdHanson.setPromocao(new SemPromocao());
//        System.out.println(dvdHanson.calcPreco());
//
//        dvdHanson.setPromocao(new PromocaoKatiane());
//        System.out.println(dvdHanson.calcPreco());

        dvdHanson.setPromocao(new PromocaoMensal());
        System.out.println(dvdHanson.calcPreco());
        System.out.println(dvdHanson.calcPreco());
        System.out.println(dvdHanson.calcPreco());
        System.out.println(dvdHanson.calcPreco());

    }
}
