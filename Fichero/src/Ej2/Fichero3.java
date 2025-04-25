package Ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;



public class Fichero3 {
    public static void main(String[] args) {
        Path emptyFile = Path.of("src/Modulo/salida.txt");
        try (BufferedReader br = new BufferedReader( new InputStreamReader((System.in)));
        ){
            String l;
            while ((l = br.readLine()) != null && !l.equalsIgnoreCase("fin")){
                Files.writeString(emptyFile, l, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
