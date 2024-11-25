/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio02;


import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class VectorReales {

    private double vector[];
    private int totalElementos;

    public VectorReales() {
        vector = new double[10];
        totalElementos = 0;
    }

    public VectorReales(int limite) {
        vector = new double[limite];
        totalElementos = 0;
    }

    public boolean agregar(double valor) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = valor;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public double devolverElemento(int indice) {
        return vector[indice];
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public void mostrar(DefaultListModel modelo) {
        int i;
        modelo.removeAllElements();
        for (i = 0; i < totalElementos; i++) {
            modelo.addElement(vector[i]);
        }
    }

    private void quickSort(double[] v, int primero, int ultimo) {
        int i = primero, j = ultimo;
        double pivote, temporal;
        pivote = v[(primero + ultimo) / 2];

        do {
            while (v[i] > pivote) {
                i++;
            }
            while (v[j] < pivote) {
                j--;
            }
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quickSort(v, primero, j);
        }
        if (i < ultimo) {
            quickSort(v, i, ultimo);
        }
    }

    public void quickSort() {
        quickSort(vector, 0, totalElementos - 1);
    }

    private int linearSearch(double v[], int n, double num) {

        int i;

        for (i = 0; i < n; i++) {

            if (num == v[i]) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealAscendente(double valor) {
        return linearSearch(vector, totalElementos, valor);
    }

}
