/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import java.util.Iterator;
import negocio.Canal;
import negocio.Net;
import negocio.NetIterator;
import negocio.ViaCabo;
import negocio.ViaCaboIterator;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {

        NetIterator netIterator = new NetIterator(new Net());
        ViaCaboIterator viaCaboIterator = new ViaCaboIterator(new ViaCabo());

        imprimeCanais(netIterator);

        imprimeCanais(viaCaboIterator);
    }

    private static void imprimeCanais(Iterator<Canal> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
