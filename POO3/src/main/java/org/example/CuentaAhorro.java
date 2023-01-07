package org.example;

public class CuentaAhorro extends CuentaCorriente {
    private double interes;

    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes) {
        super(titular, numeroCuenta, saldo);
        this.interes = interes;
    }
    public CuentaAhorro(Titular titular, String numeroCuenta, double interes) {
        super(titular, numeroCuenta);
        this.interes = interes;
        this.setSaldo(15.3);
    }
    public CuentaAhorro(Titular titular, String numeroCuenta) {
        super(titular, numeroCuenta);
        this.interes = 2.5;
        this.setSaldo(15.3);
    }

    public double getInteres() {
        return interes;
    }

    public void calcularInteres() {
        double interescalculo= saldo * interes /100;
        saldo += interescalculo;
    }

}
