import java.util.Scanner;

public class Ej2Boletin2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroInverso = 0;
        int numero;

        System.out.println("Introduce el numero ");
        numero = sc.nextInt();
        int numeroOriginal = numero;
        do {
            int resto = numero % 10;
            numeroInverso = numeroInverso * 10 + resto;
            numero = numero / 10;

        } while (numero != 0);

        if (numeroOriginal == numeroInverso){
            System.out.println( +numeroInverso+ " Es capicua ");
        }else
            System.out.println(" No es capicua");
    }
}
