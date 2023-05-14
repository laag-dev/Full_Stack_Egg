package poo;

import Entidad.Rectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie es: " + rectangulo.superficie());
        System.out.println("El perimetro es: " + rectangulo.perimetro());
        rectangulo.dibuRectangulo();

    }
}
