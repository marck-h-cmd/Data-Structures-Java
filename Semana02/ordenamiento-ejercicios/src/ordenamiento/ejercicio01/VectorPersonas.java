/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.ejercicio01;

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

    private void bubbleSort(Persona v[], int n) {
        int i, j;
        Persona temporal;

        for (i = 0; i < n - 1; i++) {
            for (j = n - 1; j > i; j--) {
                if (v[j].getNombre().compareTo(v[j - 1].getNombre()) < 0) {
                    temporal = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = temporal;
                }
            }
        }
    }
    
    public void bubbleSortNombre(){
        bubbleSort(vector, totalElementos);
    }

    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"Nombre", "Numero de Telefono"};

        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getNumeroDeTelefono();
        }

        modelo.setDataVector(datos, titulos);
    }

}
