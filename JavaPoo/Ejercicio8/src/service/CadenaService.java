package service;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    Scanner consola = new Scanner(System.in);

    public Cadena crearPalabra() {
        Cadena palabra = new Cadena();
        System.out.println("Ingrese una frase: ");
        palabra.setFrase(consola.nextLine());
        return palabra;
    }

//    a) M�todo mostrarVocales(), deber� contabilizar la cantidad de vocales que tiene la
//          frase ingresada.
    public void mostarVocales(Cadena cantidad) {
        int vocales = 0;
        for (int i = 0; i < cantidad.getFrase().length(); i++) {
            char letraActual = cantidad.getFrase().charAt(i);
            if (esVocal(letraActual)) {
                vocales++;
            } else {

            }
            System.out.println("Vocales en la palabra " + cantidad.getFrase() + " n�mero de vocales  " + vocales);
        }
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

// b) M�todo invertirFrase(), deber� invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase(Cadena invertir) {
        String invertida = invertir.getFrase();
        StringBuilder leer = new StringBuilder(invertida);
        leer.reverse();
        System.out.println("La frase invertida es: ");
        return invertida;
    }

//c) M�todo vecesRepetido(String letra), recibir� un car�cter ingresado por el usuario y
//contabilizar cu�ntas veces se repite el car�cter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El car�cter 'a' se repite 4 veces.
    public char vecesRepetido(Cadena letra) {

        System.out.println("Ingrese una letra, para saber cuantas veces se repite: ");
        char letra1 = consola.next().charAt(0);
        int caracter = 0;
        for (int i = 0; i < letra.getFrase().length(); i++) {
            char letraActual = letra.getFrase().charAt(i);
            if (letra1 == letraActual) {
                caracter++;
            } else {

            }
        }
        System.out.println("La letra" + letra1 + "se repite " + caracter + "veces");
        return letra1;
    }

// e) M�todo compararLongitud(String frase), deber� comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    public String compararLongitud(Cadena cadena) {

        System.out.println("Ingrese una segunda frase: ");
        String palabra = consola.nextLine();
        String p = cadena.getFrase();

        if (p.length() == palabra.length()) {
            System.out.println("Tiene la misma cantidad caracteres las palabras " + palabra + " y la palabra " + cadena.getFrase());
        } else if (p.length() < palabra.length()) {
            System.out.println("Tiene menor cantidad de caracteres la palabra  " + cadena.getFrase() + " que la palabra " + palabra);
        } else {
            System.out.println("La frase " + cadena.getFrase() + " tiene mayor cantidad de caracteres que la palabra " + palabra);
        }
        return palabra;

    }

//f) M�todo unirFrases(String frase), deber� unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public String unirFrases(Cadena unir) {
        System.out.println("Ingrese una segunda frase para unirla con la palabra inicialmente ingresada ");
        String texto = consola.next();
        System.out.println(" La frase unida es:  " + texto.concat(" " + unir.getFrase()));

        return texto;
    }

// g) M�todo reemplazar(String letra), deber� reemplazar todas las letras �a� que se
//encuentren en la frase, por alg�n otro car�cter seleccionado por el usuario y mostrar
//la frase resultante.
    public String reemplazar(Cadena letra) {
        System.out.println("Ingrese un caracter para reemplazar la letra a: ");
        String caracter = consola.next();

        String caracter2 = letra.getFrase().replaceAll("a", caracter);
        System.out.println("La nueva palabra es: " + caracter2);

        return caracter2;
    }

//h) M�todo contiene(String letra), deber� comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no. 
    public boolean contiene(Cadena contener) {
        System.out.println("Ingrese una letra para comprobar, si se encuentra dentro de la cadena: ");
        String letra = consola.next();
        boolean comprueba = false;
        if (contener.getFrase().contains(letra)) {
            System.out.println(" " + comprueba);
            return comprueba = true;
        } else {
            System.out.println(" " + comprueba);

            return comprueba = false;
        }
    }
}
