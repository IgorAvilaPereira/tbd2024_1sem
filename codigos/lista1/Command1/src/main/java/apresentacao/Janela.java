/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
class Janela {

    private Command menu1;
    private Command menu2;

    public void setMenu(int i, Command c) {
        if (i == 0) {
            this.menu1 = c;
        }
        else if (i == 1) {
            this.menu2 = c;
        } else {
            throw new IllegalArgumentException("Indice de menu inexistente");

        }
    }

    public void clicouMenu(int i) {
        if (i == 0) {
            this.menu1.execute();
        }
        else if (i == 1) {
            this.menu2.execute();
        } else {
            throw new IllegalArgumentException("Indice de menu inexistente");

        }
    }

}
