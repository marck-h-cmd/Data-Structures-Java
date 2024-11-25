/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos.ejercicio02;

/**
 *
 * @author marck
 */
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
    
    private int contarCifras(int num){
        if(num<10 && num>=0)
            return 1;
        else if(num<0) return contarCifras(-num);
        else return contarCifras(num/10) + 1;
    }
    
    
    public int getContarCifras() {
        
        return contarCifras(numero);
        
    }
}
