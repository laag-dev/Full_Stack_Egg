package ejercicioextra5;

import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

//Crea una clase en Java donde declares una variable de tipo array de Strings que
//contenga los doce meses del año, en minúsculas. A continuación, declara una variable
//mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
//mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
//usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
//el mes secreto. Un ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int incognita = (int) (Math.random() * (meses.length));
        String mesSecreto = meses[incognita];

        do {
            System.out.println("--------Juego de adivana el mes--------");
            System.out.println("¿Puedes adivinar es el mes magíco?, ingresa cual seria: ");
            String mesCorrecto = consola.next().toLowerCase();
            if (mesCorrecto.equals(mesSecreto)) {
                System.out.println("Has acertado el mes magico, te invito un brownie :)");
                break;
            } else {
                System.out.println("No es el mes magíco :)... intentalo de nuevo");
            }

        } while (true);
    }
}
