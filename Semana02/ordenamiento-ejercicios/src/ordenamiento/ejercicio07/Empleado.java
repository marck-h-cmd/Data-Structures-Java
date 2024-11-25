package ordenamiento.ejercicio07;

public class Empleado {
    
    private String nombre;
    private int edad;
    private float ventas;

    public Empleado(String nombre, int edad, float nVentas) {
        this.nombre = nombre;
        this.edad = edad;
        this.ventas = nVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getVentas() {
        return ventas;
    }

    public void setVentas(float nVentas) {
        this.ventas = nVentas;
    }
    
}
