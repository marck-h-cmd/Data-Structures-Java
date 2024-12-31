/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.estructurasReutilizadas;
/**
 *
 * @author marck
 */
public class Grafo {
    private int matAdy[][];
    private int numVertices;
    private String nombreVertices[];
    
    
    public Grafo(int n){
        numVertices=n;
        matAdy= new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matAdy[i][j]=Integer.MAX_VALUE;
        nombreVertices=new String[n];
    }
    
    public int getNumVertices(){
        return numVertices;
    }
    
    public void setNombreVertice(int i, String nombre){
        nombreVertices[i]=nombre;
    }
    
    public String getNombreVertice(int i){
        return nombreVertices[i];
    }

    public int getDistancia(int a, int b) {
        return matAdy[a][b];
    }

    public String[] getNombreVertices() {
        return nombreVertices;
    }
    /*
    public void insertaArista(Arista a){
        matAdy[a.getDestino()][a.getDestino()=a.getDistancia();
    }
    
*/
    
    
    
    
}
