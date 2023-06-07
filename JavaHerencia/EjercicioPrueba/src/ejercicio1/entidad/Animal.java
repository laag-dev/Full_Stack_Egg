package ejercicio1.entidad;


public class Animal {
    
   protected String nombre, alimento, raza;
   protected Integer edad;

    public Animal(String nombre, String alimento, String raza, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
   
    public void alimentarse() {
        System.out.println("Los animales se alimentan de: "); ; 
    }
}
