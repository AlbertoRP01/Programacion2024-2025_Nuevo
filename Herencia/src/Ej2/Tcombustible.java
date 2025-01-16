package Ej2;

public enum Tcombustible {
    //TIPOS
    GASOLINA(3.5), DIESEL(2.0);

    //ATRIBUTOS
    private final double precioBase;

    //CONSTRUCTOR
    Tcombustible(double precioBase) {
        this.precioBase = precioBase;
    }

    //GETTER
    public double getPrecioBase() {
        return precioBase;
    }

}
