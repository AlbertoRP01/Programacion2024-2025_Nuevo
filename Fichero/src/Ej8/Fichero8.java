package Ej8;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Fichero8 {
    public static void main(String[] args) {
        Path fichero = Path.of("src/Modelo/hola");
        try (Stream<String> flujo = Files.lines(fichero)) {
            flujo.filter(linea -> linea.matches("^\\p{L}{2,}\\s+\\p{L}{2,}\\s+\\p{L}{2,}\\s+([\\d]|[\\d][\\d])$"))
                    .forEach(linea -> System.out.println("Línea correcta " + linea));
        } catch (IOException e) {
            System.out.print("Error: " +e.getMessage());
        }
    }
}
