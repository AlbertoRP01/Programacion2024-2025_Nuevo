package PracticaString;

import com.sun.security.jgss.GSSUtil;

public class Ej1 {
    public static void main(String[] args) {
        String cadena = MiEntradaSalida.solicitarCadena("Introduce una frase");
        cadena = cadena.trim();

        if ( cadena.isBlank()){
            System.out.println("Esta vacio");

        }
        //Elimina los espacios al principio y al final
        System.out.println(cadena);
        //Comprueba si la frase  empieza con la palbra "Hola" (usa startswith) e indicalo por pantalla
        if (cadena.startsWith("Hola")){

        }
        // Convierte la frase  a minusculas y reemplaza todas las vocales 'a' por ''.Muestra el resultado(usa toLowerCase y replace)
        System.out.println("La frase empieza por Hola");
        cadena = cadena.replaceAll("a", "").toLowerCase();
        System.out.println(cadena);

        // divide la frase  en palabras y muestra cuantas palabras contiene (usa split).
        String[] parts = cadena.split(" ");
        int contador = 0;
        for(String s : parts){
            System.out.println(s + " " + contador++);

        }
        System.out.println(contador);
        //Solicitar a un usuario que ingrese una nueva. Inserta esta palabra al inicio  de la frase  usando un objeto StringBuilder+
        StringBuilder sb = new StringBuilder(cadena);
        String palabraNueva = MiEntradaSalida.solicitarCadena("Introduce la palabra que quieras al inicio");
        sb.insert(0, palabraNueva);
        cadena = sb.toString();
        //Verifica si la frase original contiene la nueva  palbra ingresada  (USA CONTAINS)
        if (cadena.contains(palabraNueva)){
            System.out.printf("La frase contiene palbra %s ", palabraNueva);

        }
        //Invierte la frase uilizando  el metodo reverse  de Stringbuilder y muestrala por pantalla.
        sb = new StringBuilder(cadena);
        cadena = sb.reverse().toString();
        System.out.println(cadena);
        //Muestra la capacidad actual del StringBuilder (usa Capacity).
        System.out.println("La capacidad del StringBuilder " + sb.capacity());


    }
}
