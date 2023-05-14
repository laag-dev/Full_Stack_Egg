
package Entidad;

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
   
    
    public LocalDate crearPersona(){
        System.out.println("Ingrese su nombre: ");
        nombre = consola.nextLine();
        System.out.println("Ingrese fecha de nacimiento en formato AAAA-MM-DD: ");
        String fechaNacimiento = consola.next();
        LocalDate  fecha2 = LocalDate.parse(fechaNacimiento);
        edad = (int)calcularEdad(fecha2);
        System.out.println("Su edad es: " + edad + " años");
        return fecha2;
        
    }
    
    public long  calcularEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
    }
    
    public boolean menorQue() {
        System.out.println("Ingrese la edad de otra persona para comparar quien es menor: ");
        edad2 = consola.nextInt();
        System.out.println("El numero mayor es: " + Math.max(edad, edad2));
       return false;
    } 

      public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
      
}
