
package ejercicio1;

import entidad.Libro;

public class Ejercicio1 {

    public static void main(String[] args) {

//    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, T�tulo, Autor,
//N�mero de p�ginas, y un constructor con todos los atributos pasados por par�metro y un
//constructor vac�o. 
        Libro libro = new Libro();
        libro.cargaLibro();
        libro.mostrarInfo();

    }
}
