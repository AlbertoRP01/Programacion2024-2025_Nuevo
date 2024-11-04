import java.util.Scanner;

public class EjCrear_Triangulo_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.println("Introduce la altura ");
        altura = sc.nextInt();

        for (int i = 0;  i <altura; i ++ ){
           for (int j = 0 ; j <= i ; j ++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
