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
    private int info;
    private app.ejercicio03.Nodo sgte;
    
    
    public Nodo(){
        sgte = null;
    }
    
     public Nodo(int x){
        sgte = null;
        info = x;
    }
     
      public Nodo(int x, app.ejercicio03.Nodo sig){
        sgte = sig;
        info = x;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public app.ejercicio03.Nodo getSgte() {
        return sgte;
    }

    public void setSgte(app.ejercicio03.Nodo sgte) {
        this.sgte = sgte;
    }
      
      

     
     
    
}
