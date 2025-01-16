package Ej2;

public class Microbus extends Vehiculo {
    //ATRIBUTOS
    private final int plaza = 5;
    private int numPlaza;
    //CONSTRUCTOR
    public Microbus(String matricula, TGama gama, int numPlaza, int numDias) {
        super(matricula, gama, numDias);
        this.numPlaza = numPlaza;

    }


    public double precioAlquilerPorplaza() {

        return (super.calcularPrecioAlquilerPorDias()) + (plaza * numPlaza);
    }
}
