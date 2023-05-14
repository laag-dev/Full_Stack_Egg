package Entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    Scanner consola = new Scanner(System.in);

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
