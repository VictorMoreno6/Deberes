package org.example;

import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos animales quieres que haya en la granja");
        int total= sc.nextInt();
        Animal[] animales= new Animal[total];
        System.out.println("Cuantos quieres que sean gallinas");
        int galli=sc.nextInt();
        for (int i = 0; i < galli; i++) {
            if (i>=(galli/2)){
                 animales[i] = new Gallina((int)(Math.random() * 10),"Carlos", "gallina"+i,Math.random() * 2);
            }
            else if (i<(galli/2)){
                 animales[i] = new Gallina((int)(Math.random() * 10),"Rita", "gallina"+i,Math.random() * 2);
            }
        }
        System.out.println("¿Cuántas vacas quieres?");
        int vac=sc.nextInt();
        for (int i = galli; i < vac+galli; i++) {
            if ((Math.random() * 12)>=6){
                animales[i] = new Vaca((int) (Math.random() * 20),"Lola", "vaca"+i, Math.random() * 8);
            }
            else if ((Math.random() * 12)<6){
                animales[i] = new Vaca((int) (Math.random() * 20),"Manolita", "vaca"+i,Math.random() * 8);
            }
        }
        for (int i = (vac+galli); i < total; i++) {
            if ((Math.random() * 12)>=6){
                animales[i] = new Oveja((int) (Math.random() * 12),"Dolly", "oveja"+i,Math.random() * 22);
            }
            else if ((Math.random() * 12)<6){
                animales[i] = new Oveja((int)(Math.random() * 12),"Amancio","oveja"+i,Math.random() * 22);
            }
        }
        for (int i = 0; i < animales.length; i++) {
            System.out.println("-----");
            System.out.println(animales[i]);
            if (animales[i].isRentable()) {
                System.out.println("Es rentable");
            } else {
                System.out.println("No es rentable");
            }
        }
        for (int i = 0; i < animales.length; i++) {
            if (!animales[i].isRentable()) {
                System.out.println("Deseas dar de baja este animal.Si(1), NO(2)");
                int respuesta = sc.nextInt();
                if (respuesta==1){
                    animales[i].setId("null");
                    animales[i].setNombre("null");
                    animales[i].setEdad(0);
                }
            }
        }
    }
}