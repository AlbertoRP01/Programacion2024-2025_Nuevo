package Ej6;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class Fichero6 {
    public static void main(String[] args) {
        /*try {
            creardirectorio("hola|");
        } catch (DirectorioException e) {
            System.out.println(e.getMessage());
        }
        try {
            crearDirectorioNio("adios|");
        } catch (DirectorioException e) {
            System.out.println(e.getMessage());
        }
        */
        try {

            crearFicheroDeTexto("chelu", "tus muertos");
        } catch (DirectorioException e) {
            System.out.println(e.getMessage());
        }
        try {
            borrarFicheroDeTexto("chelu");
        } catch (DirectorioException e) {
            System.out.println(e.getMessage());
        }
        try {
            mostrarFicheroCarpeta("chelu");
        } catch (DirectorioException e) {
            System.out.println(e.getMessage());
        }
        try {
            mostrarPeso();
        }catch (DirectorioException e ){
            System.out.println(e.getMessage());
        }
    }

    public static File creardirectorio(String nombre) throws DirectorioException {

        File directorio = new File("src/Modulo/" + nombre);

        if (!directorio.mkdir()) {
            throw new DirectorioException("No se puede crear el directorio");
        }
        return directorio;
    }

    public static Path crearDirectorioNio(String nombre) throws DirectorioException {

        try {
            Path directorioNio = Path.of("src/Modulo/" + nombre);
            Files.createDirectory(directorioNio);
            return directorioNio;
        } catch (FileAlreadyExistsException e) {
            throw new DirectorioException(e.getMessage());
        } catch (IOException e) {
            throw new DirectorioException(e.getMessage());
        } catch (InvalidPathException e) {
            throw new DirectorioException(e.getMessage());
        }
    }

    public static Path crearFicheroDeTexto(String nombre, String contenido) throws DirectorioException {
        try {
            Path ficheroNio = Path.of("src/Modulo/" + nombre);
            Files.createFile(ficheroNio);
            Files.writeString(ficheroNio, contenido);
            return ficheroNio;
        } catch (FileAlreadyExistsException e) {
            throw new DirectorioException("No se puede crear: " + e.getMessage());
        } catch (IOException e) {
            throw new DirectorioException(e.getMessage());
        } catch (InvalidPathException e) {
            throw new DirectorioException(e.getMessage());
        }
    }

    public static void borrarFicheroDeTexto(String nombre) throws DirectorioException {
        try {
            Path ficheroNio = Path.of("src/Modulo" + nombre);
            if (!Files.deleteIfExists(ficheroNio)) {
                throw new DirectorioException("No existe el archivo");
            }

        } catch (FileAlreadyExistsException e) {
            throw new DirectorioException("No se puede crear: " + e.getMessage());
        } catch (IOException e) {
            throw new DirectorioException(e.getMessage());
        } catch (InvalidPathException e) {
            throw new DirectorioException(e.getMessage());
        }
    }

    public static void mostrarFicheroCarpeta(String nombre) throws DirectorioException {
        Path carpetaNio = Path.of("src/Modulo/" + nombre);
        try (Stream<Path> flujo = Files.list(carpetaNio)) {
            flujo.filter(Files::isRegularFile).sorted(Comparator.comparing(Path::getFileName))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new DirectorioException(e.getMessage());
        }
    }

    /**
     * Muestro el peso de los archivos dentro de un directorio
     * @param
     * @throws DirectorioException
     */
    public static void mostrarPeso() throws DirectorioException {
        Path ficheroApesar = Path.of("src/Modulo/" );
        try (Stream<Path> flujo = Files.list(ficheroApesar)) {
            //Evito que acepte directirios, solo archivos
            flujo.filter(Files::isRegularFile)
                    .map(path -> {
                        try {
                            long sizeInBytes = Files.size(path);
                            long sizeInKB = sizeInBytes / 1024;
                            String fileName = path.getFileName().toString();
                            return fileName + " _ " + sizeInKB + "KB";
                        } catch (IOException e) {
                            return "error al obtener el tamaño y archivo" + path.getFileName() + e.getMessage();
                        }
                    })
                    // me imprime el nombre del archivo y el peso
                    .forEach(System.out::println);

        } catch (IOException e) {
           throw new DirectorioException("Error al acceder al directorio " + ficheroApesar + e.getMessage());
        }
    }
}
