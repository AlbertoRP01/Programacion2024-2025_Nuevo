import java.util.Scanner;

public class Ej_Grados_Celsius_A_Fahrenheit_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        System.out.println("Introduce los grado celsius");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println("Los grados fehrenheit son " + fahrenheit);

    }
}
