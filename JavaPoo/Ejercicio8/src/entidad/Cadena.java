package entidad;

public class Cadena {

    private String frase;
    private int logitud;

    public Cadena() {
    }

    public Cadena(String frase, int logitud) {
        this.frase = frase;
        this.logitud = logitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLogitud() {
        return logitud;
    }

    public void setLogitud(int logitud) {
        this.logitud = logitud;
    }

}
