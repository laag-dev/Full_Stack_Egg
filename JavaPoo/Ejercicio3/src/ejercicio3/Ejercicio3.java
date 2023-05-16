package ejercicio3;

import entidad.Operacion;

public class Ejercicio3 {

    public static void main(String[] args) {

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. 
        Operacion oper = new Operacion();
        oper.crearOperacion();
        System.out.println("El valor de la suma es: " + oper.suma());
        System.out.println("El valor de la resta es: " + oper.resta());
        System.out.println("El valor de la multiplicacion es: " + oper.multiplica());
        System.out.println("El valor de la division es: " + oper.divide());

    }
}
