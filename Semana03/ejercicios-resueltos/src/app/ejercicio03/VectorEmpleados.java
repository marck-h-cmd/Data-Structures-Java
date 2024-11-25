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
    
     public int getTotalElementos() {
        return totalElementos;
    }
     
    public boolean agregar(Empleado x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    public Empleado returnEmpleado(int index){
        if(index!=-1)
        return vector[index];
         return null;
    }
    
    
    private int recursiveSequentialSearch(Empleado v[], int n,String cod) {
       
       if (n == 0) return -1;
        else if(v[n-1].getCodigo().compareToIgnoreCase(cod)==0)
            return n-1;
        else
            return recursiveSequentialSearch(v, n-1, cod);
       
    }

    public int  recursiveSequentialSearch(String code) {
         return recursiveSequentialSearch(vector, totalElementos,code );
    }
    
     public void mostrar(DefaultTableModel modelo, int index) {
      
        Object datos[][] = new Object[totalElementos][3];
        String titulos[] = {"Nombre", "Codigo", "Sueldo"};
        
        Empleado emp = returnEmpleado(index);
     
        if(emp !=null){
            datos[0][0] = emp.getNombre();
            datos[0][1] = emp.getCodigo();
            datos[0][2] = emp.getSueldo();
         modelo.setDataVector(datos, titulos);
        }
           
    }
}
