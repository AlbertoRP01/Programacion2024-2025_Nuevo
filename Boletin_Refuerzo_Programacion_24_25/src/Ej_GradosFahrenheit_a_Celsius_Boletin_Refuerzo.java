import java.util.Scanner;

public class Ej_GradosFahrenheit_a_Celsius_Boletin_Refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahremheit;
        System.out.println("Introduce grado Fahremheit");
        fahremheit = sc.nextDouble();

        celsius = (fahremheit - 32)  * 5 /9;

        System.out.println("grados celsius son " + celsius);
    }
}
