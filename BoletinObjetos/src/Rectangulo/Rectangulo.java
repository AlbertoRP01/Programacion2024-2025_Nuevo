package Rectangulo;

public class Rectangulo {
    private final double LONGITUD_MAX = 20;
    private final double LONGITUD_MIN = 0;
    private final double ANCHO_MAX = 20;
    private final double ANCHO_MIN = 0;
    private double longitud = 1;
    private double ancho = 1;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud <= LONGITUD_MIN && longitud >= LONGITUD_MAX) {
            throw new RectanguloException("Error, la longitud que has introducido no es correcta");
        }
        this.longitud = longitud;
    }

    public double getAncho() {

        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho <= ANCHO_MIN && ancho >= ANCHO_MAX) {
            throw new RectanguloException("Error, El ancho que has introducido no es correcta");
        }
        this.ancho = ancho;
    }

    public double calcularPerimetro() {
        double almacen;
        almacen = longitud * 4;
        return almacen;
    }

    public double calcularArea() {
        double almacen;
        almacen = longitud * ancho;
        return almacen;
    }
}
