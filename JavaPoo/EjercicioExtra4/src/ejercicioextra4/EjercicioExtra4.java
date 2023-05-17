package ejercicioextra4;

import service.NifService;

public class EjercicioExtra4 {

    public static void main(String[] args) throws InterruptedException {

//Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
//correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
//letra (String o char) que le corresponde. 
//La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: 
        NifService nif = new NifService();
        nif.crearNif();
        nif.mostrar();

    }
}
