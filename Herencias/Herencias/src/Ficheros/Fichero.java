package Ficheros;

import java.time.LocalDate;

public abstract class Fichero {
    String nombre;
    private LocalDate fechaCreacion;


    public Fichero(String nombre) {
        this.nombre = nombre;

        this.fechaCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public abstract long getTamano();

    @Override
    public String toString() {
        return "Fichero{" +
                "nombre='" + nombre + '\'' +
                "tamano" + getTamano() +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
