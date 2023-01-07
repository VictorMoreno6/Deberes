package org.example;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class EntradaDatos {
    /*  public static Circulo dameCirculo(){
          Scanner lector = new Scanner(System.in);
          System.out.println("Introduce dato");
          return new Circulo(lector.nextDouble());
      }
      public static Cuadrado dameCuadrado(){
          Scanner lector = new Scanner(System.in);
          System.out.println("Introduce dato");
          return new Cuadrado(lector.nextDouble());
      }
      public static Triangulo dameTriangulo(){
          Scanner lector = new Scanner(System.in);
          System.out.println("Introduce dato");
          return new Triangulo(lector.nextDouble());
      }*/
    public static Figura dameFigura(int tipo){
        Scanner lector = new Scanner(System.in);
        Figura aux = null;
        System.out.println("Introduce dato");
        switch(tipo){
            case 1:
                aux = new Cuadrado(lector.nextDouble());
                break;
            case 2:
                aux = new Triangulo(lector.nextDouble());
                break;
            case 3:
                aux = new Circulo(lector.nextDouble());
                break;
        }
        return aux;
    }
}
