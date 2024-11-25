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
public class VectorReales {

    private double vector[];
    private int totalElementos;

    public VectorReales() {
        vector = new double[50];
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

    private int recursiveSequentialSearch(double v[], int n,double num) {
       
       if (n == 0) return -1;
        else if(v[n-1]== num)
            return n-1;
        else
            return recursiveSequentialSearch(v, n-1, num);
       
    }

    public int  recursiveSequentialSearch(double valor) {
         return recursiveSequentialSearch(vector, totalElementos,valor );
    }

    

}
