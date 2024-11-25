/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicioBicola;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 * @param <T>
 */
public class Bicolas<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Bicolas() {
        primero = null;
        ultimo = null;
    }

    public boolean isEmpty() {
        return primero == null && ultimo == null;
    }

    public void encolarAlFinal(T valor) {
        Nodo<T> nuevo = new Nodo(valor);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }

    public void encolarAlInicio(T valor) {
        Nodo<T> nuevo = new Nodo(valor);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(primero);
            primero = nuevo;
        }
    }

    public T ultimo() {
        if (!isEmpty()) {
            return ultimo.getInfo();
        }
        return null;
    }

    public T frente() {
        if (!isEmpty()) {
            return primero.getInfo();
        }
        return null;
    }

    public T desencolarAlInicio() {

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

    public T desencolarAlFinal() {

        if (!isEmpty()) {
            T valor = ultimo.getInfo();
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                Nodo<T> p = primero;
                while (p.getSgte() != ultimo)
                    p = p.getSgte();
                
                p.setSgte(null);
                ultimo = p;
            }
            return valor;
        }
        return null;
    }
    
     public void mostrar(DefaultListModel modelo) {

        modelo.removeAllElements();
        Nodo<T> p = primero;
        while (p != null) {
            modelo.addElement(p.getInfo());
            p = p.getSgte();
        }
    }

}
