/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio02;

/**
 *
 * @author marck
 */
public class Nodo {

    private Producto info;
    private Nodo sgte;

    public Nodo() {
        sgte = null;
    }

    public Nodo(Producto x, Nodo sig) {
        info = x;
        sgte = sig;
    }

    public Nodo(Producto producto) {
        info = producto;
        sgte = null;
    }

    public Producto getInfo() {
        return info;
    }

    public void setInfo(Producto info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

}
