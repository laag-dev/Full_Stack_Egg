package Entidad;

import java.util.Scanner;

public class Circunferencia2 {

    private double radio;

    public Circunferencia2() {
    }
   

    public Circunferencia2(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = consola.nextDouble();
        this.radio = radio;

    }

    public double area() {

        return Math.PI * (radio * radio);
    }

    public double perimetro() {
        return 2 * (Math.PI * radio);
    }

}
