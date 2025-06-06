package Ficheros;

import java.time.LocalDate;

public class FicheroEjecutable extends FicheroBinario implements Analizable {
    private int permisos;

    public FicheroEjecutable(String nombre,  Byte[] informacion, int permisos) {
        super(nombre, informacion);
        this.permisos = permisos;
    }

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }

    @Override
    public void analizar() {
        System.out.println("Analizamos el fichero" + this.getNombre());
    }
}
