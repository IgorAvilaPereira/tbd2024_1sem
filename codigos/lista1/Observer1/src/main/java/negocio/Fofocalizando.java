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
public class Fofocalizando implements EntidadeObservavel {
    private ArrayList<Fofoca> vetFofoca;
    private ArrayList<Observer> vetObserver;
    
    public Fofocalizando(){
        this.vetFofoca = new ArrayList<>();
        this.vetObserver = new ArrayList<>();
    }

    public void adicionaFofoca(Fofoca fofoca){
        this.vetFofoca.add(fofoca);
        this.notifyObserver();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        this.vetObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.vetObserver.remove(observer);
    }

    @Override
    public void removeObserver(int i) {
        this.vetObserver.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < vetObserver.size(); i++) {
            if (this.vetFofoca.size() >= 1) { 
                this.vetObserver.get(i).update(this.vetFofoca.get(this.vetFofoca.size() - 1));
            } else {
                this.vetObserver.get(i).update(this.vetFofoca.get(0));
            }
        }
    }
    
    
    
    
    
}
