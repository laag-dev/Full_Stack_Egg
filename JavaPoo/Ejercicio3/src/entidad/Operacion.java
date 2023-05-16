package entidad;

import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;
//b) Metodo constructor sin los atributos pasados por parámetro.

    public Operacion() {
    }
//a) Método constructor con todos los atributos pasados por parámetro.

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//c) Métodos get y set.

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
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.

    public void crearOperacion() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = consola.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = consola.nextDouble();
    }
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.

    public double suma() {
        double suma;
        suma = this.num1 + this.num2;
        return suma;
    }
//f) Método restar(): calcular la resta de los números y devolver el resultado al main

    public double resta() {
        double resta;
        resta = this.num1 - this.num2;
        return resta;
    }
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main

    public double multiplica() {
        double multiplica = 0;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("No se puede multiplicar por 0");
        } else {
            multiplica = this.num1 * this.num2;
        }
        return multiplica;
    }
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main. 

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
