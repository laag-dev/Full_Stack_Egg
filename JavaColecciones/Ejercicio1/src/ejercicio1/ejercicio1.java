package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razasPerros = new ArrayList();
        String raza;

        while (true) {

            System.out.println("Ingrese la raza del perro o ingrese 'Salir' para terminar de llenar la información: ");
            raza = consola.nextLine().toLowerCase();
            if (raza.equalsIgnoreCase("salir")) {
                break;
            }
            razasPerros.add(raza);
        }

        System.out.println("Razas de perros guardadas: ");

        for (String razaPerro : razasPerros) {
            System.out.println(razaPerro);
        }
    }
} //fin
