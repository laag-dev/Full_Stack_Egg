package entidad;

import java.util.Scanner;

public class Cafetera {

    public static Scanner consola = new Scanner(System.in); //variable global
    private int capacidadMaxima = 100;
    private int cantidadActual;
    private int cantidadTaza;
    private int servirTaza;

//Constructor predeterminado o vacío
    public Cafetera() {
    }

//Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

// Métodos getters y setters.
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

//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Se lleno la cafetera al su capacidad maxima: " + cantidadActual);
    }

//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
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
//Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Se vacio la cafetera");

    }

}






