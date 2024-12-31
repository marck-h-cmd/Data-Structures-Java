/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.grafosLista;

/**
 *
 * @author marck
 */
public class Arista{
    private int destino;
    private double peso;


    public Arista(int destino, double peso, int distancia) {
        this.destino = destino;
        this.peso = peso;
       
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

       

}
