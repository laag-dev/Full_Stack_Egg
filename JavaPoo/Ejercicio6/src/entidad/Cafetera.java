package entidad;

import java.util.Scanner;

public class Cafetera {

    public static Scanner consola = new Scanner(System.in); //variable global
    private int capacidadMaxima = 100;
    private int cantidadActual;
    private int cantidadTaza;
    private int servirTaza;

//Constructor predeterminado o vac�o
    public Cafetera() {
    }

//Constructor con la capacidad m�xima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

// M�todos getters y setters.
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

//M�todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//m�xima.
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Se lleno la cafetera al su capacidad maxima: " + cantidadActual);
    }

//M�todo servirTaza(int): se pide el tama�o de una taza vac�a, el m�todo recibe el
//tama�o de la taza y simula la acci�n de servir la taza con la capacidad indicada. Si la
//cantidad actual de caf� �no alcanza� para llenar la taza, se sirve lo que quede. El
//m�todo le informar� al usuario si se llen� o no la taza, y de no haberse llenado en
//cuanto qued� la taza.
    public int servirTaza() throws InterruptedException {
        System.out.println("Ingrese la capacidad de la taza de cafe en GRAMOS y llenaremos su taza con cafe: ");
        cantidadTaza = consola.nextInt();
        System.out.println("Espere un momento, estamos preparando el cafe..........");
        Thread.sleep(3000);
        if (cantidadTaza == cantidadActual) {
            System.out.println("Se lleno su taza a la capacidad maxima, disfrute de su cafe :) ");
        } else {
            System.out.println("Se lleno su taza con: " + cantidadTaza + "ML." + " No alcanzo llenar su taza :( ");
        }

        return servirTaza;
    }
//M�todo vaciarCafetera(): pone la cantidad de caf� actual en cero.
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Se vacio la cafetera");

    }

}






