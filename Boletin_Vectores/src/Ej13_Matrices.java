public class Ej13_Matrices {
    public static void main(String[] args) {
        int[][] matriz =
                {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 0},
                        {3, 2, 1, 4, 5},
                        {9, 5, 8, 6, 7},
                        {0, 9, 8, 5, 4}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d", matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
            transformarMatrizInversa(matriz);
    }

    public static int[][] transformarMatrizInversa(int[][] matriz) {
        int[][] newMatrix = new int[matriz.length][matriz.length];
        for (int i =0; i <matriz.length; i ++) {
            for (int j =0; j < matriz.length; j ++) {
                newMatrix[j][i] = matriz[matriz.length-1 -j][matriz.length-1-i];
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                System.out.printf("%d", newMatrix[i][j]);

            }
            System.out.println(" ");
        }
        return  newMatrix;
    }

}
