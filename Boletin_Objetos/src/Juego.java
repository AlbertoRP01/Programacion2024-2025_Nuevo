import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    private Carta[] baraja;


    public Juego() {
        baraja = new Carta[12 * Carta.PALOS.length];
        for (int i = 0; i < Carta.PALOS.length; i++) {
            for (int j = 1; j <= 12; j++) {
                baraja[i * 12 + j - 1] = new Carta(Carta.PALOS[i], j);
            }
        }
    }

    /*public static void mostrarMenu() {
        int opcion = 0;
        do {
            try {
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                }
            } catch ()
        } while (opcion > 4);
   } */
    public String mostrarBaraja() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baraja.length; i++) {
            sb.append(baraja[i]).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void barajar() {

        Random random = new Random();
        for (int i = 0; i < baraja.length; i++) {
            int nuevaPosicion = random.nextInt(baraja.length);
            Carta temporal = baraja[i];
            baraja[i] = baraja[nuevaPosicion];
            baraja[nuevaPosicion] = temporal;
        }
    }

    public void repartir(int numJugadores, int numCartas) throws JuegoException {

        if (numJugadores * numCartas > baraja.length) {
            throw new JuegoException("No hay cartas suficientes para repartir");
        }
        for (int i = 0; i < numJugadores; i++) {
            for (int j = 0; j < numCartas; j++) {
                System.out.printf("Se reparte al jugador %d la carta %s \n ", i + 1, baraja[numCartas * i + j]);


            }
        }
        this.baraja = Arrays.copyOfRange(this.baraja, numCartas * numJugadores, baraja.length );
    }
}
