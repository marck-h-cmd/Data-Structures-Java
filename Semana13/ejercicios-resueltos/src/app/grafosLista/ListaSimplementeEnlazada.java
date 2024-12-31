/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.grafosLista;

import app.estructurasReutilizadas.Nodo;
import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class ListaSimplementeEnlazada<T> {

    private Nodo<T> L;

    public ListaSimplementeEnlazada() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public Nodo getL() {
        return L;
    }

    public void insertarAlInicio(T x) {
        Nodo<T> nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }

    public void insertarAlFinal(T x) {
        Nodo<T> nuevo = new Nodo(x);
        if (L == null) {
            L = nuevo;
        } else {
            Nodo<T> p = L;
            while (p.getSgte() != null) {
                p = p.getSgte();
            }
            p.setSgte(nuevo);
        }
    }

    public int contar() {
        int c = 0;
        Nodo<T> p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }

    public Nodo buscar(T dato) {
        Nodo p = L;
        while (p != null) {
            if (p.getInfo() == dato) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }

    public boolean eliminar(T dato) {
        if (L.getInfo() == dato) {
            L = L.getSgte();
            return true;
        } else {
            Nodo ant;
            Nodo p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getInfo() != dato) {
                ant = p;
                p = p.getSgte();
            }
            if (p != null) {
                ant.setSgte(p.getSgte());
                return true;
            } else {
                return false;
            }
        }
    }

    public void mostrar(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getInfo());
            p = p.getSgte();
        }
    }

}
