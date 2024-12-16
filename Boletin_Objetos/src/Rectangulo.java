public class Rectangulo {

    private int longitud;
    private int ancho;

    public Rectangulo() {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws RectanguloException {
        if (longitud <= 0 || longitud > 20) {
            throw new RectanguloException("Error");
        }
        this.longitud = longitud;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {
        if (ancho <= 0 || ancho > 20) {
            throw new RectanguloException("Error");
        }
        this.ancho = ancho;
    }

    public float calcularPerimetro() {
        return 2 * (longitud * ancho);
    }

    public float calcularArea() {
        return longitud * ancho;
    }
}
