/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.ejercicio06;

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

    private void mergeSort(Persona v[], int n) {

        if (n < 2) {
            return;
        }
        int mid = n / 2;

        Persona left[] = new Persona[mid];
        Persona right[] = new Persona[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = v[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = v[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(v, left, right, mid, n - mid);

    }

    private static void merge(
            Persona[] a, Persona[] left, Persona[] right, int l, int r) {

        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i].getNombre().compareToIgnoreCase(right[j].getNombre())<0) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < l) {
            a[k++] = left[i++];
        }
        while (j < r) {
            a[k++] = right[j++];
        }
    }

    public void mergeSortNombre() {
        mergeSort(vector, totalElementos);
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
