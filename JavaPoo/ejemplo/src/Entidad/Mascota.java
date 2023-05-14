package Entidad;

public class Mascota {

    private String nombre;
    private String apodo;

    // Tipo de mascota
    private String tipo;
    private String color;
    private String raza;
    private int edad;
    private boolean cola;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, String color, String raza, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.cola = cola;
    }
}
