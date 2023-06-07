package ejercicio1.entidad;

class Caballo extends Animal {

    public Caballo(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo se alimenta con heno");
    }

}
