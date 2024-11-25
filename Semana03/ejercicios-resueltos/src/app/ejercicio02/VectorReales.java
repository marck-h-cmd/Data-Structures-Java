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

    private int recursiveBinarySearch(double v[], int n, int left, int right, double value) {
       
        if(left <=right){
            
            int central = (left+right)/2;
            
            if(value == v[central])
                return central;
            else if (v[central]>value)
                return recursiveBinarySearch(v,n,left, central-1,value);
            else
                  return recursiveBinarySearch(v,n,central+1, right,value);
        }else
            return -1;
    }

    public int recursiveBinarySearch(double valor) {
         return recursiveBinarySearch(vector, totalElementos, 0,totalElementos-1, valor );
    }

    

}
