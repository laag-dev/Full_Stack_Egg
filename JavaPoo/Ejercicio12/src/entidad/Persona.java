
package entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;


public class Persona {

    private static String toString;
    Scanner consola = new Scanner(System.in);
    private String  nombre;
    private Date fechaNacimiento, fecha2;
    private int edad, edad2;
    
    public Persona() {
        fecha2 = new Date();
    }

    public Persona(String nombre, Date fechaNacimiento, int edad, int edad2) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.edad2 = edad2;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        
    }
    
      public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad2() {
        return edad2;
    }

    public void setEdad2(int edad2) {
        this.edad2 = edad2;
    }
   
//M�todo de creaci�n del objeto que respete la siguiente firma:
//crearPersona(). Este m�todo rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.    
    public LocalDate crearPersona(){
        System.out.println("Ingrese su nombre: ");
        nombre = consola.nextLine();
        System.out.println("Ingrese fecha de nacimiento en formato AAAA-MM-DD: ");
        String fechaNacimiento = consola.next();
        LocalDate  fecha2 = LocalDate.parse(fechaNacimiento);
        edad = (int)calcularEdad(fecha2);
        System.out.println("Su edad es: " + edad + " a�os");
        return fecha2;
        
    }

//M�todo calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona tambi�n se debe conocer la fecha
//actual.
    public long  calcularEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
    }

//M�todo menorQue(int edad) que recibe como par�metro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como par�metro, o false en caso contrario.    
    public boolean menorQue() {
        System.out.println("Ingrese la edad de otra persona para comparar quien es menor: ");
        edad2 = consola.nextInt();
        System.out.println("El numero mayor es: " + Math.max(edad, edad2));
       return false;
    } 

//Metodo mostrarPersona(): este m�todo muestra la persona creada en el m�todo
//anterior.
      public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
      
}

