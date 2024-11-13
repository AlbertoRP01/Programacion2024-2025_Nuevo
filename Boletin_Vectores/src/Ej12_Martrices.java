import java.security.PublicKey;

public class Ej12_Martrices {
    public static void main(String[] args) {
        int[][] matrix = new int[5][6];
        int[][]matrix2 = new int[5][5];
        comprobarCuadrado(crearReflejo(matrix2));
    }

    private static boolean comprobarCuadrado(int[][]matriz) {
        int filas = matriz.length;
        for (int i = 0; i < matriz.length; i ++){
            if (filas != matriz[i].length){
                return  false;
            }

        }
        return true;
    }
private   static  int[][] crearReflejo(int[][] matriz){
        int[][] matrizEspejo = new int[matriz.length][matriz.length];
        for ( int i = 0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j ++){
                matrizEspejo[i][j] = matriz[j][i];

            }
        }
        return matrizEspejo;
    }
}
