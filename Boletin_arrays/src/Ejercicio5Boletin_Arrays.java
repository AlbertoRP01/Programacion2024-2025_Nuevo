import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5Boletin_Arrays {
    public static final int TAMANNO = 1000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array;
       // arrayAleatorio(array);
    }

    private static void arrayAleatorio() {
        int[] array = new int[TAMANNO];
        for (int i = 0; i < array.length) {
            array[i] = (int) (Math.random() * 999 + 1);
        }
    }
}
