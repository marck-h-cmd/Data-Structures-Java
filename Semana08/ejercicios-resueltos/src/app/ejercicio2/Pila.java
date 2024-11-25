/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio2;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class Pila<T> {

    private T[] lista;
    private int n;

    public T[] getLista() {
        return lista;
    }

    public Pila() {
        lista = (T[]) new Object[20];
        n = 0;
    }

    public Pila(int limite) {
        lista = (T[]) new Object[limite];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void setLista(T[] lista) {
        this.lista = lista;
    }

    public int getN() {
        return n;
    }

    public void push(T v) {
        if (n < lista.length) {
            lista[n++] = v;
        }

    }

    public T top() {
        return lista[n - 1];
    }

    public T pop() {

        T cima = lista[n - 1];
         n--;
        return cima;

    }

    public void clear() {
        n = 0;
    }

    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();

        for (int i = n - 1; i >= 0; i--) {
            modelo.addElement(lista[i]);
        }
    }

}
