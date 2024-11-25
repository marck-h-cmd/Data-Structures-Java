/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eddo_s2_02.ejercicio02;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class VectorAlumnos {

    private Alumno vector[];
    private int totalElementos;

    public VectorAlumnos() {
        vector = new Alumno[50];
        totalElementos = 0;
    }

    public VectorAlumnos(int limite) {
        vector = new Alumno[limite];
        totalElementos = 0;
    }

    public boolean agregar(Alumno x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"Nombre", "Nota"};

        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getNota();
        }

        modelo.setDataVector(datos, titulos);
    }

    private void quickSortAlfabetico(Alumno[] v, int primero, int ultimo) {
        int i = primero, j = ultimo;
        Alumno pivote, temporal;
        pivote = v[(primero + ultimo) / 2];

        do {
            while (v[i].getNombre().compareToIgnoreCase(pivote.getNombre()) < 0) {
                i++;
            }
            while (v[j].getNombre().compareToIgnoreCase(pivote.getNombre()) > 0) {
                j--;
            }
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quickSortAlfabetico(v, primero, j);
        }
        if (i < ultimo) {
            quickSortAlfabetico(v, i, ultimo);
        }
    }

    public void quickSortAlfabetico() {
        quickSortAlfabetico(vector, 0, totalElementos - 1);
    }

    private void quickSortMerito(Alumno[] v, int primero, int ultimo) {
        int i = primero, j = ultimo;
        Alumno pivote, temporal;
        pivote = v[(primero + ultimo) / 2];
        do {
            while (v[i].getNota() > pivote.getNota()) {
                i++;
            }
            while (v[j].getNota() < pivote.getNota()) {
                j--;
            }
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quickSortMerito(v, primero, j);
        }
        if (i < ultimo) {
            quickSortMerito(v, i, ultimo);
        }
    }

    public void quickSortMerito() {
        quickSortMerito(vector, 0, totalElementos - 1);
    }
    
    public Alumno devolverElmento(int indice){
        return vector[indice];
    }

    public int getTotalElemento(){
        return totalElementos;
    }
}
