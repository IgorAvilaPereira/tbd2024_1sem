/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Net {
    public ArrayList<Canal> vetCanais;
    
    public Net(){
        this.vetCanais = new ArrayList<>();
        this.vetCanais.add(new Canal("CartoonNetwork", 46, "canal de desenho"));
        
               
    }

    public ArrayList<Canal> getVetCanais() {
        return vetCanais;
    }

    public void setVetCanais(ArrayList<Canal> vetCanais) {
        this.vetCanais = vetCanais;
    }
    
    
    
}
