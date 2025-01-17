package Ej2;

public class Coche extends Vehiculo {
    // ATRIBUTOS
    private final Tcombustible combustible;

    //CONSTRUCTOR
    public Coche(String matricula, TGama gama, Tcombustible combustible, int numDias) {
        super(matricula, gama, numDias);
        this.combustible = combustible;
    }


    /**
     * CALCULAMOS EL PRECIO DEL COMBUSTIBLE ADAPTADO AL COCHE
     *
     * @param cantidad
     * @return TE DEVUELVE LA OPERACION HECHA
     */
    public double calcularPrecioCombustible(double cantidad) {
        return (super.gama.getPrecioBase()) + combustible.getPrecioBase() + cantidad;
    }

}


