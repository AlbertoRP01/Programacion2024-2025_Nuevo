package Ej1;

public class CuentaCredito extends Cuenta {
    private double credito;

    public CuentaCredito(String numeroDeCuenta, String titular, double saldoInicial) throws CuentaException {
        super(numeroDeCuenta, titular, saldoInicial);
        if (credito <= 300) {

        }
        this.credito = 100;
    }

    public CuentaCredito(String numeroDeCuenta, String titular, double saldoInicial, double credito) throws CuentaException {
        super(numeroDeCuenta, titular, saldoInicial);
        this.credito = credito;
    }

    public CuentaCredito(String numeroDeCuenta, String titular) {
        super(numeroDeCuenta, titular);
        this.credito = 100;
    }

}
