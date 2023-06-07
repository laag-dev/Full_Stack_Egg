
package service;

import entidad.Perro;
import java.util.Scanner;

public class perroService {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    Perro raza = new Perro();
    
   public void crearRaza() {
       
       do {
           
           System.out.println("Ingrese la raza de un perro");
           raza.setRaza(consola.nextLine());
           
           
       } while (true);
       
       
   } 
   
}
