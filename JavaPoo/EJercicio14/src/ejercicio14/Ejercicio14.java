package ejercicio14;

import entidad.Movil;
import java.util.Arrays;

public class Ejercicio14 {

    public static void main(String[] args) throws InterruptedException {

//Una tienda que vende tel�fonos m�viles quiere tener registro de cada producto que
//posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
//almacenar cada producto con su informaci�n. Crear una entidad Movil con los atributos
//marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo c�digo ser�
//un arreglo num�rico de dimensi�n 7 (siete) donde cada sub�ndice alojar� un n�mero
//correspondiente al c�digo. 
        Movil movil = new Movil();
        movil.cargarCelular();
        System.out.println("Codigo IMEI: " + Arrays.toString(movil.getCodigo()));

    }
}
