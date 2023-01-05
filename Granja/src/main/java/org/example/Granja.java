package org.example;

import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos animales quieres que haya en la granja");
        int total= sc.nextInt();
        sc.next();
        System.out.println("Cuantos quieres que sean gallinas");
        int galli=sc.nextInt();
        int espacio=total-galli;
        Gallina gallinas[]= new Gallina[galli];
        for (int i = 0; i < galli; i++) {
            if (i>(galli/2)){
                 gallinas[i].setNombre("Carlos");
            }
            if (i<(galli/2)){
                gallinas[i].setNombre("Rita");
            }
        }
        System.out.println("¿Cuántas vacas quieres?");
        int vac=sc.nextInt();
        espacio=total-vac;
        Vaca vacas[]=new Vaca[vac];
        for (int i = 0; i < vac; i++) {
            if (i>(vac/2)){
                vacas[i].setNombre("Lola");
            }
            if (i<(vac/2)){
                vacas[i].setNombre("Manolita");
            }
        }
        Oveja ovejas[]=new Oveja[espacio];
        for (int i = 0; i < vac; i++) {
            if (i>(vac/2)){
                vacas[i].setNombre("Dolly");
                vacas[i].setEdad((int) (Math.random()*20+1));
            }
            if (i<(vac/2)){
                vacas[i].setNombre("Amancio");
                vacas[i].setEdad((int) (Math.random()*10+2));
            }
        }
        for (int i = 0; i < total; i++) {
            System.out.println(Animal.class);
        }
    }
}