/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author iapereira
 */
@Entity
public class Localizacao implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private double latitude;
    @Column
    private double longitude;

    public Localizacao() {
    }

    public Localizacao(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }
    
    
    
    
    
}
