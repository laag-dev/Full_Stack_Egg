package service;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner consola = new Scanner(System.in);

    public ArrayList<Alumno> alumnos = new ArrayList();
    int cont = 1;
    String Alum;
    String nombreAlum;

    public void crearAlumno() {
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("   ********Base de datos notas alumnos********    ");
            System.out.println("--------------------------------------------------");
            System.out.println("Ingrese el nombre del alumno #: " + cont);
            nombreAlum = consola.nextLine().toUpperCase();

            ArrayList<Double> nota = new ArrayList();
            System.out.println("Ingrese las tres notas del alumno");
            for (int i = 1; i < 4; i++) {
                System.out.print(" Nota #" + i + ": ");
                nota.add(consola.nextDouble());
            }
            alumnos.add(new Alumno(nombreAlum, nota));
            consola.nextLine();
            System.out.println("--------------------------------------------------");
            System.out.println("¿Desea ingresar otro alumno? (Si/No): ");
            Alum = consola.nextLine().toUpperCase();
            cont++;
        } while (Alum.equals("SI"));
    }
    public void notaFinal(int nombreAlumno){
     double promedio;
     double suma = 0;
     for (int i = 0; i < 3; i++) {
            suma += alumnos.get(nombreAlumno).getNotas().get(i);
        } 
    }    
        
        
    
}
