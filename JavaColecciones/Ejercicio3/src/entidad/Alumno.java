package entidad;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Double> notasAlum = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notasAlum = notasAlum;
    }
//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotasAlum() {
        return notasAlum;
    }

    public void setNotasAlum(ArrayList<Double> notasAlum) {
        this.notasAlum = notasAlum;
    } 
}


