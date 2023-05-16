package ejercicio8;

import entidad.Cadena;
import service.CadenaService;

public class Ejercicio8 {

    public static void main(String[] args) {

//  Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los métodos
        CadenaService cadena = new CadenaService();

        Cadena cad = cadena.crearPalabra();
        cadena.mostarVocales(cad);
        cadena.invertirFrase(cad);
        cadena.vecesRepetido(cad);
        cadena.compararLongitud(cad);
        cadena.unirFrases(cad);
        cadena.reemplazar(cad);
        cadena.contiene(cad);

    }
}
