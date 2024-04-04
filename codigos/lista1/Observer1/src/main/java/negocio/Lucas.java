/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Lucas implements Observer {

    @Override
    public void update(Fofoca fofocaNova) {
        System.out.println("Recebi a fofoca...Estou lendo...espero que seja do Leo Dias.");
        System.out.println(fofocaNova);
    }
    
}
