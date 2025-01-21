package CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CuentaExcepcion {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el saldo de la cuenta");
        double saldo = sc.nextDouble();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldo);

        int opcion = 0;
        do {
            System.out.println("\n Menu de operaciones");
            System.out.println("1. Cantidad que deseas retirar");
            System.out.println("2. Cantidad que deseas ingresar");
            System.out.println("3. conocer tu reintegro o ingreso");
            System.out.println("4. volver al menu");
            System.out.println("Seleccion a una opcion");
            opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Cantidad que deseas retirar");
                        double cantidadRetirar = sc.nextDouble();
                        cuentaCorriente.CantidadRetirar(cantidadRetirar);
                    }
                    case 2 -> {
                        System.out.println("Cantidad que deseas Ingresar");
                        double cantidadIngresar = sc.nextDouble();
                        cuentaCorriente.cantidadIngresar(cantidadIngresar);
                    }
                    case 3 -> {
                        System.out.println("Quieres conocer tu reintegro o tu ingreso");
                        cuentaCorriente.consultarReintegroOIngreso();
                    }
                    case 4 -> {
                        System.out.println("Vamos a salir de aqui");
                        cuentaCorriente.finalizar();


                    }
                    default -> System.out.println("opcion no valida. Intentalo de nuevo ");
                }
            } catch (CuentaExcepcion e) {
                System.out.println("Error" + e.getMessage());
            }
        } while (opcion <= 4);

    }
}
