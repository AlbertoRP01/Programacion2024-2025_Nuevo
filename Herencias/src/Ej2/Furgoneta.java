package Ej2;

public class Furgoneta extends Vehiculo {
    //ATRIBUTOS
    private final double pma;

    //CONSTRUCTOR
    public Furgoneta(String matricula, TGama gama, int numDias, double pma) {
        super(matricula, gama, numDias);
        this.pma = pma;

    }

    /**
     * CALCULAMOS EL PRECIO DEL ALQUILER  POR EL PESO MAXIMO DE LA FURGONETA
     * @return Te devuelve el precio total del alquiler
     */
    public double calcularPrecioPeso() {
        return (super.calcularPrecioAlquilerPorDias()) + (pma * 0.5);
    }

}
