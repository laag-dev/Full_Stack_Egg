package entidad;

import java.util.ArrayList;

/**
 *
 * @author QuinSDev
 */
public class Persona {

    private String nombre, apellido;
    private int edad;
    private long documento;
    private ArrayList<Persona> persona = new ArrayList();
    private ArrayList<Perro> perro = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
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

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona.add(persona);
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro.add(perro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nApellido: ").append(apellido);
        sb.append("\nEdad:").append(edad);
        sb.append("\nDocumento: ").append(documento);
        sb.append("\nPerro: ").append(perro);
        return sb.toString();
    }

}
