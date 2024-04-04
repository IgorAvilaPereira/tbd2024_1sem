/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDateTime;

/**
 *
 * @author iapereira
 */
public class Fofoca {
    
    private String manchete;
    private String texto;
    private String autor;
    private LocalDateTime dataTime;

    public Fofoca(String manchete, String texto, String autor, LocalDateTime dataTime) {
        this.manchete = manchete;
        this.texto = texto;
        this.autor = autor;
        this.dataTime = dataTime;
    }
    
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchete) {
        this.manchete = manchete;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    @Override
    public String toString() {
        return "Fofoca{" + "manchete=" + manchete + ", texto=" + texto + ", autor=" + autor + ", dataTime=" + dataTime + '}';
    }

   
    
    
    
}
