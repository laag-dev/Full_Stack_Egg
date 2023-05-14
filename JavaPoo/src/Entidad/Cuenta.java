package Entidad;

import java.util.Scanner;

public class Cuenta {
    public static Scanner consola = new Scanner(System.in); //variable global
    private int numeroCuenta;
    private long dni;
    private int saldoActual = 0;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = consola.nextInt();
        System.out.println("Ingrese el dni del cliente: ");
        dni = consola.nextInt();
        System.out.println("Ingrese el saldo a depositar: ");
        saldoActual = consola.nextInt();
        
    }
     public void ingresar(double ingreso) {
//        saldoActual += ingreso;
        System.out.println("Se ingreso " + saldoActual + "$" + " en la cuenta.");
    }
     
    public void retirar(double retiro) {
        System.out.println("Ingrese el monto a retirar: ");
        retiro = consola.nextDouble();
        if (retiro > saldoActual) {
            System.out.println("No se puede retirar: " + retiro + " porque el saldo actual es inferior a su saldo: " + saldoActual + "$");
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
            System.out.println("Se ha retirado la cantidad de " + retiro + "$" + " de su cuenta.");
        }
    }

    public void extraccionRapida() {
        double limite = saldoActual * 0.2;
        System.out.println("----Extraccion rapida----");
        System.out.println("Ingrese la cantidad que desea retirar (limite: " + limite + "$):");
        double retiro = consola.nextDouble();
        if (retiro > limite) {
            System.out.println("No se puede retirar " + retiro + "$" + " porque supera el límite de extracción rápida (" + limite + ")" + "$");
        } else {
            saldoActual -= retiro;
            System.out.println("Se ha retirado " + retiro + "$" + " de la cuenta.");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta es: " + saldoActual + "$" );
        consultarDatos();
    }
    
    public void consultarDatos() {
        
        System.out.println("****Informacion de la cuenta****");
        System.out.println("DNI: "+ dni +  "\nNumero de cuenta: " + numeroCuenta + "\nSaldo actual: " + saldoActual + "$" );
        
    }
    
}
