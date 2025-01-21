package PracticaString;

import java.util.Arrays;

public class Ej2 {
    public static void main(String[] args) {
        String cadena = MiEntradaSalida.solicitarCadena("Introduce la cadena");
        //Separamos la cadena por espacios
        String[] partesCadena = cadena.split(" ");
        // creamos un StringBuilder para poder adjuntar y guardar las partes en las que hemos separado la cadena
        StringBuilder sb = new StringBuilder();
        // recorremos las partes de la cadena
        for (int i = 0; i < partesCadena.length; i++) {
            // Transformamos cada parte de la cadena a una cadena sin espacios a los lados
            partesCadena[i] = partesCadena[i].trim();
            // Si esa parte de la cadena contiene espacios en blando no esntra
            if (!partesCadena[i].isBlank()) {
                 char c = Character.toUpperCase(partesCadena[i].charAt(0));
                 partesCadena[i] = c+partesCadena[i].substring(1);
                //Añade esa parte de la cadena con espacios al final, para separarla de cada palabra
                sb.append(partesCadena[i]).append(" ");
            }
        }
        String cadenaSinEspacios = sb.toString();
        cadenaSinEspacios = cadenaSinEspacios.trim();
        System.out.println(cadenaSinEspacios);

        if(cadenaSinEspacios.charAt(cadenaSinEspacios.length())-1 != '.'){
            cadenaSinEspacios = cadenaSinEspacios + ".";
        }

    }
}
