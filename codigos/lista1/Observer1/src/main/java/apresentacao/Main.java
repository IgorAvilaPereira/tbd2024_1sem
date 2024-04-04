/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import java.time.LocalDateTime;
import negocio.Fofoca;
import negocio.Fofocalizando;
import negocio.Katiane;
import negocio.Lucas;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Fofocalizando fofocalizando = new Fofocalizando();
        fofocalizando.registerObserver(new Lucas());
        fofocalizando.registerObserver(new Katiane());
        
        fofocalizando.adicionaFofoca(new Fofoca("Luísa Sonza é flagrada aos beijos com bailarina; Veja o vídeo!", "Luísa Sonza foi flagrada aos beijos com a bailarina Mariana Maciel, que compõe o balé da cantora há um ano", "Leo Dias", LocalDateTime.of(2023, 10, 17, 20, 0, 0)));
    }
}
