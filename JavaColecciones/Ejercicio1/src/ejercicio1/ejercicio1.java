package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

//Dise�ar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedir� una raza de perro en un bucle, el mismo se guardar� en la lista y
//despu�s se le preguntar� al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrar� todos los perros guardados en el ArrayList.
        
        
     Scanner consola = new Scanner(System.in); 
    
     ArrayList<String> razaPerro = new ArrayList(); 
     String respuestaFin;
     int cont =1;
     
        do {
            
            System.out.println("Ingrese la raza del perro a la base de datos: ");
            razaPerro.add(consola.nextLine().toUpperCase());
            System.out.println("�Desea agregar otra raza? Ingrese SI o NO");
            respuestaFin = consola.nextLine().toUpperCase();
            
        } while (respuestaFin.equals("SI"));
        
        System.out.println("********BASE DE DATOS DE RAZAS DE PERRO********");
        for(String aux :razaPerro){
            
            System.out.println(cont + " ----> " + aux);
            cont++;
        }  
    
    }  
}//fin
