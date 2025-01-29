package Ej4;

public class Rectangulo extends Forma implements Dibujable {

    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo");
    }
}
