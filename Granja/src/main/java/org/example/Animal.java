package org.example;

public abstract class Animal {
    protected int edad;
    protected String nombre;
    protected String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
        id="animal"+ (int) (Math.random()*1000);
    }
    public Animal(int edad, String nombre, String id){
        this.edad=edad;
        this.nombre=nombre;
        this.id=id;
    }
    public abstract boolean isRentable();
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " edad=" + edad +
                ", nombre=" + nombre +
                ", id=" + id;
    }
}
