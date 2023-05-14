package poo;

import Entidad.PersonaImc;

public class Ejercicio7 {

    public static void main(String[] args) {

//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo. Los métodos que se implementarán son:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//
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
