package service;

import entidad.Nif;
import java.util.Scanner;

public class NifService {

    Scanner consola = new Scanner(System.in);
    Nif nif = new Nif();
    private String letras;

//Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    public void crearNif() {
        System.out.println("Ingrese su DNI recuerde que debe ser un valor mayor a 8 digitos: ");
        nif.setDni(consola.nextLong());
        calcuLetra();
    }

//Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
//
//POSICIÓN LETRA
//0 T
//1 R
//2 W
//3 A
//4 G
//5 M
//6 Y
//7 F
//8 P
//9 D
//10 X
//11 B
//12 N
//13 J
//14 Z
//15 S
//16 Q
//17 V
//18 H
//19 L
//20 C
//21 K
//22 E
    public String calcuLetra() {
        String[] letras = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "V", "H", "L", "C", "K", "E"};
        int resto = (int) (nif.getDni() % 23);
        return letras[resto];
    }

//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).   
    public void mostrar() {
        System.out.printf("Su numero de NIF es: " + nif.getDni() + "-" + calcuLetra());
    }

}
