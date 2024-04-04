/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Iterator;

/**
 *
 * @author iapereira
 */
public class NetIterator implements Iterator<Canal> {
    private Net net;
    private int posicao;
    
    
    
    public NetIterator(Net net){
        this.net = net;
        this.posicao = ((this.net.getVetCanais().size() > 0) ? 0: -1);
    }
    

    @Override
    public boolean hasNext() {
        return this.posicao >= 0 && this.posicao < this.net.getVetCanais().size();
    }

    @Override
    public Canal next() {
        if (this.hasNext()){
            Canal c = this.net.getVetCanais().get(posicao);
            this.posicao++;
            return c;
        }
        return null;
    }
    
}
