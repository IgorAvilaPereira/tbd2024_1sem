/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.Promocao;

/**
 *
 * @author iapereira
 */
public class SemPromocao implements Promocao {

    public SemPromocao() {
    }

    @Override
    public double descontar() {
        return 1.0;
    }
    
}
