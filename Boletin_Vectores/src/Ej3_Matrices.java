public class Ej3_Matrices {
    public static void main(String[] args) {
            devolverMatriz();
    }

    public static void devolverMatriz() {
        int[][] matriz ={{1, 2}, {4, 5}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
