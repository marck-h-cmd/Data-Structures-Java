/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio02;

/**
 *
 * @author marck
 */
public class Nodo {
    private Pelicula info;
    private Nodo sgte;

    
    public Nodo(Pelicula x) {
        info = x;
        sgte = null;
    }
    
    public Nodo()
    {
        sgte=null;
    }
    public Nodo(Pelicula x, Nodo sig) {
        info = x;
        sgte = sig;
    }
    
    
    public Pelicula getInfo() {
        return info;
    }

    public void setInfo(Pelicula info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
    
}
