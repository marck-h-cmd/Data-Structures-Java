/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.reutilizar;

/**
 *
 * @author marck
 * @param <T>
 */
public class Nodo<T> {

    private T info;
    private Nodo sgte;

    public Nodo() {
    }

    public Nodo(T info) {
        this.info = info;
    }

    public Nodo(T info, Nodo sgte) {
        this.info = info;
        this.sgte = sgte;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
}
