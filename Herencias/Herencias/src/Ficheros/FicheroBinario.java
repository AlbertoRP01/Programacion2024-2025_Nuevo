package Ficheros;

import java.time.LocalDate;
import java.util.Stack;

public class FicheroBinario extends Fichero {
    Byte[] informacion;


    public FicheroBinario(String nombre, Byte[] informacion) {
        super(nombre);
        this.informacion = informacion;
    }

    public Byte[] getInformacion() {
        return informacion;
    }

    public void setInformacion(Byte[] informacion) {
        this.informacion = informacion;
    }

    @Override
    public long getTamano() {
        return informacion.length;
    }
}
