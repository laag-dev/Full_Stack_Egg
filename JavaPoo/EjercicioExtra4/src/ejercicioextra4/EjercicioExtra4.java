package ejercicioextra4;

import service.NifService;

public class EjercicioExtra4 {

    public static void main(String[] args) throws InterruptedException {

//D�gito Verificador. Crear una clase NIF que se usar� para mantener DNIs con su
//correspondiente letra (NIF). Los atributos ser�n el n�mero de DNI (entero largo) y la
//letra (String o char) que le corresponde. 
//La letra correspondiente al d�gito verificador se calcular� a traves de un m�todo que
//funciona de la siguiente manera: 
        NifService nif = new NifService();
        nif.crearNif();
        nif.mostrar();

    }
}
