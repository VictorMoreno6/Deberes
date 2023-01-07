package org.example;

public class Triangulo extends Figura {


    public Triangulo() {
        super(10);
    }

    public Triangulo(double lado) {
        super(lado);
    }

    @Override
    public double area() {
        double sm = perimetro() / 2;
        double area = (double) Math.sqrt(sm * Math.pow((sm - dato), 3));
        return area;
    }

    @Override
    public double perimetro() {
        return dato * 3;

    }
}
