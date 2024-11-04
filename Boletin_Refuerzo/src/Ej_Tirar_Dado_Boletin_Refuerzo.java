import java.util.Random;
import java.util.Scanner;

public class Ej_Tirar_Dado_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int dado;
        int numCara;
        do {
            System.out.println("Introduce el numero de caras");
            numCara = sc.nextInt();
            System.out.println("Se lanza el dado");
            dado = ran.nextInt(0, numCara);
        } while (numCara <= 1);
        System.out.println("El numero que ha salido al lanzar el dado es  " + dado);
    }
}
