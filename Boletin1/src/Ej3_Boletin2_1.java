import java.util.Scanner;

public class Ej3_Boletin2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println("El numero" +numero+ " tiene " + numero +" cifras");
        int numcifras= 0;

        while (numero!=0){
            numcifras ++;
            numero = numero/10;
        }
        System.out.println(" El numero tiene " +numcifras+ " cifras");
    }
}
