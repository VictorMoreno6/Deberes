package org.example;

public class Llamadas {
    private String origenLlamada;
    private String destinoLlamada;
    private double duracion;
    private double costeMinuto;

    public double costeLamada(){
        return duracion * costeMinuto;
    }

    public Llamadas(String origenLlamada, String destinoLlamada, double duracion, double costeMinuto){
        this.origenLlamada = origenLlamada;
        this.destinoLlamada = destinoLlamada;
        this.duracion = duracion;
        this.costeMinuto = costeMinuto;
    }


}
