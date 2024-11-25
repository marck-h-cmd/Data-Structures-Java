/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio01;
import java.util.Arrays;
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

    private int improvedLinearSearch(double v[], int n,double num) {
       
       int i, j, actual;
       double temp;
       for(i=0;i<n;i++){
         
           if(num == v[i]){
            
               if(i==0)
                   return i;
 
               actual = i;
               for(j=i-1;j>=0;j--){
                   temp=v[i];
                   v[i]=v[j];
                   v[j]=temp;
                   i--;
                   
               }
              return actual;
             
             
           }
       }
       return -1;
    }
 

    public int busquedaLinealMejorado(double valor) {
         return improvedLinearSearch(vector, totalElementos,valor );
    }

    
}
