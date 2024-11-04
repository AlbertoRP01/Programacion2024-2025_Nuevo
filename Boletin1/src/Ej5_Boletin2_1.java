import java.util.Scanner;

public class Ej5_Boletin2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esPrimo = true;
        do {
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
        } while (numero < 0);

        if (numero % 2 == 0) {
            esPrimo = false;
        }

        for (int i = 3; i < numero / 2 && esPrimo; i = i + 2) {
            System.out.println(i);
            if (numero % i == 0) {
                esPrimo = false;

            }


        }
        if (esPrimo) {
            System.out.println(" El  numero " + numero + " Es primo ");
        } else
            System.out.println("El numero " + numero + " no es primo ");
    }
}
