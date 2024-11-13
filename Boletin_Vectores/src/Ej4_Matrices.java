public class Ej4_Matrices {
    public static void main(String[] args) {
            devolverMatriz();
    }

    public static void devolverMatriz() {
        String  cadenas = " ";
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length- 1; j >= 0; j--) {


                cadenas += matriz[i][j];
            }
        }
        System.out.println(cadenas);
    }
}
