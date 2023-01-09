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
        super(3,"Ricardo","oveja"+(int)(Math.random()*2000));
        lana=Math.random()*20;
    }

    public Oveja(int edad, String nombre, String id, double lana){
        super(edad, nombre, id);
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
