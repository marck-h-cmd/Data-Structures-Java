/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos.ejercicio06;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class VectorReales {
     private double vector[];
    private int totalElementos;
    
    
    public VectorReales() {
        vector = new double[20];
        totalElementos = 0;
    }
    
    public VectorReales(int limite) {
        vector = new double[limite];
        totalElementos = 0;
      
    }
       
    public boolean agregar(double numero) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = numero;
            totalElementos++;
            return true;
        }
        return false;
    }
    
    public int getTotalElementos() {
        return totalElementos;
    }
    
    public double getNumero(int index) {
        return vector[index];
    }
    
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < totalElementos; i++) {
            modelo.addElement(vector[i]);
        }
    }
    
    private int vectorBuscar(double x[], int n, double num) {
        if (n == 0) return -1;
        else if(x[n-1]== num)
            return n-1;
        else
            return vectorBuscar(x, n-1, num);
    }
    
    public int vectorBuscar(double numero) {
        return  vectorBuscar(vector, totalElementos, numero);
    }
}
