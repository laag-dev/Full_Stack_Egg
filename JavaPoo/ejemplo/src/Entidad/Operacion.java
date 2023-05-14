/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = consola.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = consola.nextDouble();
    }

    public double suma() {
        double suma;
        suma = this.num1 + this.num2;
        return suma;
    }

    public double resta() {
        double resta;
        resta = this.num1 - this.num2;
        return resta;
    }

    public double multiplica() {
        double multiplica = 0;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("No se puede multiplicar por 0");
        } else {
            multiplica = this.num1 * this.num2;
        }
        return multiplica;
    }

    public double divide() {

        double divide = 0;

        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("no se puede dividir por 0");
        } else {
            divide = this.num1 / this.num2;
        }
            return divide;
    }

}
