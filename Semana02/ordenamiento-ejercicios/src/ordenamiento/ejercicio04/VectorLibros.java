/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.ejercicio04;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class VectorLibros {
    private Libro vector[];
    private int totalElementos;

    public VectorLibros() {
        vector = new Libro[50];
        totalElementos = 0;
    }

    public VectorLibros(int limite) {
        vector = new Libro[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Libro x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    private void sortNombreByShell(Libro v[],int n){
        Libro temp;
        int i, j, salto = n/2;
        
        while(salto>0){
            for(i=salto;i<n;i++){
                j=i-salto;
                while(j>=0){
                    if(v[j].getTitulo().compareToIgnoreCase(v[j+salto].getTitulo())>0){
                        temp = v[j];
                        v[j] = v[j+salto];
                        v[j+salto] = temp;
                        j=j-salto;
                    }else{
                        j=-1;
                    }
                }
               
            }
             salto = salto/2;
        }
        
        
    }
    
    public void sortNombreByShell(){
         sortNombreByShell(vector,totalElementos);
    }
    
    
    
    
    
     public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][5];
        String titulos[] = {"Codigo", "Título", "Autor", "Editorial", "#Páginas"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getCodigo();
            datos[i][1] = vector[i].getTitulo();
            datos[i][2] = vector[i].getAutor();
            datos[i][3] = vector[i].getEditorial();
            datos[i][4] = vector[i].getNroPaginas();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
