/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.arbolPalabra;
//import app.ejercicio01.Nodo;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 * 
 */
public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public boolean esRaiz(Nodo nodo) {
        return raiz == nodo;
    }

    public void insertar(Datos valor) {
        raiz = insertar(raiz, valor);
    }

    private Nodo insertar(Nodo root, Datos valor) {
        if (root == null) {
            root = new Nodo(valor);
        }

        if (valor.getPalabra().compareToIgnoreCase(root.getInfo().getPalabra()) < 0) {
            root.setIzquierdo(insertar(root.getIzquierdo(), valor));
        } else if (valor.getPalabra().compareToIgnoreCase(root.getInfo().getPalabra()) > 0) {
            root.setDerecho(insertar(root.getDerecho(), valor));
        }

        return root;
    }

    private Nodo busqueda(Nodo r, String x) {

        if (r == null || r.getInfo().getPalabra().equalsIgnoreCase(x)) {
            return r;
        }

        if (x.compareToIgnoreCase(r.getInfo().getPalabra()) > 0)
            return busqueda(r.getDerecho(), x);

        return busqueda(r.getIzquierdo(), x);
    }

    public Nodo busqueda(String valor) {
        return busqueda(raiz, valor);
    }

    private int contar(Nodo r) {
        if (r == null) {
            return 0;
        } else {
            return 1 + contar(r.getIzquierdo()) + contar(r.getDerecho());
        }
    }

    public int contar() {
        return contar(raiz);
    }

    public void enOrden(DefaultTableModel modelo) {
        String titulos[] = {"Palabra", "Significado"};
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        enOrden(raiz, modelo);
    }

    private void enOrden(Nodo r, DefaultTableModel modelo) {
        if (r != null) {
            enOrden(r.getIzquierdo(), modelo);
            agregarFila(modelo, r.getInfo());
            enOrden(r.getDerecho(), modelo);
        }
    }

    public void agregarFila(DefaultTableModel modelo, Datos x) {
        Object row[] = {x.getPalabra(), x.getSignificado()

        };
        modelo.addRow(row);
    }

    public void limpiarTabla(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

}
