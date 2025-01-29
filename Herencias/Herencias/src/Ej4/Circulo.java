package Ej4;

public class Circulo extends Forma implements Dibujable {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }

    @Override
    double calcularArea() {
        return (Math.PI) * radio * radio;
    }
}
