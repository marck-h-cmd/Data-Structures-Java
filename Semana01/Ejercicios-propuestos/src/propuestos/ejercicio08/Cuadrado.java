/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos.ejercicio08;

/**
 *
 * @author marck
 */
public class Cuadrado {
    private double lado;
    private int numero;

    public Cuadrado(double lado, int numero) {
        this.lado = lado;
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    private double perimetro(double lado, int n){
        if(n==1)
            return 4*lado;
        else
            return 4*lado + (perimetro(lado,n-1)*(Math.sqrt(2)/2));
    }
    
    public double perimetro(){
        return perimetro(lado,  numero);
    }
}
