/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;


/**
 *
 * @author marck
 */
public class Nodo {
     private int valor;
    private Nodo ant;
    private Nodo sgte;

    public Nodo(int x) {
        valor = x;
    }

    public Nodo(int x, Nodo ant, Nodo sgte) {
        valor = x;
        this.ant = ant;
        this.sgte = sgte;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
}
