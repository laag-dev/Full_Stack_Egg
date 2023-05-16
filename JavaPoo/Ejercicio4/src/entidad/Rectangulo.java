package entidad;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

//setters y constructores correspondientes.
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
// Método para crear el rectángulo con los datos del Rectángulo dados por el usuario.

    public void crearRectangulo() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo");
        altura = consola.nextDouble();
        System.out.println("Ingrese la base del rectangulo");
        base = consola.nextDouble();

    }
//Método para calcular la superficie del rectángulo

    public double superficie() {
        return base * altura;
    }
//Método para calcular el perímetro del rectángulo.

    public double perimetro() {
        return (base + altura) / 2;
    }
//Método que dibujará el rectángulo mediante asteriscos usando la base y la altura.

    public void dibuRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }
}
