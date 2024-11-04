import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // La llamada a pirntln imprime por pantalla el mensaje
        System.out.println("Hola.¿Como te llamas?");

        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        System.out.println("buenos dias " + nombre);

    }
}
