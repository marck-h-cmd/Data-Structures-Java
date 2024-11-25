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
public class ListaDoblementeEnlazada {

    protected Nodo primero;
    protected Nodo ultimo;

    public ListaDoblementeEnlazada() {
        primero = null;
        ultimo = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public boolean esVacia() {
        return primero == null && ultimo == null;
    }

    public void insertaAlInicio(int v) {
        Nodo nuevo = new Nodo(v);
        if (primero == null) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(primero);
            nuevo.setAnt(null);
            primero.setAnt(nuevo);
            primero = nuevo;
        }
    }

    public void insertaAlFinal(int v) {
        Nodo nuevo = new Nodo(v);
        if (primero == null) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(null);
            nuevo.setAnt(ultimo);
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }

    public int contar() {
        int c = 0;
        Nodo p = primero;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }

    public void mostrarHaciaAdelante(DefaultListModel modelo) {
        Nodo p = primero;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        }
    }

    private boolean esPrimo(int numero) {
        int contador = 2;
        boolean esPrimo = true;
        while ((esPrimo) && (contador != numero)) {
            if (numero % contador == 0) {
                esPrimo = false;
            }
            contador++;
        }
        return esPrimo;
    }

    public ListaDoblementeEnlazada returnPrimos() {
        ListaDoblementeEnlazada resultado = new ListaDoblementeEnlazada();

        Nodo p = primero;
        while (p != null) {
            if (esPrimo(p.getValor())) {
                resultado.insertaAlFinal(p.getValor());
            }
            p = p.getSgte();
        }
        return resultado;
    }

    public void ordenar() {
        Nodo p, q;
        int aux;
        p = primero;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getValor() > q.getValor()) {
                    aux = p.getValor();
                    p.setValor(q.getValor());
                    q.setValor(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }

    public int returnMenor() {
        Nodo p;
        int menor = primero.getValor();
         p = primero;
        while (p != null) {
            if(menor>p.getValor())
              menor = p.getValor();
            p = p.getSgte();
            
        }
        return menor;
    }

    public float getMediana() {
        ordenar();
        Nodo p = primero;
        Nodo q = ultimo;
        float mediana;

        int n = contar();

        if (n % 2 == 0) {
            while (p.getSgte() != q && q.getAnt() != p) {
                p = p.getSgte();
                q = q.getAnt();
            }
            mediana = (float) (p.getValor() + q.getValor()) / (float) 2;

        } else {
            while (p != q) {
                p = p.getSgte();
                q = q.getAnt();
            }
            mediana = (float) q.getValor();
        }

        return mediana;

    }

    public double calcularDS() {
        int total, sum1 = 0;
        double sum2 = 0, des;
        Nodo p = primero;
        Nodo q = ultimo;
        total = contar();

        while (p != null) {

            while (q != null) {
                sum1 = sum1 + q.getValor();
                q = q.getAnt();
            }

            sum2 = sum2 + Math.pow(p.getValor() - sum1 / total, 2);

            p = p.getSgte();

        }
        des = Math.sqrt(sum2 / total);

        return des;
    }

}
