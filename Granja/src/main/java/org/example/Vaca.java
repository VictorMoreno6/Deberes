package org.example;

public class Vaca extends Animal {
    protected double litros;
    public double getLitros() {
        return litros;
    }
    public void setLitros(double litros) {
        this.litros = litros;
    }
    public Vaca(){
        super(6,"Paco","vaca"+(int)(Math.random()*2000));
        litros=Math.random()*7;
    }
    public Vaca(int edad, String nombre, String id, double litros){
        super(edad, nombre, id);
        this.litros=litros;
    }

    @Override
    public boolean isRentable() {
        boolean rentable= false;
        if (litros>3){
            rentable=true;
        }
        return rentable;
    }
}
