import java.util.Scanner;

public class Ej_Dibujar_Cuadrado_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura");
        int altura = sc.nextInt();
        System.out.println("Introduce la Anchura");
        int anchura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*   ");

            }
            System.out.println("*");
        }
    }
}
