package app;

public class NumeroEntero {
    private int numero;

    public NumeroEntero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private String numeroAlReves(int n) {
        if (n > 0) return n%10 + numeroAlReves(n/10);
        else return "";
    }
    
    public String numeroAlReves() {
        return numeroAlReves(numero);
    }
}
