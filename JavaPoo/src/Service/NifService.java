package Service;

import Entidad.Nif;
import java.util.Scanner;

public class NifService {

    Scanner consola = new Scanner(System.in);
    Nif nif = new Nif();
    private String letras;
    

    public void crearNif() {
        System.out.println("Ingrese su DNI recuerde que debe ser un valor mayor a 8 digitos: ");
        nif.setDni(consola.nextLong());
        calcuLetra();
    }

    public String calcuLetra() {
        String[] letras = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","V","H","L","C","K","E"};
        int resto = (int) (nif.getDni()%23);
        return letras[resto];
    }
    
    public void mostrar(){
        System.out.printf("Su numero de NIF es: " + nif.getDni()+ "-"+calcuLetra()); 
    }
    
}
