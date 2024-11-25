/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class ListaCircular {

    Nodo L;

    public ListaCircular() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public void inserta(int x) {
        Nodo nuevo = new Nodo(x);

        if (L == null) {
            L = nuevo;
            nuevo.setSgte(L);
        } else {
            nuevo.setSgte(L.getSgte());
            L.setSgte(nuevo);
            L = nuevo;
        }
    }

    public Nodo buscar(int x) {
        if (esVacia()) {
            return null;
        } else {
            Nodo p = L.getSgte();
            do {
                if (p.getInfo() == x) {
                    return p;
                } else {
                    p = p.getSgte();
                }

            } while (p != L.getSgte());
            return null;
        }
    }

    public int contar() {
        if (esVacia()) {
            return 0;
        } else {
            Nodo p = L.getSgte();
            int c = 0;

            do {
                c++;
                p = p.getSgte();
            } while (p != L.getSgte());
            return c;

        }

    }

    public boolean eliminar(int x) {

        if (esVacia()) {
            return false;
        } else {
            Nodo p = L.getSgte();
            if (p.getInfo() == x) {
                if (p == p.getSgte()) {
                    L = null;
                } else {
                    L.setSgte(p.getSgte());
                }
                return true;
            } else {
                Nodo ant = p;
                p = p.getSgte();
                do {
                    if (p.getInfo() != x) {
                        ant = p;
                        p = p.getSgte();
                    }

                } while (p != L.getSgte());
                if (p == L.getSgte()) {
                    return false;
                } else {
                    ant.setSgte(p.getSgte());
                    if (p == L) {
                        L = ant;
                    }
                    return true;
                }
            }
        }
    }

    public void eliminarDuplicado() {
        if (!esVacia()) {

            Nodo p = L.getSgte();
            Nodo q;

            do {

                q = p;
                while (p != q.getSgte()) {
                    if (p.getInfo() == q.getSgte().getInfo()) {
                        q.setSgte(q.getSgte().getSgte());

                    } else {
                        q = q.getSgte();
                    }

                }
                p = p.getSgte();
            } while (p != L.getSgte());
        }
    }

    public void insercionOrdenada(int x) {
        Nodo nuevo = new Nodo(x);

        if (esVacia()) {
            L = nuevo;
            nuevo.setSgte(L);
        } else {
            Nodo ant;
            Nodo p;
            if (nuevo.getInfo() <= L.getSgte().getInfo()) {
                nuevo.setSgte(L.getSgte());
                L.setSgte(nuevo);
            } else {
                ant = L.getSgte();
                p = ant.getSgte();
                do {
                    if (ant.getInfo() < nuevo.getInfo() && p.getInfo() >= nuevo.getInfo()) {
                        nuevo.setSgte(p);
                        ant.setSgte(nuevo);
                    }
                    ant = ant.getSgte();
                    p = p.getSgte();
                } while (p != L.getSgte());
                if (nuevo.getInfo() > L.getInfo()) {
                    nuevo.setSgte(L.getSgte());
                    L.setSgte(nuevo);
                    L = nuevo;
                }
            }

        }

    }

    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        if (!esVacia()) {
            Nodo p = L.getSgte();
            do {
                modelo.addElement(p.getInfo());
                p = p.getSgte();
            } while (p != L.getSgte());
        }
    }

    public void ordenar() {
        Nodo p = L.getSgte();
        Nodo q;
        int aux;

        if (p == null || p.getSgte() == null) {
            return;
        }

        do {
            q = p.getSgte();
            do {
                if (p.getInfo() > q.getInfo()) {
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSgte();
            } while (q != L.getSgte());
            p = p.getSgte();
        } while (p != L);
    }
}
