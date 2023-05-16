package ejercicio5;

import entidad.Cuenta;

public class Ejercicio5 {

    public static void main(String[] args) {

//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        cuenta.ingresar(0);
        cuenta.retirar(0);
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();

    }
}
