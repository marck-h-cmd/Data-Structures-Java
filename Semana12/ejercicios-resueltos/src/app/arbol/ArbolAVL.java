/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.arbol;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class ArbolAVL {

    private Nodo raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private Nodo insertar(Nodo root, int valor) {
        if (root == null) {
            root = new Nodo(valor);
        }

        if (root.getInfo() == valor) {
            return root;
        }

        if (valor < root.getInfo()) {
            root.setIzquierdo(insertar(root.getIzquierdo(), valor));
        } else if (valor > root.getInfo()) {
            root.setDerecho(insertar(root.getDerecho(), valor));
        } else {
            return root;
        }

        int balance = getBalance(root);

        if (balance > 1 && valor < root.getIzquierdo().getInfo()) {
            return rotarDerecha(root);
        }

        if (balance < -1 && valor > root.getDerecho().getInfo()) {
            return rotarIzquierda(root);
        }

        if (balance > 1 && valor > root.getIzquierdo().getInfo()) {
            root.setIzquierdo(rotarIzquierda(root.getIzquierdo()));
            return rotarDerecha(root);
        }

        if (balance < -1 && valor < root.getDerecho().getInfo()) {
            root.setDerecho(rotarDerecha(root.getDerecho()));
            return rotarIzquierda(root);
        }

        return root;
    }

    private int getAltura(Nodo r) {
        int alturaIzquierda, alturaDerecha;
        if (r == null) {
            return 0;
        }

        alturaIzquierda = getAltura(r.getIzquierdo());
        alturaDerecha = getAltura(r.getDerecho());

        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda + 1;
        } else {
            return alturaDerecha + 1;
        }

    }

    private Nodo rotarDerecha(Nodo y) {
        Nodo x = y.getIzquierdo();
        Nodo t = x.getDerecho();

        x.setDerecho(y);
        y.setIzquierdo(t);

        return x;
    }

    private Nodo rotarIzquierda(Nodo x) {
        Nodo y = x.getDerecho();
        Nodo t = y.getIzquierdo();

        y.setIzquierdo(x);
        x.setDerecho(t);

        return y;
    }

    private int getBalance(Nodo r) {
        if (r == null) {
            return 0;
        }
        return getAltura(r.getIzquierdo()) - getAltura(r.getDerecho());
    }

    private void traversePreOrden(Nodo root, DefaultListModel modelo) {

        if (root != null) {
            modelo.addElement(root.getInfo());
            traversePreOrden(root.getIzquierdo(), modelo);
            traversePreOrden(root.getDerecho(), modelo);
        }

    }

    public void traversePreOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        traversePreOrden(raiz, modelo);
    }

    private void traversePostOrden(Nodo root, DefaultListModel modelo) {
        if (root != null) {
            traversePostOrden(root.getIzquierdo(), modelo);
            traversePostOrden(root.getDerecho(), modelo);
            modelo.addElement(root.getInfo());
        }

    }

    public void traversePostOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        traversePostOrden(raiz, modelo);
    }

    private void traverseOrden(Nodo root, DefaultListModel modelo) {

        if (root != null) {
            traverseOrden(root.getIzquierdo(), modelo);
            modelo.addElement(root.getInfo());
            traverseOrden(root.getDerecho(), modelo);
        }

    }

    public void traverseOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        traverseOrden(raiz, modelo);
    }

    private Nodo eliminar(Nodo r, int x) {

        if (r == null) {
            return r;
        }

        if (x < r.getInfo()) {
            r.setIzquierdo(eliminar(r.getIzquierdo(), x));
        } else if (x > r.getInfo()) {
            r.setDerecho(eliminar(r.getDerecho(), x));
        } else {
            if (r.getIzquierdo() == null) {
                return r.getDerecho();
            } else if (r.getDerecho() == null) {
                return r.getIzquierdo();
            } else {
                int min = buscarMin(r.getDerecho());
                r.setInfo(min);
                r.setDerecho(eliminar(r.getDerecho(), min));
            }
        }

        int balance = getBalance(r);

        if (balance > 1 && x < getBalance(r.getIzquierdo())) {
            return rotarDerecha(r);
        }

        if (balance < -1 && x > getBalance(r.getDerecho())) {
            return rotarIzquierda(r);
        }

        if (balance > 1 && x > getBalance(r.getIzquierdo())) {
            r.setIzquierdo(rotarIzquierda(r.getIzquierdo()));
            return rotarDerecha(r);
        }

        if (balance < -1 && x < getBalance(r.getDerecho())) {
            r.setDerecho(rotarDerecha(r.getDerecho()));
            return rotarIzquierda(r);
        }
        return r;
    }

    public void eliminar(int x) {
        raiz = eliminar(raiz, x);
    }

    private int buscarMin(Nodo r) {
        if (r.getIzquierdo() == null) {
            return r.getInfo();
        } else {
            return buscarMin(r.getIzquierdo());
        }
    }

    public int buscarMin() {
        return buscarMin(raiz);
    }

    public int buscarMax() {
        return buscarMax(raiz);
    }

    public int getAltura() {
        return getAltura(raiz);
    }

    private int buscarMax(Nodo r) {
        if (r.getDerecho() == null) {
            return r.getInfo();
        } else {
            return buscarMax(r.getDerecho());
        }
    }

    private int contar(Nodo r) {
        if (r == null) {
            return 0;
        } else {
            return 1 + contar(r.getIzquierdo()) + contar(r.getDerecho());
        }
    }

    private int sumar(Nodo r) {
        if (r == null) {
            return 0;
        } else {
            return r.getInfo() + sumar(r.getIzquierdo()) + sumar(r.getDerecho());
        }
    }

    public int sumar() {
        return sumar(raiz);
    }

    public int contar() {
        return contar(raiz);
    }

    private Nodo busqueda(Nodo r, int x) {
        if (r == null || r.getInfo() == x) {
            return r;
        }

        if (x > r.getInfo()) {
            return busqueda(r.getDerecho(), x);
        } else {
            return busqueda(r.getIzquierdo(), x);
        }

    }

    public Nodo busqueda(int valor) {
        return busqueda(raiz, valor);
    }

    private int getProfundidadNodo(Nodo r, int x) {
        int dist = 0;

        if (r == null) {
            return 0;
        }

        if (r.getInfo() == x) {
            return dist + 1;
        }
        dist = getProfundidadNodo(r.getDerecho(), x);
        if (dist > 0) {
            return dist + 1;
        }
        dist = getProfundidadNodo(r.getIzquierdo(), x);
        if (dist > 0) {
            return dist + 1;
        }

        return dist;
    }

    public int getProfundidadNodo(int valor) {
        return getProfundidadNodo(raiz, valor);
    }

    private int getAlturaNodo(Nodo r, int x) {
        int alturaIzquierda, alturaDerecha;
        r = busqueda(r, x);

        if (r == null) {
            return 0;
        }
        alturaIzquierda = getAltura(r.getIzquierdo());
        alturaDerecha = getAltura(r.getDerecho());

        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda + 1;
        } else {
            return alturaDerecha + 1;
        }
    }

    public int getAlturaNodo(int valor) {
        return getAlturaNodo(raiz, valor);
    }

    public String mostrar() {
        return "El mayor es: " + buscarMax() + "\n"
                + "\nEl menor es: " + buscarMin() + "\n"
                + "\nNumero de nodos: " + contar() + "\n"
                + "\nAltura del arbol: " + getAltura() + "\n"
                + "\nSuma de nodos: " + sumar();
    }

}
