package org.example;

public class Gallina extends Animal{
    protected double huevosDia;

    public double getHuevosDia() {
        return huevosDia;
    }

    public void setHuevosDia(double huevosDia) {
        this.huevosDia = huevosDia;
    }

    public Gallina(){
        super(4,"Jose","gallina"+(int)(Math.random()*2000));
        huevosDia=Math.random()*2;
    }



    public Gallina(int edad,String nombre, String id,double huevosDia){
        super(edad, nombre, id);
        this.huevosDia=huevosDia;
    }

    @Override
    public boolean isRentable() {
        boolean rentable=false;
        if (huevosDia>0.75){
            rentable=true;
        }
        return rentable;
    }
}
