package Ej2;

public enum Tcombustible {
    GASOLINA  (3.5),DIESEL (2.0);

    private final double precioBase;

    Tcombustible(double precioBase) {
        this.precioBase = precioBase;
    }

}
