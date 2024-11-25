/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.ejercicio03;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class VectorMedicamentos {
      private Medicamento vector[];
    private int totalElementos;

    public VectorMedicamentos() {
        vector = new Medicamento[50];
        totalElementos = 0;
    }

    public VectorMedicamentos(int limite) {
        vector = new Medicamento[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Medicamento x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    
    private void sortNombreBySeleccion(Medicamento v[],int n){
        int index_menor ,i, j;
        
        Medicamento temp;
        for(i=0;i<n-1;i++){
            index_menor = i;
            for(j=i+1;j<n;j++){
                if(v[j].getNombre().compareToIgnoreCase(v[index_menor].getNombre())<0){
                    index_menor = j;
                }
            }
            temp = v[i];
            v[j]=v[index_menor];
            v[index_menor]=temp;
          
        }
    
    }
    
     private void sortPrecioBySeleccion(Medicamento v[],int n){
        int index_menor ,i, j;
        
        Medicamento temp;
        for(i=0;i<n-1;i++){
            index_menor = i;
            for(j=i+1;j<n;j++){
                if(v[j].getPrecio()>v[index_menor].getPrecio()){
                    index_menor = j;
                }
            }
            temp = v[i];
            v[j]=v[index_menor];
            v[index_menor]=temp;
          
        }
    
    }
    
    public void sortNombreBySeleccion(){
        sortNombreBySeleccion(vector,totalElementos);
    }
    public void sortPrecioBySeleccion(){
        sortPrecioBySeleccion(vector,totalElementos);
    }
    

    
    
     public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][4];
        String titulos[] = {"Codigo", "Nombre", "Laboratorio", "Precio"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getCodigo();
            datos[i][1] = vector[i].getNombre();
            datos[i][2] = vector[i].getLaboratorio();
            datos[i][3] = vector[i].getPrecio();
        }
        
        modelo.setDataVector(datos, titulos);
    }
}
