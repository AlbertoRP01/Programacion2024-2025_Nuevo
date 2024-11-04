import java.util.Scanner;

public class Ej_Tirar_Dado_B_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCara;
        do {
            System.out.println("¿Cuantas caras tiene el dado?");
            numCara = sc.nextInt();
        } while (numCara <= 1);
        for (int i = 0; i < 20; i++) {
            int numAleatorio = (int) (Math.random() * numCara) + 1;
            System.out.printf("Tirada %d/%d: %d\n", (i + 1), 20, numAleatorio);
        }
    }
}
