/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio01;

/**
 *
 * @author marck
 */
public class Nodo {
    private float real;
    private Nodo sgte;

    
     public Nodo(float x) {
        real = x;
        sgte = null;
    }
    
    public Nodo()
    {
        sgte=null;
    }
    public Nodo(float x, Nodo sig) {
        real = x;
        sgte = sig;
    }
    
    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
    
}
