/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.ejercicio02;

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
    
    
    private void sortVentasByInsercion(Empleado v[], int n){
        
        int i, j;
        Empleado temp;
        
        for(i=1;i<n;i++){
            temp = v[i];
            j=i;
            while(j>0 && temp.getVentas() > v[j-1].getVentas()){
                v[j]=v[j-1];
                j--;
            }
            v[j]=temp;
            
        }
    }
    
    public void sortVentasByInsercion(){
       sortVentasByInsercion(vector, totalElementos);
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
