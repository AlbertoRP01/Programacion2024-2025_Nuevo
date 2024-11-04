import java.util.Scanner;

public class Ej1Boletin2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroInverso = 0;
        int numero;
        System.out.println("Introduce el numero ");
        numero = sc.nextInt();
        do {
            int resto = numero % 10;
            numeroInverso = numeroInverso * 10 + resto;
            numero = numero / 10;

        } while (numero != 0);
        System.out.println("el numero es " + numeroInverso);
    }

}
