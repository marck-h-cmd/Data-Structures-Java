/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio04;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class ColaArreglos {

    private int[] list;
    private int iprimero;
    private int iultimo;

    public ColaArreglos(int maxT) {
        list = new int[maxT];
        iprimero = 0;
        iultimo = maxT - 1;
    }

    public boolean isEmpty() {
        return siguienteIndex(iultimo) == iprimero;
    }

    public boolean isFull() {
        return siguienteIndex(siguienteIndex(iultimo)) == iprimero;
    }

    public int frente() {
        if (!isEmpty()) {
            return list[iprimero];
        }
        return -1;
    }

    public int siguienteIndex(int i) {
        return (i + 1) % list.length;
    }

    public void encolar(int nuevo) {

        if (!isFull()) {

            iultimo = siguienteIndex(iultimo);

            list[iultimo] = nuevo;
        }
    }

    public int desencolar() {
        if (!isEmpty()) {
            int valor = list[iprimero];

            iprimero = siguienteIndex(iprimero);
            return valor;
        }
        return -1;
    }

    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        int i = iprimero;
        while (iultimo >= i) {

            modelo.addElement(list[i]);
            i++;
        }
    }

}
