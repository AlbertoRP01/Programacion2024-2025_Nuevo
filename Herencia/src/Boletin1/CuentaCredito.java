package Boletin1;

import java.security.PublicKey;

public class CuentaCredito extends Cuenta {

    private double credito;
    private static final double NUM_MAX_CREDITO = 300;
    private static final double CREDITO_INICIAL = 100;
    private static final double SALDO_INICIAL = 0;

    private CuentaCredito(String numCuenta, String titular, double saldo, double credito) throws CuentaExcepcion {
        super(numCuenta, titular, saldo);
        setCredito(credito);
    }

    public static CuentaCredito sinSaldoSinCredito(String numCuenta, String titular) throws CuentaExcepcion {
        double saldo = SALDO_INICIAL;
        double credito = CREDITO_INICIAL;
        return new CuentaCredito(numCuenta, titular, saldo, credito);
    }

    public static CuentaCredito sinSaldoYconCredito(String numCuenta, String titular, double credito) throws CuentaExcepcion {
        double saldo = 0;
        return new CuentaCredito(numCuenta, titular, credito, saldo);
    }

    public static CuentaCredito conSaldoYsinCredito(String numCuenta, String titular, double saldo) throws CuentaExcepcion {
        double credito = 100;
        return new CuentaCredito(numCuenta, titular, saldo, credito);
    }

    public static CuentaCredito crearSinNada(String numCuenta, String titular) throws CuentaExcepcion {
        return new CuentaCredito(numCuenta, titular, SALDO_INICIAL, CREDITO_INICIAL);
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) throws CuentaExcepcion {
        if (credito >= NUM_MAX_CREDITO) {
            throw new CuentaExcepcion("El credito ha sido superado");
        }
        if (credito <= 0) {
            throw new CuentaExcepcion("Credito Insuficiente");
        }
        this.credito = credito;
    }

    /**
     * Modificar el reintegro
     *
     * @param retirada
     * @throws CuentaExcepcion
     */
    public void sacarDinero(double retirada) throws CuentaExcepcion {
        if (retirada < 0) {
            throw new CuentaExcepcion("No puedes retirar numero negativo");
        }
        if (retirada > super.saldo + this.credito) {
            throw new CuentaExcepcion("Error, supera el limite ");
        }
        if (retirada > super.saldo && retirada <= super.saldo + this.credito) {
            throw new CuentaExcepcion("Error, el retiro esta por debajo del saldo y del credito");

        } else if (retirada < super.saldo && retirada >= super.saldo  + this.credito) {
            throw  new CuentaExcepcion("Error, el retiro supera  el saldo y el credito");
        }
    }

    /**
     * Modificar Ingreso
     * @param ingreso
     */
    public void ingresaDinero(double ingreso) throws CuentaExcepcion {
        double creditoUsado = 0;
        if (ingreso<=0 ) {
            throw new CuentaExcepcion("Error, no puedes introducir digitos negativos y que sea 0, por favor vuelve a introducir");

        }

    }
}
