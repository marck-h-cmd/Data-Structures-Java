/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio02;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class ListaSimplementeEnlazadaProductos {

    private Nodo L;

    public ListaSimplementeEnlazadaProductos() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public Nodo getL() {
        return L;
    }

    public void agregar(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (L == null) {
            L = nuevo;
        } else {
            Nodo p = L;
            while (p.getSgte() != null) {
                p = p.getSgte();
            }
            p.setSgte(nuevo);
        }
    }

    public int contar() {
        int c = 0;
        Nodo p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }

    public Nodo buscar(String codigo) {
        Nodo p = L;
        while (p != null) {
            if (p.getInfo().getCodigo().compareTo(codigo) == 0) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }

    public void ordenarPorNombre() {
        Nodo p, q;
        p = L;

        Producto aux;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getInfo().getNombre().compareToIgnoreCase(q.getInfo().getNombre()) > 0) {

                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);

                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }

    }

    public boolean eliminar(String cod) {
        if (L.getInfo().getCodigo().compareToIgnoreCase(cod) == 0) {
            L = L.getSgte();
            return true;
        } else {
            Nodo ant, p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getInfo().getCodigo().compareToIgnoreCase(cod) != 0) {
                ant = p;
                p = p.getSgte();
            }
            if (p != null) {
                ant.setSgte(p.getSgte());
                return true;
            } else {
                return false;
            }
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        Nodo p = L;
        int i = 0;
        // modelo.removeAllElements();
        Object datos[][] = new Object[contar()][4];
        String titulos[] = {"Nombre", "Codigo", "Precio", "Stock"};
        while (p != null) {

            datos[i][0] = p.getInfo().getNombre();
            datos[i][1] = p.getInfo().getCodigo();
            datos[i][2] = p.getInfo().getPrecio();
            datos[i][3] = p.getInfo().getStock();
            i++;
            modelo.setDataVector(datos, titulos);
            p = p.getSgte();
        }

    }

    public ListaSimplementeEnlazadaProductos devolverLista(float precio){
        
         ListaSimplementeEnlazadaProductos res = new  ListaSimplementeEnlazadaProductos();
         
          Nodo p = L;
        while (p != null) {
            Producto x = p.getInfo();
            if (p.getInfo().getPrecio() > precio) 
                res.agregar(x);
            
               p = p.getSgte();
        }
        return res;
        
    }
   

    public void mostrarUnProducto(DefaultTableModel modelo, String cod) {
        Object datos[][] = new Object[contar()][4];
        String titulos[] = {"Nombre", "Codigo", "Precio", "Stock"};

        Nodo pro = buscar(cod);
        if (pro != null) {
            datos[0][0] = pro.getInfo().getNombre();
            datos[0][1] = pro.getInfo().getCodigo();
            datos[0][2] = pro.getInfo().getPrecio();
            datos[0][3] = pro.getInfo().getStock();

            modelo.setDataVector(datos, titulos);
        }

    }

}
