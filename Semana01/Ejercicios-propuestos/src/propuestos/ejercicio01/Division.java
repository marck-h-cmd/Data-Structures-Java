/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos.ejercicio01;

/**
 *
 * @author marck
 */
public class Division {

    private int numero1;
    private int numero2;

    public Division(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    private int cociente(int num1, int num2) {

        if (num2 == 0) {
          throw new ArithmeticException("No es posible dividir entre 0");
        } else if (num1 < 0 && num2 < 0) {
            return cociente(-num1, -num2);
        } else if (num1 < 0) {
            return -cociente(-num1, num2);
        } else if (num2 < 0) {
            return -cociente(num1, -num2);
        } else {
            if (num2 > num1) {
                return 0;
            } else {
                return 1 + cociente(num1 - num2, num2);
            }
        }

    }

    private int residuo(int num1, int num2) {
        if (num1 < 0 && num2 < 0) {
            return residuo(-num1, -num2);
        } else if (num1 < 0) {
            return -residuo(-num1, num2);
        } else if (num2 < 0) {
            return -residuo(num1, -num2);
        } else {
            if (num2 > num1) {
                return num1;
            } else {
                return residuo(num1 - num2, num2);
            }

        }

    }

    public int cociente() {
        return cociente(numero1, numero2);
    }

    public int residuo() {
        return residuo(numero1, numero2);
    }

}
