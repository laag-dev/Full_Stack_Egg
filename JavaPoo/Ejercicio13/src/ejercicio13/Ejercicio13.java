package ejercicio13;

import entidad.Curso;

public class Ejercicio13 {

    public static void main(String[] args) {

//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. 
        Curso curso = new Curso();
        curso.cargarAlumnos();
        curso.crearCurso();
        System.out.println("El resultado de las ganancias semanales es: " + curso.calcularGananciaSemanal());

    }
}
