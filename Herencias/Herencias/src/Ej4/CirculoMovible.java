package Ej4;

public class CirculoMovible extends Circulo implements Animable {

    public CirculoMovible(double radio) {
        super(radio);
    }

    @Override
    public void animar() {
        System.out.println("Simulando animacion");
    }

}
