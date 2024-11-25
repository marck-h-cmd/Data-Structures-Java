/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.ejercicio07;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class VectorEmpleados {
     private Empleado vector[];
    private int totalElementos;

    public VectorEmpleados() {
        vector = new Empleado[50];
        totalElementos = 0;
    }

    public VectorEmpleados(int limite) {
        vector = new Empleado[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Empleado x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    
    private void heapSort(Empleado v[], int n){
        Empleado temp;
        
       for (int i = n / 2 - 1; i >= 0; i--)
            heapify(v, n, i);
       
        for (int i = n - 1; i >= 0; i--) {
          
            temp = v[0];
            v[0] = v[i];
            v[i] = temp;
 
         
            heapify(v, i, 0);
        }
       
    }
    
    private static void heapify(Empleado v[], int n, int i){
        Empleado swap;
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && v[l].getVentas() > v[largest].getVentas())
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && v[r].getVentas() > v[largest].getVentas())
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            swap = v[i];
            v[i] = v[largest];
            v[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(v, n, largest);
        }
    }
    public void sortVentasByHeap(){
       heapSort(vector, totalElementos);
    }
    
    
    
     public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][3];
        String titulos[] = {"Nombre", "Edad", "Monto Ventas"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getEdad();
            datos[i][2] = vector[i].getVentas();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
