/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio04;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class VectorPersonas {

    private Persona vector[];
    private int totalElementos;

    public VectorPersonas() {
        vector = new Persona[50];
        totalElementos = 0;
    }

    public VectorPersonas(int limite) {
        vector = new Persona[limite];
        totalElementos = 0;
    }

    public boolean agregar(Persona x) {
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
     
    
   private int recursiveBinarySearch(Persona v[], int n, int left, int right, String name) {
       
        if(left <=right){
            
            int central = (left+right)/2;
            
            if(v[central].getNombre().compareToIgnoreCase(name)==0)
                return central;
            else if (v[central].getNombre().compareToIgnoreCase(name)>0)
                return recursiveBinarySearch(v,n,left, central-1,name);
            else
                  return recursiveBinarySearch(v,n,central+1, right,name);
        }else
            return -1;
    }

    public int busquedaRecursivaTelefono(String name) {
         return recursiveBinarySearch(vector, totalElementos, 0,totalElementos-1, name );
    }
    
    public Persona returnPersona(int index){
        if(index!=-1)
        return vector[index];
         return null;
    }
    
     public String returnTelefono(int index){
        if(index!=-1)
        return vector[index].getNumeroDeTelefono();
         return null;
    }

   public void mostrar(DefaultTableModel modelo, int index) {
      
        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"Nombre", "Telefono"};
        
        Persona per = returnPersona(index);
     
        if(per !=null){
            datos[0][0] = per.getNombre();
            datos[0][1] = per.getNumeroDeTelefono();
        
         modelo.setDataVector(datos, titulos);
        }
           
    }

}
