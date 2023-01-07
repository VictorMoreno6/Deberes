package org.example;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gema
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // TODO code application logic here
        /* Circulo c1 = new Circulo();
    Cuadrado c2 = new Cuadrado();
    Triangulo t = new Triangulo();*/
        Figura[] figuras = new Figura[6];
        /*figuras[0]=c1;
    figuras[1]=c2;
    figuras[2]=t;*/
        for (int i = 0; i < figuras.length; i++){
            System.out.println("Elije que tipo de figura quieres: Triangulo(1) ,Circulo(2) , Cuadrado(3) o TrianguloMarina(4)");
            int respuesta = lector.nextInt();
            switch (respuesta){
                case 1:
                    figuras[i] = new Triangulo(Math.random() * 20);
                    break;
                case 2:
                    figuras[i] = new Cuadrado();
                    break;
                case 3:
                    figuras[i] = new Circulo(Math.random() * 20);
                    break;
                case 4:
                    double lado1;
                    double lado2;
                    double lado3;
                    do {
                        lado1 = Math.random() * 20;
                        lado2 = Math.random() * 20;
                        lado3 = Math.random() * 20;
                    } while (Utilidades.hayTriangulo(lado1, lado2, lado3) == false);
                    figuras[i] = new TrianguloMarina(lado1, lado2, lado3);
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("-----");
            System.out.println(figuras[i]+"\nArea: "+ figuras[i].area()+"\nPerimetro"+figuras[i].perimetro());
        }
    }

}