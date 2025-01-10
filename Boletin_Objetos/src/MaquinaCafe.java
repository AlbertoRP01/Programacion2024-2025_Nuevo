/*import java.sql.SQLOutput;
import java.util.Scanner;

public class MaquinaCafe {
    public static void main(String[] args) {
        Maquina m1 = new Maquina();

        int opcion = 0;

        do {
            try {
                System.out.println("-------------------------------");
                System.out.println("Bienvenido a mi máquina de café");
                opcion = MiEntradaSalida.seleccionaOpcion("Seleccione una opción",
                        new String[]{"Café solo (" + Maquina.PRECIO_CAFE + " €)"
                                , "Leche (" + Maquina.PRECIO_LECHE + " €)"
                                , "Café con leche (" + Maquina.PRECIO_CAFE_LECHE + " €)"
                                , "Conocer estado de la máquina"
                                , "Apagar máquina y salir"});

                // Guardamos el dinero introducido por el cliente
                double dineroIntroducido = 0;

                switch (opcion) {
                    case Maquina.OPCION_CAFE:
                    case Maquina.OPCION_LECHE:
                    case Maquina.OPCION_CAFE_LECHE:
                        if (controlaExistencia(m1, opcion)) {
                            double cambio = procesaOpcion(m1, opcion);
                            if (cambio > 0) {
                                System.out.printf("Recoja su cambio (%.2f)€\n", cambio);
                            }
                        }
                        else {
                            System.out.println("No puedo servir este producto ahora mismo. Disculpe.");
                        }
                        break;
                    case Maquina.OPCION_ESTADO:
                        System.out.println(m1);
                        break;
                    case Maquina.OPCION_APAGAR:
                        break;
                }
            } catch (ParametroNoValidoException ex) {
                System.out.println(ex.getMessage());
            }
        } while (opcion != Maquina.OPCION_APAGAR);


    }

    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String[] opciones = new String[]{"Servir cafe solo ", "Servir Leche ", "Servir cafe con leche", "Consultar estado", "Llenar depositos", "Salir"};
        do {
            MiEntradaSalida.seleccionaOpcion("Elige Una opcion", opciones);


            switch (opcion) {
                case 1:
                    Maquina.
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Apagando  maquina...");
                    break;
            }
        } while (opcion > 5);
    }
    public static boolean controlaExistencia(Maquina m, int opcion) {
        boolean hayExistencias = false;
        switch (opcion) {
            case Maquina.OPCION_CAFE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisCafes() > 0;
                break;
            case Maquina.OPCION_LECHE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisLeche() > 0;
                break;
            case Maquina.OPCION_CAFE_LECHE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisLeche() > 0 && m.getDosisCafes() > 0;
                break;
        }
} */
