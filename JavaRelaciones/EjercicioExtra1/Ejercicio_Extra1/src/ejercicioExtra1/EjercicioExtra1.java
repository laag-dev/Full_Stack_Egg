
package ejercicioExtra1;

import service.Adopcion;
import java.util.concurrent.ForkJoinTask;

/**
 *
 * @author QuinSDev
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adopcion adopcion = new Adopcion();
        adopcion.infoPersona();
        adopcion.mostrarPerros();
        adopcion.adoptar();
        adopcion.mostrar();
        
    }
    
}
