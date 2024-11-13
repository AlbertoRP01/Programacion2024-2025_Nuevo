import java.util.Scanner;

public class Ej1_Matrices {


    public static void main(String[] args) {
        int[][] matrizcreada = matriz();
        boolean negativos = hayNegativos(matrizcreada);
        if (negativos) {
            System.out.println("Hay negativos");
        } else
            System.out.println("No existen negativos");
    }

    public static int[][] matriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear una matriz");
        System.out.println("Ingrese el valor de las filas = ");
        int size_filas = sc.nextInt();
        System.out.println("Ingree el valor columnas = ");
        int columnas = sc.nextInt();
        int[][] matriz = new int[size_filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese los elementos de la matriz");
                int elementos = sc.nextInt();
                matriz[i][j] = elementos;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + "\t");

            }
            System.out.println();
        }
        sc.close();
        return matriz;

    }

    public static boolean hayNegativos(int[][] matrizCreada) {
        for (int i = 0; i < matrizCreada.length; i++) {
            for (int j = 0; j < matrizCreada[i].length; j++) {
                if (matrizCreada[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
