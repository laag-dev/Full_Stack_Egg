package entidad;

import java.util.Scanner;

public class PersonaImc {

    Scanner consola = new Scanner(System.in);

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

// Un constructor por defecto.
    public PersonaImc() {
    }

//Un constructor con todos los atributos como par�metro.
    public PersonaImc(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

//M�todos getters y setters de cada atributo.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//Metodo crearPersona(): el m�todo crear persona, le pide los valores de los atributos
//al usuario y despu�s se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Adem�s, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deber� mostrar un mensaje
    public void crearPersona() {
        System.out.println("*****Calculadora de IMC*****");
        System.out.println("Ingrese su nombre: ");
        nombre = consola.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = consola.nextInt();
        do {
            System.out.println("Ingrese su sexo, con la letra que se identifique �H� �M� �O�: ");
            sexo = consola.next().toUpperCase().charAt(0);
            String letra = String.valueOf(sexo);

            if (letra.equals("H") || letra.equals("M") || letra.equals("O")) {
                System.out.println("Se guardo la informacion.");
                break;
            } else {
                System.out.println("Error: valor de sexo inv�lido. \nIntroduzca 'H' para hombre, 'M' para mujer o 'O' para otro: ");
            }

        } while (true);

        System.out.print("Introdzca su peso en kilogramos (KG): ");
        peso = consola.nextDouble();
        System.out.print("Introduce la altura en metros (MTS): ");
        altura = consola.nextDouble();
    }
    
// M�todo calcularIMC(): calculara si la persona est� en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta f�rmula da por resultado un valor menor que 20,
//significa que la persona est� por debajo de su peso ideal y la funci�n devuelve un -1.
//Si la f�rmula da por resultado un n�mero entre 20 y 25 (incluidos), significa que la
//persona est� en su peso ideal y la funci�n devuelve un 0. Finalmente, si el resultado
//de la f�rmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//funci�n devuelve un 1.
    public double calcularImc() {
        double pesoIdeal = peso / (Math.pow(altura, 2));
        if (pesoIdeal < 20) {
            System.out.println("Su peso esta por debajo del peso ideal.");
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println("Esta en su peso ideal.");
            return 0;
        } else {
            System.out.println("Esta en sobrepeso.g");
            return 1;
        }
    }

//M�todo esMayorDeEdad(): indica si la persona es mayor de edad. La funci�n
//devuelve un booleano.
    public boolean mayorEdad() {
        return edad >= 18;
    }

}
