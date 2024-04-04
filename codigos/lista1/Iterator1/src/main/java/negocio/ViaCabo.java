/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ViaCabo {
    private Canal vetCanais[];
    
    public ViaCabo(){
        this.vetCanais = new Canal[2];
        this.vetCanais[0] = new Canal("Fox", 200, "filmes e séries");
        this.vetCanais[1] = new Canal("UNiversalCHannel", 58, "filmes e  séries");
    }

    public Canal[] getVetCanais() {
        return vetCanais;
    }

    public void setVetCanais(Canal[] vetCanais) {
        this.vetCanais = vetCanais;
    }
    
    
    
}
