package entidad;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }
//a) Método constructor que inicialice el radio pasado como parámetro.

    public Circunferencia(double radio) {
        this.radio = radio;
    }
//b) Métodos get y set para el atributo radio de la clase Circunferencia.

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.

    public void crearCircunferencia() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = consola.nextDouble();
    }
//d) Método area(): para calcular el área de la circunferencia (Area = ? ? radio2).

    public double area() {

        return Math.PI * (radio * radio);
    }
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ? ? ? radio).

    public double perimetro() {
        return 2 * (Math.PI * radio);
    }

}
