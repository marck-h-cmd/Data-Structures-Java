/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio0;

/**
 *
 * @author marck
 */
public class Nodo {
      private int info;
    private Nodo sgte;
    private Nodo ant;
    
    public Nodo(int info){
        this.info = info;
        this.sgte = null;
        this.ant = null;
    }

    public Nodo(int info, Nodo sgte, Nodo ant) {
        this.info = info;
        this.sgte = sgte;
        this.ant = ant;
    }

    
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}