package ejercicio4;

import entidad.Rectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {

//Crear una clase Rect�ngulo que modele rect�ngulos por medio de un atributo privado
//base y un atributo privado altura. 
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie es: " + rectangulo.superficie());
        System.out.println("El perimetro es: " + rectangulo.perimetro());
        rectangulo.dibuRectangulo();

    }
}
