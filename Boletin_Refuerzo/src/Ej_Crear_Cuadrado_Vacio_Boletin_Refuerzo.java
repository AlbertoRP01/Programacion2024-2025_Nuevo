import java.util.Scanner;

public class Ej_Crear_Cuadrado_Vacio_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanno;
        System.out.println("Introduce  el tamaño");
        tamanno = sc.nextInt();
        for (int i = 0; i < tamanno; i++){ // GENERA LA FILA
            for (int j= 0; j < tamanno ; j ++){// GENERA LA COLUMNA
                if (j == 0 || j == tamanno -1){//En la columna , en el caso de que sea 0 o que sea igual al tamaño entonces  te genera la fila
                    System.out.print("*"); // te imprime la columna
                } else if (i == 0  || i == tamanno -1) { //En la fila pasa lo mismo que con la columna
                    System.out.print("*"); //Te imprime la fila
                }else  {  // Crea espacio en las posiciones
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
