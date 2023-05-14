package Entidad;

import java.util.Scanner;

public class Cafetera {

    public static Scanner consola = new Scanner(System.in); //variable global
    private int capacidadMaxima = 100;
    private int cantidadActual;
    private int cantidadTaza;
    private int servirTaza;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

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

    public void llenarCafetera() {
      this.cantidadActual = this.capacidadMaxima;
      System.out.println("Se lleno la cafetera al su capacidad maxima: " + cantidadActual);
    }
    
    public int servirTaza() throws InterruptedException {
       System.out.println("Ingrese la capacidad de la taza de cafe en GRAMOS y llenaremos su taza con cafe: ");
        cantidadTaza = consola.nextInt();
        System.out.println("Espere un momento, estamos preparando el cafe.........."); Thread.sleep(3000);
        if (cantidadTaza == cantidadActual) {
            System.out.println("Se lleno su taza a la capacidad maxima, disfrute de su cafe :) ");
        } else {
            System.out.println("Se lleno su taza con: "  +  cantidadTaza  + "ML." + " No alcanzo llenar su taza :( ");
        }  
  
        return servirTaza;
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
        System.out.println("Se vacio la cafetera");
        
    }
    

}
