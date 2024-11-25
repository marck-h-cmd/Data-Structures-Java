/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author marck
 */
public class NumeroEntero {
     private int numero;

    public NumeroEntero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private int calcularFactorial(int n) {
        if (n == 0) return 1;
        else return n*calcularFactorial(n-1);
    }
    
    public int calcularFactorial() {
        return calcularFactorial(numero);
    }
}
