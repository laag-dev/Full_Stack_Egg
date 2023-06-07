package entidad;

/**
 *
 * @author QuinSDev
 */
public enum Perro {

    BEAGLE("Beagle", "Perro de caza", 2, "Pequeño"),
    PASTOR_ALEMAN("Pastor Alemán", "Perro de trabajo", 4, "Grande"),
    FOX_TERRRIER("Fox Terrier", "Perro de compañía", 3, "Pequeño"),
    CHIHUAHUA("Chihuahua", "Perro de compañía", 1, "Pequeño"),
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
        sb.append("\nTamaño: ").append(tamanio);
        return sb.toString();
    }
    
    

}
