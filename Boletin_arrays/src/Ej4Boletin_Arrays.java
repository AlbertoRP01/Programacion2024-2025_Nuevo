import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4Boletin_Arrays {
    static Scanner sc = new Scanner(System.in);
    static final int TAMANNO = 6000;

    public static void main(String[] args) {
        Random random = new Random();
        int[] miArray = new int[TAMANNO];
        rellenaArray(miArray);
        calcularMedia(miArray);
        numeroTerminacionMax(miArray);
        ultimoDigNulo(miArray);
        porcentajeDigTotalCreado(miArray);
    }

    /**
     * Rellena con numeros aleatorios el array pasado como parametro.
     * Los numeros aleatorios serán del 0 al 100
     *
     * @param miarray
     */
    public static void rellenaArray(int[] miarray) {
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = (int) (Math.random() * 101);
        }
    }

    private static double calcularMedia(int[] miArray) {
        int media = 0;
        for (int i = 0; i < miArray.length; i++) {
            media += miArray[i];
        }
        return (double) media / miArray.length;
    }


    private static void numeroTerminacionMax(int[] array) {
        int[] repeticionTerminaciones = new int[10];

        for (int i = 0; i < array.length; i++) {
            int digitoTermina = array[i] % 10;
            repeticionTerminaciones[digitoTermina]++;
        }
        int max = 0;
        int indiceMax = -1;
        for (int i = 0; i < repeticionTerminaciones.length; i++) {
            if (repeticionTerminaciones[i] < max) {
                max = repeticionTerminaciones[i];
                indiceMax = i;
            }
        }
        System.out.println(Arrays.toString(repeticionTerminaciones));
    }

    private static int ultimoDigNulo(int[] array) {
        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            array2[ultimoDigito]++;
        }
        int indice = -1;//Introducimos -1 para que no muestre un digito equivocado por si se repiten mucho
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 0) {
                indice = i;
            }
        }
        return indice;
    }

    private static void porcentajeDigTotalCreado(int[] array) {
            String numero = "";
            int[]digito = new int[10];
            int sumaporcentajes= 0;
        for (int i = 0; i < array.length; i++) {
            digito[array[i]%10]++;

            float porcentaje= (float) (array[i] *100)/TAMANNO;
            numero+="EL valor "+i+"se ha repetido"+digito[i]+ "veces, sale" ;

            numero+= "la suma total del porcentaje de las apariciones es: " + String.format("" + porcentaje);
            numero+="La media para cada valor debe estar en:"+String.format("" );
           // return; numero;


        }
    }

}