/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

/**
 *
 * @author marck
 * @param <T>
 */
public class Nodo<T> {

    private T info;
    private Nodo<T> sgte;
    private int prioridad;

    public Nodo() {
    }

    public Nodo(T info) {
        this.info = info;
    }

    public Nodo(T info, int prioridad) {
        this.info = info;
        sgte = null;
        this.prioridad = prioridad;
    }
    
  
    public Nodo(T info, Nodo<T> sgte) {
        this.info = info;
        this.sgte = sgte;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getSgte() {
        return sgte;
    }

    public void setSgte(Nodo<T> sgte) {
        this.sgte = sgte;
    }
}
