package ejercicio1.entidad;

import ejercicio1.entidad.Animal;

class Perro extends Animal {

    public Perro(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro se alimenta con concentrado de perro o dieta natural");
    }

}
