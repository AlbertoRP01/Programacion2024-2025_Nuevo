package Ej7;

import Ej6.DirectorioException;
import Ej7.util.MiEntradaSalida;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Fichero7 {
    public static void main(String[] args) {
        menu();
    }

    public static void listarDirectorio() throws DirectorioException {
        Path ficheroApesar = Path.of("src/Modelo");
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

    /**
     * Busca los ficheros que comience por una palabra contenida de dicho fichero
     * * @throws DirectorioException
     */
    public static void buscarFicheroComiencePorUnaPalabra() throws DirectorioException {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String palabra = scaner.nextLine();
        Path ficheroABuscar = Path.of("src/Modelo");
        if (!Files.isDirectory(ficheroABuscar) || !Files.exists(ficheroABuscar)) {
            throw new DirectorioException("El directorio no existe o no es un directorio válido");
        }
        try (Stream<Path> flujo = Files.walk(ficheroABuscar)) {
            long count = flujo
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().startsWith(palabra))
                    .peek(p -> System.out.println(p.getFileName()))
                    .count();
            if (count == 0) {
                throw new Ej7.DirectorioException("No se encontraron ficheros que comiencen con: " + palabra);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el mensaje " + e.getMessage());
        } catch (Ej7.DirectorioException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * En este método muestra una lista de ficheros con cierta extensión
     *
     * @throws DirectorioException
     */
    public static void buscarFicheroConExtension() throws DirectorioException {
        Scanner sc = new Scanner(System.in);
        Path ficheroAbuscar = Path.of("src/Modelo");
        System.out.println("Introduce la extensión");
        String extension = sc.nextLine();
        try (Stream<Path> flujo = Files.walk(ficheroAbuscar)) {
            //Creo una lista de ficheros y están filtrados que en el final del nombre destras del punto  muestra la extension
            List<Path> encontrados = flujo.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith("." + extension))
                    .toList();
            if (encontrados.isEmpty()) {
                throw new DirectorioException("No se encontraron achivos con la extensión" + extension);
            } else {
                encontrados.forEach(System.out::println);
                System.out.println("Total Encontrados " + encontrados.size());
            }
        } catch (IOException e) {
            throw new DirectorioException("No se encuentra este fichero");
        }
    }

    /**
     * Creamos un metodo en el cual nos busca un fichero dentro del directorio, pero que lo tiene que introducir
     * el usurio dicho directorio y dicho fichero
     *
     * @throws Ej7.DirectorioException
     */
    public static void buscarFicheroEnUnDirectorio() throws Ej7.DirectorioException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el directorio");
        String directorioABuscar = sc.nextLine();
        System.out.println("Introduce el nombre del archivo");
        String ficheroAEncontrar = sc.nextLine();

        Path directorio = Path.of(directorioABuscar);
        Path ficheroABuscar = Path.of(ficheroAEncontrar);
        try (Stream<Path> flujo = Files.list(directorio)) {
            flujo.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().equals(ficheroAEncontrar))
                    .forEach(p -> {
                        System.out.println("Ruta: " + p.toAbsolutePath());
                        try {
                            long bytes = Files.size(p);
                            long sizeInKB = bytes / 1024;
                            String fileName = p.getFileName().toString();
                            System.out.println(fileName + " _ " + sizeInKB + "KB");
                        } catch (IOException e) {
                            try {
                                throw new DirectorioException("Error al obtener el tamaño" + p.getFileName() + e.getMessage());
                            } catch (DirectorioException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    });
        } catch (IOException e) {
            throw new Ej7.DirectorioException("No se encuentra el directorio");
        }
    }

    public static void buscarRecursivamemnteUnFichero() throws DirectorioException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el directorio");
        String directorioABuscar = sc.nextLine();
        System.out.println("Introduce el nombre del archivo");
        String ficheroAEncontrar = sc.nextLine();
        Path directorio = Path.of(directorioABuscar);
        Path ficheroABuscar = Path.of(ficheroAEncontrar);
        try (Stream<Path> flujo = Files.walk(directorio)) {
            flujo.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().equals(ficheroAEncontrar))
                    .forEach(p -> {
                        System.out.println("Ruta: " + p.toAbsolutePath());
                        try {
                            long bytes = Files.size(p);
                            long sizeInKB = bytes / 1024;
                            String fileName = p.getFileName().toString();
                            System.out.println(fileName + " _ " + sizeInKB + "KB");
                        } catch (IOException e) {
                            try {
                                throw new DirectorioException("Error al obtener el tamaño" + p.getFileName() + e.getMessage());
                            } catch (DirectorioException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    });
        } catch (IOException e) {
            throw new DirectorioException(e.getMessage());
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n===== MENÚ DE ARCHIVOS =====");
            System.out.println("1. Listar directorio");
            System.out.println("2. Listar directorio y buscar fichero que comiencen por una palabra");
            System.out.println("3. Listar archivos con cierta extensión de un directorio");
            System.out.println("4. Buscar un archivo en un directorio");
            System.out.println("5. Buscar recursivamente un archivo en un directorio");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1 -> {
                    try {
                        listarDirectorio();
                    } catch (DirectorioException e) {
                        throw new RuntimeException(e.getMessage());
                    }

                }
                case 2 -> {
                    try {
                        buscarFicheroComiencePorUnaPalabra();
                    } catch (DirectorioException e) {
                        throw new RuntimeException(e);
                    }


                }
                case 3 -> {
                    try {
                        buscarFicheroConExtension();
                    } catch (DirectorioException e) {
                        throw new RuntimeException(e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        buscarFicheroEnUnDirectorio();
                    } catch (Ej7.DirectorioException e) {
                        throw new RuntimeException(e);
                    }

                }
                case 5 -> {
                    try {
                        buscarRecursivamemnteUnFichero();
                    } catch (DirectorioException e) {
                        System.out.println(e.getMessage());
                    }


                }
                case 6 -> {
                    System.out.println("Hasta la proxima");

                }
                default -> System.out.println("opcion no valida intentelo de nuevo");
            }
        } while (opcion != 6);
        sc.close();
    }

}
