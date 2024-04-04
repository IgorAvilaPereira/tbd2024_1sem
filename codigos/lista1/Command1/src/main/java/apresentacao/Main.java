/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Documento documento = new Documento("teste.txt", "isso n eh teste não");
        Janela janela = new Janela();

        janela.setMenu(0, new CopiarCommand(documento));
        janela.clicouMenu(0);

        janela.setMenu(1, new ColarCommand(documento));
        janela.clicouMenu(1);

    }
}
