package javaIntro;

import java.util.Scanner;

public class JavaIntro {

    static Scanner leer = new Scanner(System.in); //variable global

    public static void main(String[] args) {

// <editor-fold defaultstate="collapsed" desc=" Ejercicio 1 ">
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
////dos. El programa deberá después mostrar el resultado de la suma
//  
//        System.out.println("Ingrese un numero");
//        int num1 = leer.nextInt();
//       
//        
//        System.out.println("Ingrese otro numero");
//        int num2 = leer.nextInt();
//        
//        int suma = num1 +num2;
//        
//        System.out.println("El resultados de la suma de ambos numeros es: " + suma);
// </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 2 ">
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
//      Scanner leer = new Scanner(System.in);
//         
//          System.out.println("Por favor ingrese su nombre");
//        String nombre = leer.nextLine();
//        
//        System.out.println("Su nombre es: " + nombre);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 3 ">
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
//Java.
//       String frase;
//       System.out.println("Ingrese frase: ");
//       frase = leer.nextLine();
//       
//       System.out.println("La frase en mayus es:"+frase.toUpperCase());
//       System.out.println("La frase en minus es: "+frase.toLowerCase());
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 4 ">
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
//        float f, c;
//        System.out.print("Ingrese el valor en centigrados: ");
//        c = leer.nextFloat();
//        f = (32+(9*c/5));
//        System.out.println("La temperatura den Fahrenheit es: " + f);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 5 ">
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().
//    int num;
//        System.out.println("Ingrese un numero: ");
//        num= read.nextInt();
//        System.out.println("El doble del numero es: "+ (num*2));
//        System.out.println("El triple del numero es: "+ (num*3));
//        System.out.println("La raiz cuadrada del numero es: "+Math.sqrt(num));
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 6 ">
//Crear un programa que dado un numero determine si es par o impar.
//int num;
//          System.out.println("Ingrese un numero");
//          num= leer.nextInt();
//          if(num%2==0){
//              System.out.println("El numero es par");
//             } 
//          else {
//              System.out.println("El numero es impar");
//          }
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 7 ">
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.
//System.out.println("Ingrese contraseña");
//String frase = leer.nextLine();
//frase = toLowerCase(frase);
//
//if (frase.equals("eureka")) {
//System.out.println("Su contraseña es correcta");
//}
//else {
//System.out.println("Su contraseña es incorrecta");
//}
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 8 ">
//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
//el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
//por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//“INCORRECTO”. Nota: investigar la función Lenght() en Java.
//System.out.println("Ingrese frase");
//String frase = leer.nextLine();
//int longitud = frase.length();
//if (longitud ==8) { 
//    System.out.println("Correcto 8 caracteres");
//}
//else {
//    System.out.println("Incorrecto no tiene 8 caracteres");
//}
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 9 ">
//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
//investigar la función Substring y equals() de Java.
//System.out.println("Ingrese una frase");
//        String frase=leer.nextLine();
//        
//        
//         if(frase.charAt(0)=='A'){
//            System.out.println("correcta");
//        }else{
//            System.out.println("Incorrecto");
//        }
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 10 ">
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
////límite inicial.
//int suma=0;
//        
//        System.out.println("Ingrese el valor numero limite positivo");
//        int limite=leer.nextInt();
//        
//        
//        do {   
//            System.out.println("Ingrese un numero");
//            int numero=leer.nextInt();
//            suma=numero+suma;
//            
//        } while (suma<=limite);
////        
//        System.out.println("La suma es: " +suma);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 11 ">
//  
////Realizar un programa que pida dos números enteros positivos por teclado y muestre por
////////pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
//programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
////del programa, caso contrario se vuelve a mostrar el menú.
//int opc=0;
//    String salir;      
//        
//  
//    do {
//         System.out.println("********MENU*********");
//         System.out.println("1. Sumar");
//         System.out.println("2. Restar");
//         System.out.println("3. Multiplicar");
//         System.out.println("4. Dividir");
//         System.out.println("5. Salir");
//         
//         System.out.println("-----------------------");
//         System.out.println("Por favor elija una opcion:");
//        opc = leer.nextInt();
//        
//        switch(opc) {
//            case 1: 
//                suma();
//                break;
//            case 2: 
//                resta();
//                break;
//            case 3: 
//                multiplica();
//                break;
//            case 4: 
//                divide();
//                break;
//            case 5:
//                
//                System.out.println("Desea salir del programa Si/No");
//                salir = leer.next();
//                
//                if (salir.toLowerCase().equals("si"))  {
//                System.out.println("Programa finalizado");
//                    } 
//                else {
//                opc=100;
//            
//                        }
//                break;
//            default:
//            System.out.println("Opcion invalida");
//            break;
//            
//        } 
//    }
//    
//    while (opc!=5);
//}
//static void suma(){
//    
//    System.out.println("****Suma****");
//    System.out.println("Ingrese el primer numero");
//    int num1 = leer.nextInt();
//    System.out.println("Ingrese el segundo numero");
//    int num2 = leer.nextInt();
//    System.out.println("El resultado es: "+(num1+num2));
//  
//}
//static void resta(){
//    
//    System.out.println("****Resta****");
//    System.out.println("Ingrese el primer numero");
//    int num1 = leer.nextInt();
//    System.out.println("Ingrese el segundo numero");
//    int num2 = leer.nextInt();
//    System.out.println("El resultado es: "+(num1-num2));
//  
//}
//
//static void multiplica(){
//    
//    System.out.println("****Multiplicaion****");
//    System.out.println("Ingrese el primer numero");
//    int num1 = leer.nextInt();
//    System.out.println("Ingrese el segundo numero");
//    int num2 = leer.nextInt();
//    System.out.println("El resultado es: "+(num1*num2));
//  
//}
//static void divide(){
//    
//    System.out.println("****Division****");
//    System.out.println("Ingrese el primer numero");
//    int num1 = leer.nextInt();
//    System.out.println("Ingrese el segundo numero");
//    int num2 = leer.nextInt();
//    System.out.println("El resultado es: "+(num1/num2));
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 12 ">
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
//ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
//
//        System.out.println("Ingrese una cadena con 5 caracteres como maximo,");
//        System.out.println("El primer caracter inicia en X y el último en O");
//        String cadena;
//        
//        int i = 0;
//        int contador = 0;
//        
//        do{
//            cadena = leer.next().toLowerCase();
//            i++;
//            if(cadena.length()==5){
//                if(cadena.substring(0,1).equals("x") && cadena.endsWith("o")){
//                    contador++;
//                }
//                
//            
//            }
//            else {
//                    System.out.println("Ingreso mas caracteres de lo esperado");
//                }
//        }while(!cadena.equals("&&&&&"));
//        System.out.println("La cantidad de frase ingresadas es: "+(i-1)+" con "+contador+" correctas y "+(i-1-contador)+" incorrectas.");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 13 ">
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//* *
//
//46
//
//* *
//* * * *
//System.out.println("Ingrese N elementos por lado: ");
//        int n = leer.nextInt();
//        
//        for(int i=0; i<n;i++) {
//            for(int j=0;j<n;j++){
//                if(i==0 || j==0 || i==(n-1) || j==(n-1)){
//                    System.out.print("*");
//                    
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        } 
//        
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 14 ">
//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
//System.out.println("Ingrese la cantidad de euros a transformar ");
//
//        int euro=leer.nextInt();
//        System.out.println("¿A que moneda desea convertir? ");
//        System.out.println(" Dolares ");
//        System.out.println(" Yenes ");
//        System.out.println(" Libras ");
//
//        leer.nextLine();
//        
//        String op = leer.nextLine().toLowerCase();
//        Co(euro,op);
//
//    }
//
//    public static void Co (int euro, String op ){
//
//
//        double Cd = 0;
//
//        switch(op) {
//case "dolares":
//
//                Cd = 1.28611 * euro;
//
//                break;
//
//            case "yenes":
//
//
//                Cd = 129.852 * euro;
//
//                break;
//            case "libras":
//
//
//                Cd = 0.86 * euro;
//
//                break;
//        }
//
//        System.out.println("La conversion es de euro a " + op + " es de " + Cd);     
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 15 ">
//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.
//   int []vector = new int [100];
//   
//   for (int i=0;i<=99;i++) {
//       
//    vector[i] = i+1;
//   }
//    
//    for (int i=99;i>=0;i--) {
//    
//       System.out.print(vector[i] + " ");
//        
//   }
// 
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 16 ">
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
//al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido
//    int []vector = new int [80];
//      
//        int numEncontrar, contador=0;     
//        llenaVector(vector);
//       
//       System.out.println("Ingrese el numero a buscar dentro del arreglo");
//     
//     numEncontrar = leer.nextInt();
//
//        for (int i = 0; i < 79; i++) {
//            
//            if (vector[i] == numEncontrar) {
//                contador++;
//                System.out.println("El numero " + numEncontrar + " se encuentra en la posicion: " + i + 1);
//        
//            }  
//        }
//        
//        if (contador == 0) {
//            System.out.println("El numero " + numEncontrar + " no se encontro dentro del arreglo.");
//        } 
//        else {
//    System.out.println("El numero " + numEncontrar + " se encuentra repetido " + contador + " veces.");
//         }
//	
//    } 
//    
//public static int[] llenaVector(int[] vector){
//    
//    System.out.println("Llenando vector....");
//    
//    for (int i = 0; i < 79; i++) {
//        vector [i] = (int) (Math.random()*100);
//    }
//     return vector;   
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 17 ">
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 18 ">
//
//    int matriz [][] = new int [4][4];
//    llenarMatriz(matriz);
//    }
//    
//public static void llenarMatriz(int[][] matriz) {
//    
//    for (int i =0; i < 4; i++) {
//        
//        for (int j = 0; j < 4; j++) {
//            
//        matriz[i][j] = (int) (Math.random()*10);
//        }
//    }
//    
//    System.out.println("Matriz principal");
//    for (int i =0; i < 4; i++) {
//        for (int j = 0; j < 4; j++) { 
//            System.out.print("[" + matriz[i][j] + "]");
//        } 
//        System.out.println("");
//        }
//       
//        System.out.println("Matriz Transpuesta");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <4; j++) {
//                System.out.print("[" + matriz[j][i] + "]"); 
////            }  
////         System.out.println("");
//        }              
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 19 ">
//
//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
//una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
//de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
////Scanner read = new Scanner(System.in);
//        int num;
//        boolean anti;
//        System.out.println("Ingrese el valor para establecer la dimension de la matriz:");
//        num = leer.nextInt();
//        System.out.println("Ingrese los valores para rellenar la matriz, el programa averiguara si la matriz resulta ser antisimetrica:");
//        int matrizA[][] = new int[num][num], matrizB[][] = new int[num][num];
//
//        
//
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                    matrizA[i][j] = leer.nextInt();
//            }
//        }
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                    matrizB[i][j] = matrizA[j][i];
//            }
//        }
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                if (matrizB[i][j] != (matrizA[i][j]*-1))  {
//                    anti=true;
//                    System.out.println("La matriz no es antisimetrica.");
//                }
//                
//                else {
//                    anti=false;
//                    System.out.println("La matriz es transpuesta.");
//                }
//                } 
//        }
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 20 ">
//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
////están entre el 1 y el 9.
//
//    int matriz [][] = new int [3][3];
//    
//    System.out.println("Ingrese los valores para rellenar la matriz");
//    magica(matriz);
// }
//public static void magica(int[][] matriz) {
//
//for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                    matriz[i][j] = leer.nextInt();
//            }
//        }
//       
//Scanner read = new Scanner(System.in);
//        int matrix[][] = new int[3][3];
//
//        System.out.println("Ingrese los valores enteros entre 1 y 9 para rellenar la matriz, el programa averiguara si la matriz resulta ser magica:");
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                do {
//                    matrix[i][j] = read.nextInt();
//                } while (matrix[i][j] < 1 || matrix[i][j] > 9);
//            }
//        }
//        sum(matrix);
//    }
//
//    public static void sum(int[][] mtrx) {
//        int sum, counter = 0;
//        boolean flag = true;
//
//        for (int j = 0; j < 3; j++) {
//            counter += mtrx[0][j];
//        }
//
//        for (int i = 1; i < 3; i++) {
//            sum = 0;
//            for (int j = 0; j < 3; j++) {
//                sum += mtrx[i][j];
//            }
//            if (sum != counter) {
//                flag = false;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            sum = 0;
//            for (int j = 0; j < 3; j++) {
//                sum += mtrx[j][i];
//            }
//            if (sum != counter) {
//                flag = false;
//            }
//        }
//        sum = 0;
//        for (int i = 0; i < 3; i++) {
//            sum += mtrx[i][i];
//        }
//        if (sum != counter) {
//            flag = false;
//        }
//        sum = 0;
//        for (int i = 0; i < 3; i++) {
//            sum += mtrx[i][2 - i];
//        }
//        if (sum != counter) {
//            flag = false;
//        }
//        if (flag) {
//            System.out.println("La matriz es magica pues todos sus lados suman " + counter + ".");
//        } else {
//            System.out.println("La matriz no es magica.");
//        }
//    }
//}
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 1 extra">
//
//System.out.println("Ingrese los minutos para pasar en dias y horas: ");
//        int minutos = leer.nextInt();
//        
//        convertirMinutos(minutos);
//       
//    }
//    public static void convertirMinutos(int minutos){
//            int horas = minutos/60;
//            int dias = horas/24;
//            horas = horas%24;
//            
//            System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 2 extra ">
//int A = 1, B = 2, C = 3, D = 4;
//    int aux;
//    
//        System.out.println("Valores iniciales: ");
//        System.out.println("A: "+A);
//         System.out.println("B: "+B);
//          System.out.println("C: "+C);
//           System.out.println("D: "+D);
//        
//    aux = B;
//    B = C;
//    C = A;
//    A = D;
//    D = aux;
//    
//        System.out.println("Valores finales: ");
//        System.out.println("A: "+A);
//         System.out.println("B: "+B);
//          System.out.println("C: "+C);
//           System.out.println("D: "+D);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 3 extra ">
//    System.out.println("Ingrese una letra: ");
//        String letra = leer.next().toLowerCase();
//        
//        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
//            System.out.println("la letra es una vocal");
//        }else{
//            System.out.println("La letra no es una vocal");
//        }
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 4 extra">
//System.out.println("Ingrese un numero entre 1 al 10 apra pasarlo en romano: ");
//        int numero = leer.nextInt();
//        
//        if(numero <1 || numero>10){
//            System.out.println("No esta el numero entre 1 y 10.");
//        }else{
//            String[]romanos = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
//            
//            System.out.println("El número "+numero+" en números romanos es: "+romanos[numero-1]);
//        }
// </editor-fold>
    }//fin main

}// fin class
