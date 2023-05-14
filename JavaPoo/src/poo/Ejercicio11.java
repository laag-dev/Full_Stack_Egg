package poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

        Scanner consola = new Scanner(System.in);

        LocalDate fechaActual = LocalDate.now();

        System.out.println("Ingrese el dia dd: ");
        int dia = consola.nextInt();
        System.out.println("Ingrese el mes MM: ");
        int mes = consola.nextInt();
        System.out.println("Ingrese el año AAAA: ");
        int anio = consola.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        long diferenciaAnios = ChronoUnit.YEARS.between(fecha, fechaActual);
        System.out.println("La diferencia de años entre " + fecha + " y " + fechaActual + " es: " + diferenciaAnios);

    }
}
