package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
// ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
//la lista ordenada.
        Scanner consola = new Scanner(System.in);

        ArrayList<String> razaPerro = new ArrayList();
        String respuestaFin;
        String raza = " ";
        int cont = 1;

        do {

            System.out.println("Ingrese la raza del perro a la base de datos: ");
            razaPerro.add(consola.nextLine().toUpperCase());
            System.out.println("�Desea agregar otra raza? Ingrese SI o NO");
            respuestaFin = consola.nextLine().toUpperCase();

        } while (respuestaFin.equals("SI"));

        System.out.println("********BASE DE DATOS DE RAZAS DE PERRO********");
        for (String aux : razaPerro) {

            System.out.println(cont + " ----> " + aux);
            cont++;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("�Desea buscar y eliminar una raza de perros? SI o NO: ");
        respuestaFin = consola.nextLine().toUpperCase();
        if (respuestaFin.equals("SI")) {
            System.out.println("Ingrese la raza: ");
            raza = consola.nextLine().toUpperCase();

        } else {
            System.out.println("****Gracias por utilizar nuesta APP****");
        }

        Iterator<String> buscar = razaPerro.iterator();

        while (buscar.hasNext()) {
            if (buscar.next().equals(raza)) {
                buscar.remove();
                System.out.println("La raza ingresada fue eliminada de la base de datos: " + raza);
                for (String aux : razaPerro) {
                    System.out.println(cont + " ----> " + aux);
                    cont++;  
                } 
                break;
            } else {
                System.out.println("La raza no se encuentra en la base de datos");
            }
        }

    }
}//fin
