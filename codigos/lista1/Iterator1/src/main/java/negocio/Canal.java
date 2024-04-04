/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Canal {
    private String nome;
    private int nro;
    private String descricao;

    public Canal(String nome, int nro, String descricao) {
        this.nome = nome;
        this.nro = nro;
        this.descricao = descricao;
    }

     
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Canal{" + "nome=" + nome + ", nro=" + nro + ", descricao=" + descricao + '}';
    }
    
    
    
    
    
}
