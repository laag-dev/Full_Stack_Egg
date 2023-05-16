package entidad;

import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;
//b) Metodo constructor sin los atributos pasados por par�metro.

    public Operacion() {
    }
//a) M�todo constructor con todos los atributos pasados por par�metro.

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//c) M�todos get y set.

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
//d) M�todo para crearOperacion(): que le pide al usuario los dos n�meros y los guarda
//en los atributos del objeto.

    public void crearOperacion() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = consola.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = consola.nextDouble();
    }
//e) M�todo sumar(): calcular la suma de los n�meros y devolver el resultado al main.

    public double suma() {
        double suma;
        suma = this.num1 + this.num2;
        return suma;
    }
//f) M�todo restar(): calcular la resta de los n�meros y devolver el resultado al main

    public double resta() {
        double resta;
        resta = this.num1 - this.num2;
        return resta;
    }
//g) M�todo multiplicar(): primero valida que no se haga una multiplicaci�n por cero, si
//fuera a multiplicar por cero, el m�todo devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicaci�n y se devuelve el resultado al main

    public double multiplica() {
        double multiplica = 0;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("No se puede multiplicar por 0");
        } else {
            multiplica = this.num1 * this.num2;
        }
        return multiplica;
    }
//h) M�todo dividir(): primero valida que no se haga una divisi�n por cero, si fuera a pasar
//una divisi�n por cero, el m�todo devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la divisi�n y se devuelve el resultado al main. 

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
