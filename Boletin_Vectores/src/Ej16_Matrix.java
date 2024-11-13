import java.util.Arrays;

public class Ej16_Matrix {
    public static void main(String[] args) {
        int[][] matriz =
                {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 0},
                        {3, 2, 1, 4, 5},
                        {9, 5, 8, 6, 7},
                        {0, 9, 8, 5, 4}};
        int[][] matrizAdyacente = crearMatrizAdyacentesPares(matriz);
            for (int i = 0; i < matrizAdyacente.length; i++){
                System.out.println(Arrays.toString(matrizAdyacente[i]));
            }
    }

    private static int[][] crearMatrizAdyacentesPares(int[][] matrizNumeros) {
        int[][] matrizAdyacentesPares = new int[matrizNumeros.length][matrizNumeros[0].length];

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                matrizAdyacentesPares[i][j] = cuentaAdyacentesPares(matrizNumeros, i, j);
            }
        }

        return matrizAdyacentesPares;
    }

    private static int cuentaAdyacentesPares(int[][] matrizNumeros, int i, int j){
        int numeroPares = 0;

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < matrizNumeros.length
                        && l >= 0 && l < matrizNumeros[0].length
                        && !(k == i && l == j)) {

                    if (matrizNumeros[k][l] % 2 == 0) {
                        numeroPares++;
                    }
                }
            }
        }

        return numeroPares;
    }
}