package entidad;

import java.util.Scanner;

public class Libro {

    //Atributos de la clase
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPagina;

    //Constructores
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

//Metodos de la clase cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
    public void cargaLibro() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro: ");
        titulo = consola.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        autor = consola.nextLine();
        System.out.println("Ingrese el isbn del libro: ");
        isbn = consola.nextInt();
        System.out.println("Ingrese el numero de pagina del libro: ");
        numeroPagina = consola.nextInt();
    }

    public void mostrarInfo() {

        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Numero de pagina: " + this.numeroPagina);
    }

}
