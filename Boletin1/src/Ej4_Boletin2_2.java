/*
import com.sun.jdi.Value;

import java.util.Scanner;

public class Ej4_Boletin2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeroRom = "IX";
        int valorActual;
        int valorAnterior = Integer.MAX_VALUE;
        int temporal = 0;
        for (int i = 0; i < numeroRom.length(); i++) {
            char letra = numeroRom.charAt(i);
            valorActual = switch (letra) {

                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> 0;
            };
        }
        if (valorActual > valorAnterior ) {

        }

        dias = (hf + h2) / 24;

        hf = (hf + h2) % 24;


        System.out.printf("La hora resultante es %02d:%02d:%02d +%d dias",
               hf, mf, sf, dias);
        ;

    }
}
*/