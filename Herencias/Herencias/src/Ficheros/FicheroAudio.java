package Ficheros;

import java.time.LocalDate;

public class FicheroAudio extends FicheroBinario implements Reproducible {

    private int duracion;

    public FicheroAudio(String nombre,  Byte[] informacion, int duracion) {
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
    public long getTamano() {
        return super.getTamano();
    }

    @Override
    public void reproducir() {
        System.out.println("reproduciendo" + super.getNombre());
    }
}
