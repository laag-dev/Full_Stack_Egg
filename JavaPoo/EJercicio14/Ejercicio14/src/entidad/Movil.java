package entidad;

import java.util.Scanner;

public class Movil {

    Scanner consola = new Scanner(System.in);
    private String marca;
    private int precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

//Un constructor por defecto.
//Un constructor con todos los atributos como parámetro.
    public Movil() {
    }

    public Movil(String marca, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

//Métodos getters y setters de cada atributo.
    public Scanner getConsola() {
        return consola;
    }

    public void setConsola(Scanner consola) {
        this.consola = consola;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

//Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
    public void cargarCelular() {
        System.out.print("Ingrese la marca del móvil: ");
        marca = consola.next();
        System.out.print("Ingrese el precio: ");
        precio = consola.nextInt();
        System.out.print("Ingrese el modelo: ");
        modelo = consola.next();
        System.out.print("Ingrese la memoria RAM (GB): ");
        memoriaRam = consola.nextInt();
        System.out.print("Ingrese el almacenamiento (GB): ");
        almacenamiento = consola.nextInt();
        codigo = new int[7];
        ingresarCodigo();
        
    }

//Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
    public void ingresarCodigo() {
            
        do {
            System.out.print("Ingrese el código IMEI de 7 digitos:  ");
            String cadenaCod = consola.next();
            
            if (cadenaCod.length() == 7) {
                System.out.println("Informacion guardada. ");
                
                for (int i = 0; i < 7; i++) {
                    codigo[i] = Integer.parseInt(cadenaCod.substring(i, i+1));
                }
               break;
            } else {
                
                 System.out.println("Código incompleto. El tamaño debe ser de 7 dígitos, ingrese el codigo nuevamente");   
            }
        } while (true);
    }
}
