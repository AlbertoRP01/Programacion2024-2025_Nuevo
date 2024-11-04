public class Ej1_Boletin_Arrays {
    public static void main(String[] args) {
        int[] numeros = {5, 20, 10, 25, 50};
        int suma = 0;

        for (int i = 0; i < numeros.length; i += 2) {
            suma += numeros[i];

        }
        System.out.println("La suma de los elementos -> " + suma);
    }
}
