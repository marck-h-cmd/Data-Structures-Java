/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.grafosMatriz;

import app.estructurasReutilizadas.Colas;
import app.estructurasReutilizadas.Pila;
import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class GrafoMatriz {

    private int matAdy[][];
    private int numVertices;
    private boolean visitadoAnchura[];
    private boolean visitadoProfundidad[];
    private Pila<Integer> pila;
    private Colas<Integer> cola;

    public GrafoMatriz(int n) {
        numVertices = n;
        matAdy = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matAdy[i][j] = 0;
            }
        }
        visitadoAnchura = new boolean[n + 1];
        visitadoProfundidad = new boolean[n + 1];
        pila = new Pila();
        cola = new Colas();
    }
    
      public void insertarArista(int i, int j){
        matAdy[i][j] = 1;
    }
    
    public void eliminarArista(int i, int j){
        matAdy[i][j] = 0;
    }

    public int gradoEntrada(int v) {
        int ge = 0;
        for (int i = 1; i <= numVertices; i++) {
            if (matAdy[i][v] == 1) {
                ge++;
            }
        }
        return ge;
    }

    public int gradoSalida(int v) {
        int gs = 0;
        for (int j = 1; j <= numVertices; j++) {
            if (matAdy[v][j] == 1) {
                gs++;
            }
        }
        return gs;
    }

    public String mostrarAdyacentes(int v) {
        String cadena = " ";
        for (int j = 1; j <= numVertices; j++) {
            if (matAdy[v][j] == 1) {
                cadena = cadena + ", " + j;
            }
        }
        return cadena;
    }

    public boolean esDirigido() {
        for (int i = 1; i <= numVertices; i++) {
            for (int j = 1; j <= numVertices; j++) {
                if (matAdy[i][j] != matAdy[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void recorridoAnchura(int v, DefaultListModel modelo) {
        modelo.clear();
        cola.encolar(v);
        visitadoAnchura[v] = true;

        while (!cola.isEmpty()) {
            int frente = cola.desencolar();
            modelo.addElement(frente);
            for (int j = 1; j <= numVertices; j++) {
                if (matAdy[frente][j] == 1 && !visitadoAnchura[j]) {
                    visitadoAnchura[j] = true;
                    cola.encolar(j);
                }
            }
        }
    }

    public void recorridoProfundidad(int v, DefaultListModel modelo) {
        modelo.removeAllElements();
        pila.push(v);
        visitadoProfundidad[v] = true;

        while (!pila.isEmpty()) {
            int valor = pila.pop();
            modelo.addElement(valor);
            for (int i = 1; i <= numVertices; i++) {
                if (matAdy[valor][i] == 1 && !visitadoProfundidad[i]) {
                    visitadoProfundidad[i] = true;
                    pila.push(i);
                }
            }
        }
    }

   

}
