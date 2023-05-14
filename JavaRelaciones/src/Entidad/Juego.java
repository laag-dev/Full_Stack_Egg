package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    RevolverAgua revolver = new RevolverAgua();

    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        int jugadorMax = 6;
        int numJugador;
        System.out.println("Ingrese la cantidad de jugadores entre 1 y 6: ");
        numJugador = consola.nextInt();
        if (numJugador > 6 || numJugador < 1) {

            System.out.println("El numero ingresado esta fuera del limite, se toma por defecto: " + jugadorMax);
        } else {
            System.out.println("La cantidad de jugadores se establecio en: " + numJugador);
        }
        System.out.println("****Ingrese los datos del jugador****");
        do {
            System.out.println("Ingrese el ID del jugador: ");
            int idJugador = consola.nextInt();
            System.out.println("Ingrese el nombre del jugador: ");
            String nomJugador = consola.next();
            boolean mojadoJugador = false;
            jugadores.add(new Jugador(idJugador, nomJugador, mojadoJugador));
        } while (jugadores.size() < numJugador);

    }

    public void ronda() {

        revolver.llenarRevolver();

        for (int i = 0; i < 6; i++) {
            boolean fin = false;
            for (Jugador ronda : jugadores) {
                System.out.println("Es el turno de: " + ronda.getNombre());

                if (ronda.disparo(revolver)) {
                    fin = true;
                    System.out.println("Perdiste, jugador mojado :(  " + ronda.getNombre());
                    break;
                } else {
                    System.out.println("Te salvaste");
                }
            }
            if (fin) {
                break;
            }
        }

    }

}
