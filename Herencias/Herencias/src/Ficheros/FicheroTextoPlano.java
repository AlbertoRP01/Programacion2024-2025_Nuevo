package Ficheros;

import java.time.LocalDate;

public class FicheroTextoPlano extends FicheroTexto implements Representable, Analizable {

    public FicheroTextoPlano(String nombre,  String[] parrafos) {
        super(nombre, parrafos);
    }

    @Override
    public void representar() {
        for (int i = 0; i < super.getParrafos().length; i++) {
            System.out.println(super.getParrafos()[i]);
        }
    }

    @Override
    public void analizar() {
        System.out.println("Analizando fichero" + getNombre());
    }
}
