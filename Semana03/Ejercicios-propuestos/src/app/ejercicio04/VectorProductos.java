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
public class VectorProductos {

    private Producto vector[];
    private int totalElementos;

    public VectorProductos() {
        vector = new Producto[50];
        totalElementos = 0;
    }

    public VectorProductos(int limite) {
        vector = new Producto[limite];
        totalElementos = 0;
    }

    public boolean agregar(Producto x) {
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
        Object datos[][] = new Object[totalElementos][5];
        String titulos[] = {"Descripcion", "Codigo", "Precio", "Stock", "Categoria"};

        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getDescripcion();
            datos[i][1] = vector[i].getCodigo();
            datos[i][2] = vector[i].getPrecio();
            datos[i][3] = vector[i].getStock();
            datos[i][4] = vector[i].getCategoria();

        }

        modelo.setDataVector(datos, titulos);
    }

    public void mostrarProducto(DefaultTableModel modelo, int index) {
        Object datos[][] = new Object[totalElementos][5];
        String titulos[] = {"Descripcion", "Codigo", "Precio", "Stock", "Categoria"};

        Producto pro = returnProducto(index);
        if (pro != null) {
            datos[0][0] = pro.getDescripcion();
            datos[0][1] = pro.getCodigo();
            datos[0][2] = pro.getPrecio();
            datos[0][3] = pro.getStock();
            datos[0][4] = pro.getCategoria();
            modelo.setDataVector(datos, titulos);
        }

    }

    

    public Producto returnProducto(int index) {
        if (index != -1) {
            return vector[index];
        }
        return null;
    }

   
      private int recursiveBinarySearch(Producto v[], int n, int left, int right, String cod) {
       
        if(left <=right){
            
            int central = (left+right)/2;
            
            if(v[central].getCodigo().compareToIgnoreCase(cod)==0)
                return central;
            else if (v[central].getCodigo().compareToIgnoreCase(cod)>0)
                return recursiveBinarySearch(v,n,left, central-1,cod);
            else
                  return recursiveBinarySearch(v,n,central+1, right,cod);
        }else
            return -1;
    }

    public int busquedaRecursivaCodigo(String name) {
         return recursiveBinarySearch(vector, totalElementos, 0,totalElementos-1, name );
    }
}
