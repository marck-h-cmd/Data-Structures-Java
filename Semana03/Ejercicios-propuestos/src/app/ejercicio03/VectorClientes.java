/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class VectorClientes {
    private Cliente vector[];
    private int totalElementos;

    public VectorClientes() {
        vector = new Cliente[50];
        totalElementos = 0;
    }

    public VectorClientes(int limite) {
        vector = new Cliente[limite];
        totalElementos = 0;
    }

    public boolean agregar(Cliente x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }
    
     public int getTotalElementos() {
        return totalElementos;
    }

     

    public void mostrarDatos(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][3];
        String titulos[] = {"Nombre", "Codigo","Saldo"};

        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getCodigo();
            datos[i][2] = vector[i].getSaldo();
            
        }

        modelo.setDataVector(datos, titulos);
    }
    
    public void mostrarCliente(DefaultTableModel modelo, int index) {
        Object datos[][] = new Object[totalElementos][3];
        String titulos[] = {"Nombre", "Codigo","Saldo"};

      
        
         Cliente clie = returnCliente(index);
         if(clie!=null){
            datos[0][0] = clie.getNombre();
            datos[0][1] = clie.getCodigo();
            datos[0][2] = clie.getSaldo();
             modelo.setDataVector(datos, titulos);
         }
          
    }

    private void quickSort(Cliente[] v, int primero, int ultimo) {
        int i = primero, j = ultimo;
        Cliente pivote, temporal;
        pivote = v[(primero + ultimo) / 2];

        do {
            while (v[i].getNombre().compareToIgnoreCase(pivote.getNombre()) < 0) {
                i++;
            }
            while (v[j].getNombre().compareToIgnoreCase(pivote.getNombre()) > 0) {
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

    public void quickSortNombre() {
        quickSort(vector, 0, totalElementos - 1);
    }
    
     private int binarySearch(Cliente v[], int n,  String name) {
       int left, right, mid;
       left = 0;
       right = n-1;
       
       while(left<=right){
           mid = (left+right)/2;
           if(v[mid].getNombre().compareToIgnoreCase(name)==0)
               return mid;
           else
               if(v[mid].getNombre().compareToIgnoreCase(name)<0)
                   left = mid+1;
               else
                   right = mid-1;
           
           
       }
       return -1;
       
    }
     
       public Cliente returnCliente(int index){
        if(index!=-1)
        return vector[index];
         return null;
    }

    public int binarySearch(String name) {
         return binarySearch(vector, totalElementos, name);
    }
    

}
