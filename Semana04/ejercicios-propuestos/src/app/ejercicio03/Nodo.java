/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

/**
 *
 * @author marck
 */
public class Nodo {
    private Curso info;
    private Nodo sgte;
    
     public Nodo(Curso x) {
        info = x;
        sgte = null;
    }
    
    public Nodo()
    {
        sgte=null;
    }
    public Nodo(Curso x, Nodo sig) {
        info = x;
        sgte = sig;
    }

    public Curso getInfo() {
        return info;
    }

    public void setInfo(Curso info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
    
    
}
