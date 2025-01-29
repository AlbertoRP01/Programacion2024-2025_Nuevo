package Ficheros;

import java.time.LocalDate;
import java.util.IllegalFormatCodePointException;

public class FicheroApp {
    public static void main(String[] args) {


        FicheroEjecutable f1 = new FicheroEjecutable("fichero1", crearArray(), 775);
        FicheroVideo fV = new FicheroVideo("ficherov", crearArray(), 10);
        FicheroAudio fA = new FicheroAudio("ficheroA", crearArray(), 20);
        FicheroImagen fI = new FicheroImagen("ficheroI", crearArray(), TFormato.JPG);
        String[] p1 = new String[]{"fufhufhifif", "fhwuifhwfw0fhw`0fhwfh", "fgy0f9y20fhbuweo2`fhgfgw`fe"};
        FicheroTextoPlano fTP = new FicheroTextoPlano("ficheroTP", p1);
        String[] p2 = new String[]{"fuiwhgfiufh", "fsiofwofwoegfhwoi", "qu903yufr0920fd029fuj"};
        FicheroTextoFormateado fTF = new FicheroTextoFormateado("ficheroTF", p2, TFuentes.ARIAL, "verde", 30);

        Fichero[] ficheros = new Fichero[]{f1, fV, fA, fI, fTP, fTP};
        for (Fichero fichero : ficheros) {
            if (fichero instanceof Analizable) {
                Analizable a = (Analizable) fichero;
            }
            if (fichero instanceof Leible) {
                Leible l = (Leible) fichero;

            }
            if (fichero instanceof Representable) {
                Representable r = (Representable) fichero;

            }
            if (fichero instanceof Reproducible reproducible) {
                reproducible.reproducir();
            }

        }
    }


    public static Byte[] crearArray() {

        int tamano_Array = (int) (Math.random() * 999) + 1;
        return new Byte[tamano_Array];
    }
}
