package ejercicio6;

import entidad.Cafetera;

public class Ejercicio6 {

    public static void main(String[] args) throws InterruptedException {

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad m�xima de caf� que puede contener la cafetera) y cantidadActual (la
//cantidad actual de caf� que hay en la cafetera).
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        cafetera.servirTaza();
        cafetera.vaciarCafetera();
    }
}
