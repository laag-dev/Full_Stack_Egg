package ejercicio2;

import entidad.Circunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuaci�n, se deben crear los siguientes m�todos:
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.crearCircunferencia();
        circunferencia.area();
        circunferencia.perimetro();
        System.out.println("El area es: " + circunferencia.area());
        System.out.println("el perimetro es: " + circunferencia.perimetro());
    }
}
