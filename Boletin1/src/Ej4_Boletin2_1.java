import java.util.Scanner;

public class Ej4_Boletin2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int vida = 5;
        int num_aleatorio = (int) (Math.random() * 100) + 1;//introducimos el numero aleatorio
        do {
            System.out.println("introduce el numero");
            num = sc.nextInt();
            if (num < num_aleatorio && num > 1 && num < 100) {
                System.out.println(num + " esta por debajo ");

            } else if (num > num_aleatorio && num > 1 && num < 100) {
                System.out.println(num + " esta por encima");

            } else if ( num < 1 || num > 100) {
                System.out.println("error vuelve a introcir");
            }
            vida--;
        } while (vida > 0 && num != num_aleatorio);
        sc.close();
        if (num == num_aleatorio) {
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }


    }

}

