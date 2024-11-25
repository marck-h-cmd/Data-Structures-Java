/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos.ejercicio07;

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
    
    private boolean cifrasIguales(int num){
        if (num<0)
            return cifrasIguales(-num);
        else if(num <10)
            return true;
        else if((num%10)==((num/10)%10))
                return  cifrasIguales(num/10);
        else
            return false;
    }
    
    
    public boolean getCifrasIguales() {
        
        return  cifrasIguales(numero);
        
    }
}
