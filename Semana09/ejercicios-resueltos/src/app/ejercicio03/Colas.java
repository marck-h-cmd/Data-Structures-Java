/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 * @param <T>
 */
public class Colas<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Colas() {
        primero = null;
        ultimo = null;
    }

    public boolean isEmpty() {
        return primero == null && ultimo == null;
    }

    public void encolar(T valor, int priori) {
        Nodo<T> nuevo = new Nodo(valor, priori);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            Nodo<T> p = primero;

            if (nuevo.getPrioridad() > p.getPrioridad()) {

                nuevo.setSgte(primero);
                primero = nuevo;
            } else {
                while (p.getSgte() != null && nuevo.getPrioridad() < p.getPrioridad())
                    p = p.getSgte();
                

                if (p == ultimo) {
                    ultimo.setSgte(nuevo);
                    ultimo = nuevo;
                } else {
                    nuevo.setSgte(p.getSgte());
                    p.setSgte(nuevo);
                }

            }

        }
    }

    public T frente() {
        if (!isEmpty()) {
            return primero.getInfo();
        }
        return null;
    }

    public T desencolar() {

        if (!isEmpty()) {
            T valor = primero.getInfo();
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSgte();
            }
            return valor;
        }
        return null;
    }

    public void clear() {
        while (primero != null) {
            primero = primero.getSgte();
        }
        ultimo = null;
    }

    public void mostrar(DefaultListModel modelo) {

        modelo.removeAllElements();
        Nodo<T> p = primero;
        while (p != null) {
            modelo.addElement(p.getInfo() + " prioridad: " + p.getPrioridad());
            p = p.getSgte();
        }
    }
}
