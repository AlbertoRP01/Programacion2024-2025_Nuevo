package Ficheros;

import java.time.LocalDate;

public class FicheroImagen extends FicheroBinario{

    private TFormato formato;

    public FicheroImagen(String nombre,  Byte[] informacion, TFormato formato) {
        super(nombre,  informacion);
        this.formato = formato;
    }

    @Override
    public long getTamano() {
        return super.getTamano();
    }

}
