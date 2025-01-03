/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio01_diapos;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class Pila<T> {

         private Nodo<T> L;
    
    public Pila(){
        L=null;
    }
    
    public void push(T valor)
    {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSgte(L);
        L=nuevo;
    }
    
    public T pop(){
        T cima=L.getInfo();
        L=L.getSgte();
        return cima;
    }
    
   public T top(){
        return L.getInfo();
    }

    
    public boolean isEmpty(){
        return L==null;
    }
    
    public void clear(){
        while(L!=null)
            L=L.getSgte();
    }
    
    public void mostrar(DefaultListModel modelo){
        Nodo actual=L;
        modelo.removeAllElements();
        while(actual!=null)
        {
            modelo.addElement(actual.getInfo());
            actual=actual.getSgte();
        }
    }

}
