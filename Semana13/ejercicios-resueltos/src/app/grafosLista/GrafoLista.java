/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.grafosLista;

import app.estructurasReutilizadas.Colas;
import app.estructurasReutilizadas.Pila;
import app.estructurasReutilizadas.Nodo;
import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class GrafoLista {
    private ListaSimplementeEnlazada<Integer> listaAdyacencia[];
    private int numVertices;
    private boolean visitAnchura[];
    private boolean visitProfundidad[];
    private Pila<Integer> pila;
    private Colas<Integer> cola;
    
    public GrafoLista(int n){
       numVertices=n;
        listaAdyacencia = new ListaSimplementeEnlazada[numVertices + 1];
        for (int i = 1; i <= numVertices; i++) {
            listaAdyacencia[i] = new ListaSimplementeEnlazada();
        }
        visitAnchura = new boolean[n+1];
        visitProfundidad = new boolean[n+1];
        pila = new Pila();
        cola = new Colas();
    }
    
      
    public void insertarArista(int i, int valor){
        listaAdyacencia[i].insertarAlFinal(valor);

    }
    
    public boolean eliminarArista(int i, int valor){
        return listaAdyacencia[i].eliminar(valor);
    }
    
    public int gradoEntrada(int vertice) {
        int gradoEnt = 0;
        for (ListaSimplementeEnlazada<Integer> nodo : listaAdyacencia) {
            Nodo<Integer> p = nodo.getL();
            while (p != null) {
                if (p.getInfo() == vertice) {
                    gradoEnt++;
                }
                p = p.getSgte();
            }
        }
        return gradoEnt;
    }
    
     public int gradoSalida(int vertice) {      
        return listaAdyacencia[vertice].contar();
    }
    
    public String mostrarAdyacentes(int vertice){
        String cad= " ";
        ListaSimplementeEnlazada lista = listaAdyacencia[vertice];
        Nodo p = lista.getL();
                
        while(p!=null){
            cad = cad + " " + p.getInfo();
            p = p.getSgte();
        }        
        return cad;     
    }
    
     public void recorridoAnchura(int vertice, DefaultListModel modelo) {
        modelo.removeAllElements();
        cola.encolar(vertice);
        visitAnchura[vertice] = true;
        
        while (!cola.isEmpty()) {
            int actual = cola.desencolar();
            modelo.addElement(actual);
            Nodo<Integer> p = listaAdyacencia[actual].getL();
            while (p != null) {
                int vecino = p.getInfo();
                if (!visitAnchura[vecino]) {
                    visitAnchura[vecino] = true;
                    cola.encolar(vecino);
                } 
                p = p.getSgte();
            }
        }
    }
     
     public void recorridoProfundidad(int vertice, DefaultListModel modelo) {
       
         modelo.removeAllElements();        
        pila.push(vertice);
        visitProfundidad[vertice] = true;

        while (!pila.isEmpty()) {
            int actual = pila.pop();
            modelo.addElement(actual);
            Nodo<Integer> p = listaAdyacencia[actual].getL();
            while (p != null) {
                int vecino = p.getInfo();
                if (!visitProfundidad[vecino]) {
                    visitProfundidad[vecino] = true;
                    pila.push(vecino);
                } 
                p = p.getSgte();
            }
        }
    }
     
     public boolean esDirigido(){
        for (int i = 1; i <= numVertices; i++) {
            Nodo<Integer> actual = listaAdyacencia[i].getL();
            while (actual != null) {
                int info = actual.getInfo();
                if (listaAdyacencia[i].buscar(info) != null && listaAdyacencia[info].buscar(i) == null) {
                    return true;
                }
                actual = actual.getSgte();
            }
        }
        return false;
    }


}
