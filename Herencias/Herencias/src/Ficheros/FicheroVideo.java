package Ficheros;

import java.time.LocalDate;

public class FicheroVideo extends FicheroBinario implements Reproducible {

    private int duracion;

    public FicheroVideo(String nombre,  Byte[] informacion, int duracion) {
        super(nombre,  informacion);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + getNombre());
    }

    @Override
    public long getTamano() {
        return super.getTamano();
    }
}
