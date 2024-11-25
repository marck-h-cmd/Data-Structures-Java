/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio01;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class ListaSimplementeEnlazada {

    private Nodo L;

    public ListaSimplementeEnlazada() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public Nodo getL() {
        return L;
    }

    public void insertarAlInicio(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }

    public void insertarAlFinal(int x) {
        Nodo nuevo = new Nodo(x);
        if (L == null) {
            L = nuevo;
        } else {
            Nodo p = L;
            while (p.getSgte() != null) {
                p = p.getSgte();
            }
            p.setSgte(nuevo);
        }
    }

    public int contar() {
        int c = 0;
        Nodo p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }

    public Nodo buscar(int dato) {
        Nodo p = L;
        while (p != null) {
            if (p.getEntero() == dato) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }

    public boolean eliminar(int dato) {
        if (L.getEntero() == dato) {
            L = L.getSgte();
            return true;
        } else {
            Nodo ant;
            Nodo p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getEntero() != dato) {
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

    public void eliminarIguales(int dato) {
        Nodo p = L;
        Nodo ant = null;

        while (p != null) {
            if (p.getEntero() == dato) {
                if (ant == null) {
                    L = p.getSgte();
                } else {
                    ant.setSgte(p.getSgte());
                }

            } else {
                ant = p;
            }
            p = p.getSgte();
        }

    }

    public void ordenar() {
        Nodo p;
        Nodo q;
        int aux;
        p = L;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getEntero() > q.getEntero()) {
                    aux = p.getEntero();
                    p.setEntero(q.getEntero());
                    q.setEntero(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }

    public void mostrar(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getEntero());
            p = p.getSgte();
        }
    }

    public void mostrarPares(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            if (p.getEntero() % 2 == 0) {
                modelo.addElement(p.getEntero());
            }
            p = p.getSgte();
        }
    }

    public ListaSimplementeEnlazada returnPares() {
        ListaSimplementeEnlazada resultado = new ListaSimplementeEnlazada();
        Nodo p = L;
        while (p != null) {
            int x = p.getEntero();
            if (x % 2 == 0) {
                resultado.insertarAlFinal(x);
            }

            p = p.getSgte();
        }
        return resultado;

    }

    
     
}
