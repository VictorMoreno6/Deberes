package org.example;

public class Llamadas {
    private String origenLlamada;
    private String destinoLlamada;
    private double duracion;
    private double costeMinuto;
    private int franjaHoraria;

    public double costeLamada() {
        return duracion * costeMinuto;
    }

    public Llamadas(String origenLlamada, String destinoLlamada, double duracion) {
        this.origenLlamada = origenLlamada;
        this.destinoLlamada = destinoLlamada;
        this.duracion = duracion;
        costeMinuto = 0.15;
    }

    public double costeLamada2(int franjaHoraria) {
        if (franjaHoraria==1){
            costeMinuto=0.2;
        } else if (franjaHoraria==2) {
            costeMinuto=0.25;
        } else {
            costeMinuto=0.3;
        }
        return duracion * costeMinuto;
    }



}
