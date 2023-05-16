package ejercicio6;

import entidad.Cafetera;

public class Ejercicio6 {

    public static void main(String[] args) throws InterruptedException {

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera).
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        cafetera.servirTaza();
        cafetera.vaciarCafetera();
    }
}
