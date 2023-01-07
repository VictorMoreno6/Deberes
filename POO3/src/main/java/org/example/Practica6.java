package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas cuentas corrientes quieres hacer");
        int cuentas=sc.nextInt();
        System.out.println("Cuantas cuentas corrientes ahorro quieres hacer");
        int ahorro = sc.nextInt();
        CuentaCorriente cuentasco []= new CuentaCorriente[cuentas];
        CuentaCorriente cuentasaho []= new CuentaAhorro[ahorro];
        for (int i = 0; i < cuentas; i++) {
            System.out.println("Introduce el titular de la cuenta(nombre, apellido y edad), el numero de cuenta y el saldo de esta");
            cuentasco [i]= new CuentaCorriente( new Titular(sc.next(),sc.next(),sc.nextInt()) ,sc.next(),sc.nextDouble());
        }
        for (int i = 0; i < ahorro; i++) {
            System.out.println("Introduce el titular de la cuenta(nombre, apellido y edad), el numero de cuenta, el saldo y el interes de esta");
            cuentasaho [i]= new CuentaAhorro( new Titular(sc.next(),sc.next(),sc.nextInt()) ,sc.next(),sc.nextDouble(),sc.nextDouble());
        }
        for (int i = 0; i < cuentas; i++) {
            System.out.println("Titular: " + cuentasco[i].getTitular()+ "Nº cuenta: " + cuentasco[i].getNumeroCuenta()+ "Saldo: " +cuentasco[i].getSaldo());
        }
    }

}
