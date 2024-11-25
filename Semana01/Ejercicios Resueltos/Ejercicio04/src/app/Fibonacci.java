/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author marck
 */
public class Fibonacci {
      private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int calcularTermino(int n) {
        if (n==1 || n==2) return 1;
        else 
            return calcularTermino(n-1) + calcularTermino(n-2);
    }
    
    public int calcularTermino() {
        return calcularTermino(n);
    }
}
