public class Ej2_Matrices {
    public static void main(String[] args) {
        System.out.println("La suma de las posiciones es " + matrizSuma());
    }

    public static int matrizSuma() {
        int suma = 0; //Utilizamos una variable llamado suma que hace de acumulador
        int[][] matrizSuma = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {

                suma += matrizSuma[i][j]; // aqui contiene la suma de la matriz

            }
        }
        return suma;
    }
}
