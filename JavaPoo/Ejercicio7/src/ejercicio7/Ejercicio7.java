package ejercicio7;

import entidad.PersonaImc;

public class Ejercicio7 {

    public static void main(String[] args) {

//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea a�adir alg�n otro
//atributo, puede hacerlo.
//A continuaci�n, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuaci�n, llamaremos todos
//los m�todos para cada objeto, deber� comprobar si la persona est� en su peso ideal,
//tiene sobrepeso o est� por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por �ltimo, guardaremos los resultados de los m�todos calcularIMC y esMayorDeEdad en
//distintas variables, para despu�s en el main, calcular un porcentaje de esas 4 personas
//cuantas est�n por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//tambi�n calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores      
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