import java.util.Arrays;

public class Ejemplo {
    public static void main(String[] args) {
        int[]miArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(miArray));

        int suma = sumaArray(miArray);

        System.out.printf("La suma del array es %d", suma);

    }
    private  static int sumaArray(int[] miArray){
        int suma = 0;
        for (int i = 0; i < miArray.length; i++){
            suma += miArray[i];
        }
        return suma;
    }

    private  static int buscarElemento(int[] array, int elementoBuscado){
        for (int i = 0; i< array.length; i++){
            if (array[i] == elementoBuscado){
                return i;
            }
        }
        return -1;
    }
}
