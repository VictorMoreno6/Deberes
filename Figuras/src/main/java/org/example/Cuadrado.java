package org.example;

/**
 *
 * @author gema
 */
public class Cuadrado extends Figura{
    public Cuadrado() {
        super(8);
    }
    public Cuadrado(double lado) {
        super(lado);
    }
    @Override
    public double perimetro(){
        return 4*dato;
    }
    @Override
    public double area() {
        return dato*dato;
    }
}

