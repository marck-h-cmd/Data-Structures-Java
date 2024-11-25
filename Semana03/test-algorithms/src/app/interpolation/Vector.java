/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.interpolation;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class Vector {

    private int vector[];
    private int totalElementos;

    public Vector() {
        vector = new int[10];
        totalElementos = 0;
    }

    public Vector(int limite) {
        vector = new int[limite];
        totalElementos = 0;
    }

    public boolean agregar(int valor) {
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

    private int interpolationSearch(int a[], int n, int num) {

        int low = 0;
        int high = n - 1;

        while (low <= high && num >= a[low] && num <= a[high]) {

            int index = low + ((num- a[low]) * (high - low)) / (a[high] - a[low]);

            if (a[index] < num) {
                low = index + 1;
            } else if (a[index] > num) {
                high = index - 1;
            } else {
                return index;
            }
        }

        return -1;
    }

    public int interpolationSearch(int valor) {
        return interpolationSearch(vector, totalElementos, valor);
    }
    
    private int recursiveInterpolationSearch(int a[], int lo,
                                          int hi, int x)
    {
        int pos;
     
        if (lo <= hi && x >= a[lo] && x <= a[hi]) {

            pos = lo
                  + (((hi - lo) / (a[hi] - a[lo]))
                     * (x - a[lo]));
 
            if (a[pos] == x)
                return pos;
 
            // If x is larger, x is in right sub array
            if (a[pos] < x)
                return recursiveInterpolationSearch(a, pos + 1, hi,
                                           x);
 
            // If x is smaller, x is in left sub array
            if (a[pos] > x)
                return recursiveInterpolationSearch(a, lo, pos - 1,
                                           x);
        }
        return -1;
    }
    
     public int recursiveInterpolationSearch(int valor) {
        return  recursiveInterpolationSearch(vector, 0, totalElementos-1, valor);
    }
    

}
