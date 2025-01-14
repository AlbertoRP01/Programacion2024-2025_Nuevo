package Ej2;

public class Coche extends  Vehiculo{
    private  Tcombustible combustible;
    public Coche(String matricula, TGama gama) {
        super(matricula, gama);
    }

    public Tcombustible getCombustible() {
        return combustible;
    }

}
