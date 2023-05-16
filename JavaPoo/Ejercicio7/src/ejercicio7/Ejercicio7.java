package ejercicio7;

import entidad.PersonaImc;

public class Ejercicio7 {

    public static void main(String[] args) {

//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores      
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
            } else if (persona[i].calcularImc() == 0) {
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
    }
}