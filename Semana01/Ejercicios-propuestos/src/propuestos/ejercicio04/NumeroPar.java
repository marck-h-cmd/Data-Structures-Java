package propuestos.ejercicio04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marck
 */
public class NumeroPar {
     private int numero;

    public NumeroPar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private int sumaPares(int num){
        if(num == 0)
            return 0;
        else return 2*num + sumaPares(num-1);
    }
    
    
    public int getSumaPares() {
        
        return sumaPares(numero);
        
    }
}
