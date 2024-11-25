/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import javax.swing.DefaultListModel;
/**
 *
 * @author marck
 */
public class VectorReales {
     private double vector[];
    private int totalElementos;
    
    public VectorReales() {
        vector = new double[10];
        totalElementos = 0;
    }
    
    public VectorReales(int limite) {
        vector = new double[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(double numero) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = numero;
            totalElementos++;
            return true;
        }
        return false;
    }
    
    public int getTotalElementos() {
        return totalElementos;
    }
    
    public double getNumero(int index) {
        return vector[index];
    }
    
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < totalElementos; i++) {
            modelo.addElement(vector[i]);
        }
    }
    
    private double sumarElementos(double x[], int n) {
        if (n == 0) return 0;
        else return x[n-1] + sumarElementos(x, n-1);
    }
    
    public double sumarElementos() {
        return sumarElementos(vector, totalElementos);
    }
    
    private double calcularMayor(double x[], int n) {
        if (n == 1) return x[0];
        else if (x[n-1] > calcularMayor(x, n-1)) return x[n-1];
        else return calcularMayor(x, n-1);
    }
    
    public double calcularMayor() {
        return calcularMayor(vector, totalElementos);
    }
}
