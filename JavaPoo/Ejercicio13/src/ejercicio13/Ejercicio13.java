package ejercicio13;

import entidad.Curso;

public class Ejercicio13 {

    public static void main(String[] args) {

//Un profesor particular est� dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la informaci�n de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos ser�n: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (ma�ana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensi�n 5 (cinco), donde se alojar�n los
//nombres de cada alumno. 
        Curso curso = new Curso();
        curso.cargarAlumnos();
        curso.crearCurso();
        System.out.println("El resultado de las ganancias semanales es: " + curso.calcularGananciaSemanal());

    }
}
