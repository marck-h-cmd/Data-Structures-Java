/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos.ejercicio03;

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
    
    private int sumaRecursiva(int num){
        if(num ==1 && num>0)
            return 1;
        else return num + sumaRecursiva(num-1);
    }
    
    
    public int sumaRecursiva() {
        
        return sumaRecursiva(numero);
        
    }
}
