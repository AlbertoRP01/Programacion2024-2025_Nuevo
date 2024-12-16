import java.util.Scanner;

public class RectanguloAPP {

    public static void main(String[] args) {
        int longitud;
        int ancho;
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo(); //creamos el objerto rectangulo


        boolean parametroCorrecto = false;
        do {
            try {
                System.out.println("Introduce la longitud del rectangulo");
                longitud = sc.nextInt();
                rectangulo.setLongitud(sc.nextInt());
                parametroCorrecto = true;
            } catch (RectanguloException e) {
                System.out.println(e.getMessage());
            }
        } while (!parametroCorrecto);
        parametroCorrecto = false;
        do {


            try {
                System.out.println("introduce el ancho del rectangulo");
                rectangulo.setAncho(sc.nextInt());
                parametroCorrecto = true;
            } catch (RectanguloException e) {
                System.out.println(e.getMessage());
            }
        }while (!parametroCorrecto);

        System.out.println("El perimmetro del rectangulo es " + rectangulo.calcularPerimetro());
        System.out.println("El area del rectangulo es " + rectangulo.calcularArea());

    }
}