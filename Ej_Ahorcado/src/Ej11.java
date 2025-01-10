import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej11 {
    private static final int NUM_FALLOS = 7;
    private static String palabraOculta = "Aprobar";
    private static StringBuilder palabraAMonstrar = new StringBuilder("_".repeat(palabraOculta.length()));
    private static int contadorFallos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        while (!terminado) {
            System.out.println(palabraAMonstrar);
            System.out.println("Ponga su palabra");
            char letra = sc.next().charAt(0);
            buscarLetra(letra);
            System.out.printf("Tiene %d fallos \n", contadorFallos);
            if (palabraOculta.equals(palabraAMonstrar.toString())) {
                System.out.println(palabraAMonstrar);
                System.out.println("¡Felicidades!! has ganado");
                terminado = true;
            } else if (contadorFallos == NUM_FALLOS) {
                System.out.println("Ha perdido");
                terminado = true;
            }
        }
    }

    public static void buscarLetra(char letra) {
        boolean letraEsta = false;
        for (int i = 0; i < palabraOculta.length(); i++) {
            if (palabraOculta.toLowerCase().charAt(i) == Character.toLowerCase(letra)) {
                palabraAMonstrar.replace(i, i + 1, palabraOculta.substring(i, i + 1));
                letraEsta = true;
            }

        }
        if (!letraEsta) {

            contadorFallos++;
        }
    }


}
