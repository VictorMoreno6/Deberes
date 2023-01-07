package org.example;

public abstract class Medico {
    protected String nombre;
    protected int edad;
    protected boolean sexo;
    protected double horas;
    protected double salarioHora;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Medico(String nombre,int edad, boolean sexo, double horas, double salarioHora){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.horas=horas;
        this.salarioHora=salarioHora;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Salario por hora: " + salarioHora);
    }

    public abstract double calcularSalario();

}
