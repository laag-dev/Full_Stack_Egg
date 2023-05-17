package entidad;

import java.util.Scanner;

public class Curso {

    Scanner consola = new Scanner(System.in);
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

//Un constructor por defecto.
//Un constructor con todos los atributos como par�metro. 
    public Curso() {
    }

//M�todos getters y setters de cada atributo.
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

//M�todo cargarAlumnos(): este m�todo le permitir� al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta informaci�n
//en un arreglo e iterar con un bucle, solicitando en cada repetici�n que se ingrese el
//nombre de cada alumno.
    public void cargarAlumnos() {

        alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno n�mero " + (i + 1) + ": ");
            alumnos[i] = consola.next();
        }
    }
    
//M�todo crearCurso(): el m�todo crear curso, le pide los valores de los atributos al
//usuario y despu�s se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este m�todo invocaremos al m�todo cargarAlumnos() para asignarle valor
//al atributo alumnos
    public void crearCurso() {

        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = consola.nextLine();
        System.out.print("Ingrese la cantidad de horas por d�a: ");
        cantidadHorasPorDia = consola.nextInt();
        System.out.print("Ingrese la cantidad de d�as por semana: ");
        cantidadDiasPorSemana = consola.nextInt();
        System.out.print("Ingrese el turno (ma�ana/tarde): ");
        turno = consola.next();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = consola.nextDouble();
        cargarAlumnos();
    }
    
//M�todo calcularGananciaSemanal(): este m�todo se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//d�a, el precio por hora, la cantidad de alumnos y la cantidad de d�as a la semana que
//se repite el encuentro.  
    public double calcularGananciaSemanal(){
        return  cantidadHorasPorDia*precioPorHora*5*cantidadDiasPorSemana; 
    }

}




