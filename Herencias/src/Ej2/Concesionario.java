package Ej2;


import java.util.Scanner;

public class Concesionario {
    static Vehiculo[] vehiculos = new Vehiculo[200];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opciones = 0;
        while (opciones <= 3) {

            System.out.println("Alta del vehiculo");
            System.out.println("Calculo de precio Alquiler");
            System.out.println("salir");

        }
        try {

            opciones = MiEntradaSalida.solicitarEntero("Selecciona una opcion 1-3");

            switch (opciones) {
                case 1:
                    try {
                        Vehiculo vehiculo;
                        String matriculaCoche = MiEntradaSalida.solicitarCadena("Introduce la matricula");
                        TGama gama;
                        darDeAlta(vehiculo);
                    } catch () {

                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        } catch ()
    }

    public  static void darDeAlta(Vehiculo vehiculo) throws VehiculoException {
        boolean esta = false;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
                esta = true;
            }
        }
        throw new VehiculoException("El garaje está lleno");
    }

    public  Vehiculo buscarVehiculo(String martricula) throws VehiculoException {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {

                if (martricula.equalsIgnoreCase(vehiculos[i].getMatricula())) {
                    return vehiculos[i];
                }
            } else {
                throw new VehiculoException("No se encuentra la matricula");
            }
        }
        throw new VehiculoException("No se encuentra el vehiculo");
    }
}
