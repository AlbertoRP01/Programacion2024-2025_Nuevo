package Ej2;

public abstract class Vehiculo {
    // ATRIBUTOS
    private String matricula;
    protected TGama gama;
    protected int numDias;

    //CONSTRUCTOR
    public Vehiculo(String matricula, TGama gama, int numDias) {
        this.matricula = matricula;
        this.gama = gama;
        this.numDias = numDias;
    }
// GETTERS
    public String getMatricula() {
        return matricula;
    }

    public TGama getGama() {
        return gama;
    }

    public int getNumDias() {
        return numDias;
    }

    /**
     * CALCULA EL PRECIO DEL ALQUILER EN BASE A LOS DIAS  QUE PASE CON EL COCHE
     *
     * @return TE DEVUELVE DICHA OPERACION HECHA
     */
    public double calcularPrecioAlquilerPorDias() {
        return gama.getPrecioBase() * numDias;
    }

}
