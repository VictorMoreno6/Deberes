package org.example;

public class CuentaCorriente {
    private Titular titular;
    private String numeroCuenta;
    protected double saldo;

    public Titular getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        saldo = 15.3;
    }

    public void ingresar(double saldo) {
        this.saldo += saldo;//++,+= saldo= saldo-saldo;
    }

    public void reintegro(double saldo) {
        this.saldo -= saldo;
    }

    public String imprimir() {
        return "Número de cuenta: " + String.format(getNumeroCuenta()) + ", saldo: " + Double.toHexString(getSaldo());
    }

    public int compararCuentas(CuentaCorriente otraCuenta) {
        return numeroCuenta.compareTo(otraCuenta.getNumeroCuenta());
    }

}