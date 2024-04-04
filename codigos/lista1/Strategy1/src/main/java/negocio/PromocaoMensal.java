/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Random;
import negocio.Promocao;

/**
 *
 * @author iapereira
 */
public class PromocaoMensal implements Promocao {

 

    @Override
    public double descontar() {
            double descontoAleatorio = new Random().nextDouble(0.05, 0.10);
            return 0.9-descontoAleatorio;
    }
    
}
