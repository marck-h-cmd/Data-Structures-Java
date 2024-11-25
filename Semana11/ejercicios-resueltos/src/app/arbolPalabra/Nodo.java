/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.arbolPalabra;

/**
 *
 * @author marck
 */
public class Nodo {

    private Datos info;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo() {
        izquierdo = null;
        derecho = null;
    }

    public Nodo(Datos info) {
        this.info = info;
        izquierdo = null;
        derecho = null;
    }

    public Datos getInfo() {
        return info;
    }

    public void setInfo(Datos info) {
        this.info = info;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    

}
