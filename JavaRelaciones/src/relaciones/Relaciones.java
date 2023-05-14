// <editor-fold defaultstate="collapsed" desc=" Ejercicio 14">
// </editor-fold>
package relaciones;

import Entidad.Juego;
import Entidad.Perro;
import Entidad.Persona;


public class Relaciones {

    public static void main(String[] args) {
       
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 1">
 
 Perro perro1 = new Perro("Lulo", "Pitbull", 1, "Mediano");
 Perro perro2 = new Perro("Chata", "Pincher", 4, "Pequeño");

Persona persona1 = new Persona("Lina", "Arias", 30, 90456789); 
Persona persona2 = new Persona("Jose", "Perez", 23, 99901236);

persona1.adoptarPerro(perro2);
persona2.adoptarPerro(perro1);

        System.out.println("****Felicidades usted adopto un perrito****");
        persona1.info();
        System.out.println("****Felicidades usted adopto un perrito****");
        persona2.info();

// </editor-fold>     
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 2">
 
        Juego juego = new Juego();

        juego.llenarJuego();
        juego.ronda();
// </editor-fold>       
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 3">


 // </editor-fold>   
    }
    
}
