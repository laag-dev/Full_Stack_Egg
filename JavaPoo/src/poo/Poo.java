// <editor-fold defaultstate="collapsed" desc=" Ejercicio 14">
// </editor-fold>
package poo;
import Entidad.Libro;
import Entidad.Circunferencia;
import Entidad.Curso;
import Entidad.Movil;
import Entidad.PersonaImc;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import Entidad.Ahorcado;
import java.util.Scanner;
import Entidad.Cafetera;
import Entidad.Operacion;
import Entidad.Persona;
import Entidad.Rectangulo;
import Service.NifService;

public class Poo {

    public static void main(String[] args) throws InterruptedException {

        Scanner consola = new Scanner(System.in);


// <editor-fold defaultstate="collapsed" desc=" Ejercicio 3">
        Operacion oper = new Operacion();
        oper.crearOperacion();
        System.out.println("El valor de la suma es: " + oper.suma());
        System.out.println("El valor de la resta es: " + oper.resta());
        System.out.println("El valor de la multiplicacion es: " + oper.multiplica());
        System.out.println("El valor de la division es: " + oper.divide());
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 4">
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie es: " + rectangulo.superficie());
        System.out.println("El perimetro es: " + rectangulo.perimetro());
       rectangulo.dibuRectangulo();
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 5">

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 6">
Cafetera cafetera = new Cafetera();
cafetera.llenarCafetera();
cafetera.servirTaza();
cafetera.vaciarCafetera();
//// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 7">
        PersonaImc[] persona = new PersonaImc[4];
        PersonaImc persona1 = new PersonaImc();
        int mayores = 0, menores = 0, pordebajo = 0, ideal = 0, sobrepeso = 0;

        for (int i = 0; i < 4; i++) {
            persona[i] = new PersonaImc();
            persona[i].crearPersona();

        }
        for (int i = 0; i < 4; i++) {

            if (persona[i].calcularImc() == -1) {
                pordebajo++;
            } else if (persona[i].calcularImc()== 0) {
                ideal++;
            } else {
                sobrepeso++;
            }

        }
        for (int i = 0; i < 4; i++) {
            if (persona[i].mayorEdad() == true) {
                mayores++;

            } else {
                menores++;
             
            }

        }

        System.out.println("__________________________________");

        System.out.println(pordebajo + " por debajo");
        System.out.println(ideal + " ideal");
        System.out.println(sobrepeso + " sobrepeso");
        System.out.println(mayores + " son mayores de edad");
        System.out.println(menores + " son menores de edad");

        System.out.println("__________________________________");

        System.out.println((pordebajo * 25) + " % estan por debajo");
        System.out.println((ideal * 25) + " % estan en el ideal");
        System.out.println((sobrepeso * 25) + " % estan con sobrepeso");
        System.out.println((mayores * 25) + " % son mayores de edad");
        System.out.println((menores * 25) + " % son menores de edad");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 8">



// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 9">
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 11">

 LocalDate fechaActual = LocalDate.now();

 System.out.println("Ingrese el dia dd: ");
int dia = consola.nextInt();
System.out.println("Ingrese el mes MM: ");
int mes = consola.nextInt();
System.out.println("Ingrese el año AAAA: ");
int anio = consola.nextInt();
LocalDate fecha = LocalDate.of(anio, mes, dia);
long diferenciaAnios = ChronoUnit.YEARS.between(fecha, fechaActual);
System.out.println("La diferencia de años entre " + fecha + " y " + fechaActual + " es: " + diferenciaAnios);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 12">

Persona persona = new Persona();

persona.crearPersona();
persona.menorQue();
persona.mostrarPersona();
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 13">
        Curso curso = new Curso();
        curso.cargarAlumnos();
        curso.crearCurso();
        System.out.println("El resultado de las ganancias semanales es: " + curso.calcularGananciaSemanal());
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio 14">
        Movil movil = new Movil();
        movil.cargarCelular();
        System.out.println("Codigo IMEI: " + Arrays.toString(movil.getCodigo()) );
//// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio Extra 4">
        NifService nif = new NifService();
        nif.crearNif();
        nif.mostrar();
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" Ejercicio Extra 5">
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int incognita = (int) (Math.random() * (meses.length));
        String mesSecreto = meses[incognita];
        
        do {
            System.out.println("--------Juego de adivana el mes--------");
            System.out.println("¿Puedes adivinar es el mes magíco?, ingresa cual seria: ");
            String mesCorrecto =consola.next().toLowerCase();
            if (mesCorrecto.equals(mesSecreto)) {
                System.out.println("Has acertado el mes magico, te invito un brownie :)");
                break;
            }else {
                System.out.println("No es el mes magíco :)... intentalo de nuevo");
            }
    
        } while (true);
//// </editor-fold>
//// <editor-fold defaultstate="collapsed" desc=" Ejercicio Extra 6">
Ahorcado ahorcado = new Ahorcado();
ahorcado.crearJuego();
// </editor-fold>
    }//fin main
}// fin 
