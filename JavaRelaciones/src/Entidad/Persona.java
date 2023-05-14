/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author laag0
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
   public void adoptarPerro(Perro perro) {
       this.perro = perro;
   } 
    
   public void info() {
       System.out.println("Nombre del perro  " +  perro.getNombre()+ "\n" + "La raza es: " + perro.getRaza() + "\n" + "La edad es: " + perro.getEdad() + "\n" + "El tamaño de perro es: " + perro.getTamano() + "\n");
       System.out.println("****Los datos del solicitante de adopción son ****" + "\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "Dni: " + dni + "\n");
   }
   
}



