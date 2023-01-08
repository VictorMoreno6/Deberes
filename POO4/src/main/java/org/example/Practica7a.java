package org.example;

import java.util.Scanner;

public class Practica7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas llamadas vas a registrar?");
        int num = sc.nextInt();
        Centralita[] registro= new Centralita[num];
        Llamadas llamadas[]=new Llamadas[num];
        for (int i = 0; i < num; i++) {
            System.out.println("¿Origen llamada?");
            String origen= sc.next();
            System.out.println("¿destino llamada?");
            String destino= sc.next();
            if(origen!=destino){
                System.out.println("Horario de la llamada");
                llamadas[i]=new Llamadas();
            }
        }
    }
}