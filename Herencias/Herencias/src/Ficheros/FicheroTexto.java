package Ficheros;

import java.time.LocalDate;

public abstract class FicheroTexto extends Fichero implements Leible {

    private String[] parrafos;

    public FicheroTexto(String nombre, String[] parrafos) {
        super(nombre);
        this.parrafos = parrafos;
    }

    public String[] getParrafos() {
        return parrafos;
    }

    public void setParrafos(String[] parrafos) {
        this.parrafos = parrafos;
    }

    @Override
    public long getTamano() {
        long acumunlador = 0;
        for (int i = 0; i < parrafos.length; i++) {
            acumunlador += parrafos[i].length();
        }
        return acumunlador;
    }

    @Override
    public String leer() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parrafos.length; i++) {

            sb.append(parrafos[i]);
        }
        return sb.toString();
    }
}
