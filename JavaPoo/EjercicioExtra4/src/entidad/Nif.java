package entidad;

public class Nif {

    private long dni;
    private String letra;

    public Nif() {
    }

    //Constructor como parametro
    public Nif(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

// Métodos getters y setters para el número de DNI y la letra.
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
