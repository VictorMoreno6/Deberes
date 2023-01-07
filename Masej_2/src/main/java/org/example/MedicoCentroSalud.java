package org.example;

public class MedicoCentroSalud extends Medico {
    private CentroSalud centrosalud;

    public MedicoCentroSalud(String nombre, int edad, boolean sexo, double horas, double salarioHora, CentroSalud centrosalud) {
        super(nombre, edad, sexo, horas, salarioHora);
        this.centrosalud = centrosalud;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Identificador: " + centrosalud.getIdentificador());
        System.out.println("Centro de salud: " + centrosalud.getNombre());
        System.out.println("Domicilio" + centrosalud.getDomicilio());
        System.out.println("Código Postal: " + centrosalud.getCodigoPostal());
    }

    @Override
    public double calcularSalario() {
        return horas*salarioHora;
    }
}