/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ejercicio03;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marck
 */
public class ListaSimplementeEnlazadaCurso {

    private Nodo L;

    public ListaSimplementeEnlazadaCurso() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public Nodo getL() {
        return L;
    }

    public void setL(Nodo L) {
        this.L = L;
    }

    public void insertarAlInicio(Curso x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }

    public int contar() {
        int c = 0;
        Nodo p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }

    public Nodo buscar(String cod) {
        Nodo p = L;
        while (p != null) {
            if (p.getInfo().getCodigo().compareToIgnoreCase(cod) == 0) {
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }

    public void ordenarPorNombre() {
        Nodo p, q;
        p = L;

        Curso aux;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getInfo().getNombre().compareToIgnoreCase(q.getInfo().getNombre()) > 0) {

                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);

                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }

    }

    public boolean eliminar(String cod) {
        if (L.getInfo().getCodigo().compareToIgnoreCase(cod) == 0) {
            L = L.getSgte();
            return true;
        } else {
            Nodo ant, p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getInfo().getCodigo().compareToIgnoreCase(cod) != 0) {
                ant = p;
                p = p.getSgte();
            }
            if (p != null) {
                ant.setSgte(p.getSgte());
                return true;
            } else {
                return false;
            }
        }
    }

    public ListaSimplementeEnlazadaCurso getCarreras(String carrera) {
        Nodo p = L;
        ListaSimplementeEnlazadaCurso listCursos = new ListaSimplementeEnlazadaCurso();
        while (p != null) {
            if (p.getInfo().getCarrera().compareToIgnoreCase(carrera) == 0) {

                listCursos.insertarAlInicio(p.getInfo());

            }
            p = p.getSgte();

        }
        return listCursos;
    }

    public void mostrarUnCurso(DefaultTableModel modelo, String cod) {
        Object datos[][] = new Object[contar()][5];
        String titulos[] = {"Carerra", "Nombre", "Codigo", "Ciclo", "Creditos"};

        Nodo pro = buscar(cod);
        if (pro != null) {
            datos[0][0] = pro.getInfo().getCarrera();
            datos[0][1] = pro.getInfo().getNombre();
            datos[0][2] = pro.getInfo().getCodigo();
            datos[0][3] = pro.getInfo().getCiclo();
            datos[0][4] = pro.getInfo().getCreditos();

            modelo.setDataVector(datos, titulos);
        }

    }

    public void mostrar(DefaultTableModel modelo) {
        Nodo p = L;
        int i = 0;

        Object datos[][] = new Object[contar()][5];
        String titulos[] = {"Carrera", "Nombre", "Codigo", "Ciclo", "Creditos"};
        while (p != null) {

            datos[i][0] = p.getInfo().getCarrera();
            datos[i][1] = p.getInfo().getNombre();
            datos[i][2] = p.getInfo().getCodigo();
            datos[i][3] = p.getInfo().getCiclo();
            datos[i][4] = p.getInfo().getCreditos();
            i++;
            modelo.setDataVector(datos, titulos);
            p = p.getSgte();
        }

    }

}
