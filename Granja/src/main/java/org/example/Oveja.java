package org.example;

public class Oveja extends Animal {
    protected double lana;

    public double getLana() {
        return lana;
    }

    public void setLana(double lana) {
        this.lana = lana;
    }

    public Oveja(){
        super(3,"Ricardo");
        lana=Math.random()*20;
    }

    public Oveja(int edad, String nombre, double lana){
        super(edad,nombre);
        this.lana=lana;
    }

    @Override
    public boolean isRentable() {
        boolean rentable = false;
        if (lana>10){
            rentable=true;
        }
        return rentable;
    }


}
