package CuentaCorriente;

import java.util.Scanner;

public class CuentaCorriente {
    static Scanner sc = new Scanner(System.in);
    private double saldo, reintegro, ingresos;
    private int contadorReintegro, contadorIngresos;
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.reintegro = 0;
        this.ingresos = 0;
        this.contadorIngresos = 0;
        this.contadorReintegro = 0;
    }


    public void cantidadIngresar(double cantidad) throws CuentaExcepcion {


        if (cantidad > 0) {
            saldo += cantidad;
            ingresos = cantidad;
            contadorIngresos ++;
            System.out.println("Ingreso realizado" + saldo);

        } else if (cantidad < 0) {
            throw new CuentaExcepcion("No puedes ingresar un numero por debajo de " + 0);
        }

    }

    public void CantidadRetirar(double cantidad) throws CuentaExcepcion {

        if (cantidad > saldo) {
            throw new CuentaExcepcion("saldo insuficinete para realizar su reintegro");

        } else if (reintegro < 0) {
            throw new CuentaExcepcion("La cantidad que se retira tiene que ser mayor que " + 0);
        }

        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            reintegro = cantidad;
           contadorReintegro ++;
            System.out.println("su reintegro ha sisdo un exito" + saldo);
        }
    }

    public void consultarReintegroOIngreso() {
        System.out.println("¿Deseas consultar reintegro Ingreso o saldo?");
        String respuesta = sc.nextLine();
        if (respuesta.formatted(saldo).equalsIgnoreCase("saldo")) {
            System.out.println(saldo);
        } else if (respuesta.formatted(reintegro).equalsIgnoreCase("reintegro")) {
            System.out.println("El  reintegro actual es %.2f\n".formatted(reintegro));

        } else if (respuesta.formatted(ingresos).equalsIgnoreCase("ingreso")) {
            System.out.printf("El ingreso actual es %.2f \n".formatted(ingresos));
        }
    }

    public void finalizar() {
        System.out.println("¿Deseas salir? (s/n)");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Operacion finalizada" + "Saldo final" + saldo);
        } else {
            System.out.println("Regresando al menu...");
        }
    }
}
