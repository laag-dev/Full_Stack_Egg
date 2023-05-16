
package ejercicio1;

import entidad.Libro;

public class Ejercicio1 {

    public static void main(String[] args) {

//    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. 
        Libro libro = new Libro();
        libro.cargaLibro();
        libro.mostrarInfo();

    }
}
