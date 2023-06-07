package entidad;

/**
 *
 * @author QuinSDev
 */
public enum Perro {

    BEAGLE("Beagle", "Perro de caza", 2, "Peque�o"),
    PASTOR_ALEMAN("Pastor Alem�n", "Perro de trabajo", 4, "Grande"),
    FOX_TERRRIER("Fox Terrier", "Perro de compa��a", 3, "Peque�o"),
    CHIHUAHUA("Chihuahua", "Perro de compa��a", 1, "Peque�o"),
    LABRADOR("Labrador Retriever", "Perro de trabajo", 5, "Grande");

    private final String nombre;
    private final String raza;
    private final int edad;
    private final String tamanio;

    private Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nRaza: ").append(raza);
        sb.append("\nEdad: ").append(edad);
        sb.append("\nTama�o: ").append(tamanio);
        return sb.toString();
    }
    
    

}
