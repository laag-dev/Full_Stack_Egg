/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author CamiloH
 */
public class Persona {

    private String nombre, apellido;
    private int dni;
    private Perro perro;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append( " " + nombre);
        sb.append(" " + apellido);
        sb.append(" " + dni);
        sb.append(" " + perro);
        sb.append('}');
        return sb.toString();
    }
    
    

}
