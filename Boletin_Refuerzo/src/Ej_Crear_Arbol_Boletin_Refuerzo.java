
import java.util.Scanner;

public class Ej_Crear_Arbol_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - 1 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
