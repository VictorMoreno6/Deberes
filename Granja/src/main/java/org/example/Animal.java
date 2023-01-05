package org.example;

public abstract class Animal {
    protected int edad;
    protected String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(){
        edad=5;
        nombre="Julio";
    }
    public Animal(int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }
    public abstract boolean isRentable();
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " edad=" + edad +
                ", nombre='" + nombre ;
    }
}
