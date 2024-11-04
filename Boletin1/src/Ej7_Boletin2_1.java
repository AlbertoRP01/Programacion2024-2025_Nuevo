import java.util.Scanner;

public class Ej7_Boletin2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.println("Introduce un numero");
            num1 = sc.nextInt();

        }while (num1 < 1);
        do {
            System.out.println("Introduce otro numero");
            num2 = sc.nextInt();
        }while (num2 < 1 );

    }
}
