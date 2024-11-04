public class Ej2_Boletin_Arrays {
    public static void main(String[] args) {

        int[] miArray = {-1, 2, 5, -3, 7, -8};

        int contador = contarNumerosNegativos(miArray);
        System.out.println("Los numeros negativo que hay en este array son " + contador);
    }

    private static int contarNumerosNegativos(int[] miarray) {
        int contador = 0;
        for (int i = 0; i < miarray.length; i++) {
            if (miarray[i] < 0) {
                contador++;

            }
        }
        return contador;
    }
}
