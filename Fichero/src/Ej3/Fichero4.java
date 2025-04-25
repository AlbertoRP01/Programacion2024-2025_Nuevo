package Ej3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Fichero4 {
    public static void main(String[] args) {
        Path path = Paths.get("src/Modelo/salida.txt");
        try (Stream<String> stream = Files.lines(path)) {
            stream.filter(l -> l.toLowerCase().startsWith("a")).forEach(System.out::println);
            System.out.println(stream.mapToInt(String::length).sum());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
