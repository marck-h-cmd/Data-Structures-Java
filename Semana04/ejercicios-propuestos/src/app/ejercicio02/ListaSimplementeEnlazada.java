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
public class ListaSimplementeEnlazada {

    private Nodo L;
    
    public ListaSimplementeEnlazada() {
        L = null;
    }
    
    public boolean esVacia() {
        return L == null;
    }
    
    public Nodo getL() {
        return L;
    }
    
    public void agregar(Pelicula x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
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
    
    public void ordenarPeliculas() {
        
        Nodo p, q;
        int seg1, seg2;
        p = L;
        Pelicula aux;
        
        while (p.getSgte() != null) {
            
            q = p.getSgte();
            while (q != null) {
                seg1 = convertToSegundos(p.getInfo().getHoras(), p.getInfo().getMinutos(), p.getInfo().getSegundos());
                seg2 = convertToSegundos(q.getInfo().getHoras(), q.getInfo().getMinutos(), q.getInfo().getSegundos());
                
                if (seg1 > seg2) {
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
        
    }
    
    private int convertToSegundos(int horas, int min, int segs) {
        return horas * 3600 + min * 60 + segs;
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Nodo p = L;
        int i = 0;
     
        Object datos[][] = new Object[contar()][2];
        String titulos[] = {"Titulo", "Duracion"};
        while (p != null) {

            
            datos[i][0] = p.getInfo().getTitulo();
            datos[i][1] = p.getInfo().getHoras()+":"+p.getInfo().getMinutos()+":"+p.getInfo().getSegundos();
          
           i++;
            modelo.setDataVector(datos, titulos);
            p = p.getSgte();
        }

    }
}
