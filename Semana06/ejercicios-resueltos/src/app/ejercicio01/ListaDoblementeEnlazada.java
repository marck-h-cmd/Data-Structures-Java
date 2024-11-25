/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio01;

import javax.swing.table.DefaultTableModel;

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

    public void insertaAlInicio(Empleado v) {
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

    public void insertaAlFinal(Empleado v) {
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

     
      public void mostrarHaciaAdelante(DefaultTableModel modelo) {
        Nodo p = primero;
        int i = 0;

        Object datos[][] = new Object[contar()][5];
        String titulos[] = {"Código", "Nombres", "Apellidos", "Sexo", "Sueldo"};
        while (p != null) {

            datos[i][0] = p.getValor().getCodigo();
            datos[i][1] = p.getValor().getNombre();
            datos[i][2] = p.getValor().getApellidos();
            datos[i][3] = p.getValor().getSexo();
            datos[i][4] = p.getValor().getSueldo();
            i++;
            modelo.setDataVector(datos, titulos);
            p = p.getSgte();
        }

    }
      
    public void mostrarHaciaAtras(DefaultTableModel modelo) {
        Nodo p = ultimo;
        int i = 0;

        Object datos[][] = new Object[contar()][5];
        String titulos[] = {"Código", "Nombres", "Apellidos", "Sexo", "Sueldo"};
        while (p != null) {

            datos[i][0] = p.getValor().getCodigo();
            datos[i][1] = p.getValor().getNombre();
            datos[i][2] = p.getValor().getApellidos();
            datos[i][3] = p.getValor().getSexo();
            datos[i][4] = p.getValor().getSueldo();
            i++;
            modelo.setDataVector(datos, titulos);
            p = p.getAnt();
        }

    }
    
    public Nodo buscar(String dato) {
        Nodo p = primero;
        while (p != null) {
            if (p.getValor().getCodigo().compareToIgnoreCase(dato)==0) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }
     public double montoSueldos() {
        Nodo p = primero;
        double sum = 0;
        while (p != null) {
           sum = sum +p.getValor().getSueldo();
            p = p.getSgte();
        }
        return sum;
    }
     
     public Nodo mayorSueldo() {
        Nodo p, q;
        Empleado aux;
        p = primero;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getValor().getSueldo()>q.getValor().getSueldo()) {
                    aux = p.getValor();
                    p.setValor(q.getValor());
                    q.setValor(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    
        return p;
    }


    public boolean eliminar(String dato) {
        if (primero.getValor().getCodigo().compareToIgnoreCase(dato)==0) {
            if (primero.getSgte() == null) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSgte();
                primero.setAnt(null);
            }
            return true;
        } else {
            Nodo p = primero.getSgte();
            while (p != null && p.getValor().getCodigo().compareToIgnoreCase(dato) != 0) {
                p = p.getSgte();
            }
            if (p != null) {
                if (p == ultimo) {
                    ultimo = ultimo.getAnt();
                    ultimo.setSgte(null);
                } else {
                    p.getAnt().setSgte(p.getSgte());
                    p.getSgte().setAnt(p.getAnt());
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public void ordenar() {
        Nodo p, q;
        Empleado aux;
        p = primero;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getValor().getCodigo().compareToIgnoreCase(q.getValor().getCodigo()) > 0) {
                    aux = p.getValor();
                    p.setValor(q.getValor());
                    q.setValor(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
    
    

}
