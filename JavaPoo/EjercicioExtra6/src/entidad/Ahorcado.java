package entidad;

import java.util.Scanner;

public class Ahorcado {


    private String[] palabras = {"javascrip", "licuadora", "escritorio", "argentina", "monitor", "gerente", "television", "pelicula", "mascota"};
    private int jugadasMaximas = 6;
    private int encontradas = 0;
    private String incognita;
    private char[] letras;
    private String palabraIncognita;

    public Ahorcado() {
    }

    public Ahorcado(String incognita, char[] letraEncontrada, String palabraIncognita) {
        this.incognita = incognita;
        this.letras = letraEncontrada;
        this.palabraIncognita = palabraIncognita;
    }

    public void crearJuego() {

        System.out.println("******* El Ahorcado ********");
        incognita = palabras[(int) (Math.random() * palabras.length)];
        letras = new char[incognita.length()];
        for (int i = 0; i < incognita.length(); i++) {
            letras[i] = incognita.charAt(i);
        }
        palabraIncognita = " ";
        for (int i = 0; i < incognita.length(); i++) {
            palabraIncognita += " _ ";
        }

        longitud();
    }

    public void longitud() {
        System.out.println("la longitud de la palabra es: " + incognita.length());
        System.out.println("Adivina la palabra: " + palabraIncognita);
    }

    public boolean buscar(char letras) {
        boolean encontrada = false;
        // Busca la letra en la palabra
        for (int i = 0; i < incognita.length(); i++) {
            if (incognita.charAt(i) == letras) {
                encontrada = true;
                break;
            }
            if (encontrada) {
                System.out.println(letras);
            } 
            else {
                System.out.println("La letra no se encuentra ");
            }

        }
         return encontrada;
    }
    
//    public void encontrada(){
//        buscar();
//        System.out.println("Letras encontradas: " + letras ());
//        System.out.println("Letras faltantes: " + (letras.length() - encontrada.size()));
//
//        // Si la letra no estaba en la palabra, le resta una oportunidad
//        if (!encontrada) {
//            oportunidades--;
//            System.out.println("La letra no está en la palabra. Oportunidades restantes: " + oportunidades);
//        }
//    }
}//fin de la clase



//? Constructores, tanto el vacío como el parametrizado.
//? Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.
//? Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
//? Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
//? Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
//? Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
//? Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.