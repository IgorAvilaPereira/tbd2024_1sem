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
public class ViaCaboIterator implements Iterator<Canal> {
    private ViaCabo viaCabo;
    private int posicao;
    
    public ViaCaboIterator (ViaCabo viaCabo){
        this.viaCabo = viaCabo;
        this.posicao = ((this.viaCabo.getVetCanais().length > 0) ? 0: -1);
    }

   @Override
    public boolean hasNext() {
        return this.posicao >= 0 && this.posicao < this.viaCabo.getVetCanais().length;
    }

    @Override
    public Canal next() {
        if (this.hasNext()){
            Canal c = this.viaCabo.getVetCanais()[posicao];
            this.posicao++;
            return c;
        }
        return null;
    }
    
}
