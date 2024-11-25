/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

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

    public Nodo buscar(int dato) {
        Nodo p = primero;
        while (p != null) {
            if (p.getValor() == dato) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }

    public void mostrarHaciaAdelante(DefaultListModel modelo) {
        Nodo p = primero;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        }
    }

    public ListaDoblementeEnlazada returnPrimos() {
        ListaDoblementeEnlazada resultado = new ListaDoblementeEnlazada();
        int i, x;
        i = 2;
        Nodo p = primero;
        while (p != null) {

            x = p.getValor();
            while (i != x) {

                if (x % i == 0) {
                    resultado.insertaAlFinal(x);
                }
                i++;
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
        int c = 0;
        Nodo p = primero;
        while (p != null) {

            p = p.getSgte();
        }
        return c;
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

    public void burbuja() {
        Nodo p = primero, q;
        int aux;
        while (p.getSgte() != null) {
            q = ultimo;

            while (p != q) {
                if (q.getValor() < q.getAnt().getValor()) {
                    aux = q.getValor();
                    q.setValor(q.getAnt().getValor());
                    q.getAnt().setValor(aux);
                }
                q = q.getAnt();
            }

            p = p.getSgte();
        }
    }

    public void invertirLista() {
        Nodo p = primero;
        Nodo temp = null;

        while (p!= null) {           
            temp = p.getAnt();
            p.setAnt(p.getSgte());
            p.setSgte(temp);         
                 
            p = p.getAnt();
        }  
        if(temp!=null) 
        primero = temp.getAnt();    
      
    }

    public ListaDoblementeEnlazada getInterseccion(ListaDoblementeEnlazada list2) {

        ListaDoblementeEnlazada resultado = new ListaDoblementeEnlazada();
        Nodo p = primero, q;
        int c1, c2;
        c1 = contar();
        c2 = list2.contar();

        if (c1 > 0 && c2 > 0) {
            while (p != null) {

                q = list2.getPrimero();
                while (q != null) {
                    if (q.getValor() == p.getValor() && resultado.buscar(p.getValor()) == null) {
                        resultado.insertaAlFinal(p.getValor());
                    }
                    q = q.getSgte();

                }
                p = p.getSgte();
            }
            return resultado;

        }
        return null;

    }

    public ListaDoblementeEnlazada getUnion(ListaDoblementeEnlazada list2) {

        ListaDoblementeEnlazada resultado = new ListaDoblementeEnlazada();
        Nodo p = primero, q;
        int c1, c2;
        c1 = contar();
        c2 = list2.contar();

        if (c1 > 0 && c2 > 0) {

            q = list2.getPrimero();
            while (p != null) {
                if (resultado.buscar(p.getValor()) == null) {
                    resultado.insertaAlFinal(p.getValor());
                }
                p = p.getSgte();
            }
            while (q != null) {
                if (resultado.buscar(q.getValor()) == null) {
                    resultado.insertaAlFinal(q.getValor());
                }
                q = q.getSgte();
            }

            return resultado;

        }
        return null;

    }

    public ListaDoblementeEnlazada getDiferencia(ListaDoblementeEnlazada list2) {

        ListaDoblementeEnlazada resultado = new ListaDoblementeEnlazada();
        Nodo p = primero;

        int c1, c2, temp;
        c1 = contar();
        c2 = list2.contar();

        if (c1 > 0 && c2 > 0) {
            while (p != null) {

                if (list2.buscar(p.getValor()) == null && resultado.buscar(p.getValor()) == null) {
                    temp = p.getValor();
                    resultado.insertaAlFinal(temp);
                }
                p = p.getSgte();

            }
            return resultado;

        }
        return null;

    }

}
