/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.hash;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class Vector {

    private double hashTable[]; 
    private int totalElementos;
    private int tableSize;

    public Vector() {
        tableSize = 10;
        hashTable = new double[tableSize];
        Arrays.fill(hashTable, -1); 
        totalElementos = 0;
    }

    public Vector(int limite) {
        tableSize = limite;
        hashTable = new double[tableSize];
        Arrays.fill(hashTable, -1); 
        totalElementos = 0;
    }

    
    public boolean agregar(double valor) {
        if (totalElementos >= tableSize) {
            return false; 
        }

         // Linear probing to handle collisions
         
        int index = hashFunction(valor);
        int originalIndex = index;
        int step = 1;

       
        while (hashTable[index] != -1) {
            index = (originalIndex + step) % tableSize;
            step++;
        }

        hashTable[index] = valor; 
        totalElementos++;
        return true;
    }

   
    private int hashFunction(double valor) {
        return (int) valor % tableSize;
    }

    
    private int hashSearch(double hashTable[],double valor) {
        int index = hashFunction(valor);
        int originalIndex = index;
        int step = 1;

       
        while (hashTable[index] != -1) {
            if (hashTable[index] == valor) {
                return index;
            }
            index = (originalIndex + step) % tableSize;
            step++;

            if (index == originalIndex) {
                break; 
            }
        }

        return -1;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

      public int hashSearch(double valor){
          return hashSearch(hashTable,valor);
      }
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < tableSize; i++) {
            if (hashTable[i] != -1) {
                modelo.addElement(hashTable[i]);
            }
        }
    }

}
