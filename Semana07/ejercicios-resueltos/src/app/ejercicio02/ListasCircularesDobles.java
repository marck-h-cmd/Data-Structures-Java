/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio02;

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class ListasCircularesDobles {

    private Nodo u;

    public ListasCircularesDobles() {
        u = null;
    }

    public Nodo getUltimo() {
        return u;
    }

    public void setUltimo(Nodo u) {
        this.u = u;
    }

    public boolean esVacia() {
        return u == null;
    }

    public Nodo getU() {
        return u;
    }

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (u == null) {
            u = nuevo;
            nuevo.setSgte(nuevo);
            nuevo.setAnt(nuevo);
        } else {
            nuevo.setAnt(u);
            nuevo.setSgte(u.getSgte());
            u.getSgte().setAnt(nuevo);
            u.setSgte(nuevo);
            u = nuevo;
        }
    }

    public Nodo buscar(int valor) {
        Nodo p = u.getSgte();

        if (esVacia()) {
            return null;
        } else {
            do {
                if (p.getInfo() == valor) {
                    return p;
                }
                p = p.getSgte();
            } while (p != u.getSgte());
        }
        return null;
    }

    public int contar() {
        Nodo p = u.getSgte();
        int c = 0;
        do {
            c++;
            p = p.getSgte();
        } while (p != u.getSgte());

        return c;
    }

    public void ordenar() {
        Nodo p = u.getSgte();
        Nodo q;
        int aux;

        if (p == null || p.getSgte() == null) {
            return;
        }

        do {
            q = p.getSgte();
            do {
                if (p.getInfo() > q.getInfo()) {
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSgte();
            } while (q != u.getSgte());
            p = p.getSgte();
        } while (p != u);
    }
    
    public void mostrar(DefaultListModel modelo){
        modelo.removeAllElements();
        if(!esVacia()){
            Nodo p = u.getSgte();
            do{
                modelo.addElement(p.getInfo());
                p=p.getSgte();
            }while(p!=u.getSgte());
        }
    }
    
    public boolean eliminar(int x){
        
        if(esVacia())
            return false;
        else{
            Nodo p = u.getSgte();
            if(p.getInfo()==x){
                if(p==p.getSgte())
                    u = null;
                else{
                    u.setSgte(p.getSgte());
                    p.getSgte().setAnt(u);
                }
                return true;
            }else{
                Nodo ant = p;
                p = p.getSgte();
                do{
                    if(p.getInfo()!=x){
                        ant = p;
                        p = p.getSgte();
                    }
                }while(p!=u.getSgte() && p.getInfo()!=x);
                
                if(p==u.getSgte())
                    return false;
                else{
                    ant.setSgte(p.getSgte());
                    p.getSgte().setAnt(ant);
                    if(p==u)
                        u = ant;
                    return true;
                }
            }
         }
    }
    
   
}