// <editor-fold defaultstate="collapsed" desc=" Ejercicio 14">
// </editor-fold>
package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecciones {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in).useDelimiter("\n");

// <editor-fold defaultstate="collapsed" desc=" Ejercicio 1">

        ArrayList<String> razasPerros = new ArrayList();
        String raza;
        
        while(true) {
            
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
// </editor-fold>
} //fin
