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

    public void insertarAlInicio(float x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }

    public void insertarAlFinal(float x) {
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

    public Nodo buscar(float dato) {
        Nodo p = L;
        while (p != null) {
            if (p.getReal() == dato) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }

    public boolean insertarPosicion(float valor, int pos) {
        int n = contar();
        if (pos <= n && pos>=0) {

            Nodo nuevo = new Nodo(valor);

            if (pos == 0) {
                nuevo.setSgte(L);
                L = nuevo;               
            } else {

                Nodo p = L;
                while (--pos != 0) {
                    p = p.getSgte();
                }
                nuevo.setSgte(p.getSgte());
                p.setSgte(nuevo);              
            }
            return true;
        }
        return false;

    }

    public boolean suprimirElementoN(int pos) {
        int n = contar();
        if (pos <= n && pos>=0) {

            if (pos == 0) {

                L = L.getSgte();
            } else {
                
                Nodo ant, p;
                ant = L;
                p = L.getSgte();
                while (--pos != 0) {
                    ant = p;
                    p = p.getSgte();
                }
                ant.setSgte(p.getSgte());             
            }
               return true;
        }
        return false;
    }

    public boolean esAscendente() {
        Nodo p, q;
        p = L;

        while (p.getSgte() != null) {

            q = p.getSgte();
            while (q != null) {
                if (p.getReal() > q.getReal()) {
                    return false;
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
        return true;
    }

    public void invertirLista() {
        int n = contar() - 2;
        int c, d;
        c = 0;
        d = 0;
        Nodo p = L;
        Nodo q;
        float aux;
        while (p.getSgte() != null) {
            q = p.getSgte();
            c = d;
            while (q != null) {
                if (c == n) {
                    aux = p.getReal();
                    p.setReal(q.getReal());
                    q.setReal(aux);

                }
                c++;
                q = q.getSgte();
                System.out.print(p.getReal() + " ");
            }
            p = p.getSgte();
            d++;
            n--;

        }

    }

    public void eliminarIguales(float dato) {
        Nodo p = L;
        Nodo ant = null;

        while (p != null) {
            if (p.getReal() == dato) {
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

    public ListaSimplementeEnlazada getNultimos(int n) {
        ListaSimplementeEnlazada list = new ListaSimplementeEnlazada();
        int i = contar() - n;

        Nodo p = L;
        Nodo q;
        if (contar() > n || (n > 0 && i > 0)) {
            int c = 0;

            while (p.getSgte() != null) {
                q = p.getSgte();
                c++;
                if (c == i) {
                    while (q != null) {

                        list.insertarAlFinal(q.getReal());
                        q = q.getSgte();
                    }
                }

                p = p.getSgte();
            }

        } else {
            while (p != null) {
                list.insertarAlFinal(p.getReal());
                p = p.getSgte();
            }

        }

        return list;
    }

    public boolean sonIguales(ListaSimplementeEnlazada list2) {

        int c1 = contar();
        int c2 = list2.contar();

        if (c1 != c2) {

            return false;
        } else {
            Nodo p = L;
            Nodo q = list2.getL();
            while (p != null) {

                if (p.getReal() != q.getReal()) {
                    return false;
                }
                p = p.getSgte();
                q = q.getSgte();

            }
            return true;

        }
    }

    private float recursiveSum(Nodo p) {

        if (p == null) {
            return 0;
        } else {
            return p.getReal() + recursiveSum(p.getSgte());
        }
    }

    public float sumaRecursiva() {
        return recursiveSum(L);
    }

    public void mostrar(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getReal());
            p = p.getSgte();
        }
    }
}
