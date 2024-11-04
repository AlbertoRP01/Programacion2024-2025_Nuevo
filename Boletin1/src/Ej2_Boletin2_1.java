import java.util.Scanner;

public class Ej2_Boletin2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        do {

            System.out.println("Introduce la base"); //Introduzco la base
            base = sc.nextInt();
        } while (base < 0); // el bucle se repite si base y exponente son menores que cero
        do {
            System.out.println("Introduce el exponente"); // Introduzco el exponente
            exponente = sc.nextInt();
        } while (exponente < 0);
        sc.close(); // cerramos el teclado
        int acumulador = 1;
        for (int i = 0; i < exponente; i++) {
            acumulador = acumulador * base;
        }
        System.out.println(base + " elevado a " + exponente + " igual a " + acumulador);
    }

}
