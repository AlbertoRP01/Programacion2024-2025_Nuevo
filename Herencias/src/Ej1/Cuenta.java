package Ej1;

public class Cuenta {
    private String numeroDeCuenta;
    private String titular;
    private double saldo;
    private int contadorRetiro;
    private int contadorIngreso;

    public Cuenta(String numeroDeCuenta, String titular, double saldoInicial) throws CuentaException {
        if (saldo <=0){
            throw new CuentaException("No puede estar por debajo de 1");

        }
        this.titular = titular;
        this.setSaldo(saldoInicial);
        this.numeroDeCuenta = numeroDeCuenta;

        contadorIngreso = 0;
    }

    public Cuenta(String numeroDeCuenta, String titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0;
        this.titular = titular;
        this.contadorRetiro = 0;
        this.contadorIngreso = 0;
    }

    private void setSaldo(double saldo) throws CuentaException {
        if (saldo < 0) {

            throw new CuentaException("No  puedes introducir un saldo negativo");
        }
        this.saldo = saldo;
    }

    public void sacarDinero(double retirada) throws CuentaException {
        if (retirada < 0) {
            throw new CuentaException("La retirada no puede ser negativa");

        } else if (retirada > saldo) {
            throw new CuentaException("La retirada no puede ser mayor que el saldo");

        }
        this.saldo = retirada;
        contadorRetiro ++;
    }

    public void meterDinero(double ingreso) throws CuentaException {
        if (ingreso <= 0) {
            throw new CuentaException("El dinero ingresado no puede ser negativo");
        }
        this.saldo += ingreso;
        contadorIngreso++;
    }

    public void consultarSaldo(){
        System.out.println(this.saldo);
        System.out.println("Has sacado dinero " + contadorRetiro);
        System.out.println("Has ingresadp dinero " +contadorIngreso);
    }
}

