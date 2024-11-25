package app.ejercicio01;

public class Nodo {
    
    private int entero;
    private Nodo sgte;

    public Nodo(int entero) {
        this.entero = entero;
        sgte = null;
    }
    
    public Nodo()
    {
        sgte=null;
    }
    public Nodo(int entero, Nodo sgte) {
        this.entero = entero;
        this.sgte = sgte;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
