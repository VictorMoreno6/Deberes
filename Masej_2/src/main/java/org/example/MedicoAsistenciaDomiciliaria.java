package org.example;

public class MedicoAsistenciaDomiciliaria extends Medico {
    private int[] kmVisitas;
    private double tarifaKm;
    public MedicoAsistenciaDomiciliaria(String nombre, int edad, boolean sexo, double horas, double salarioHora, int[] kmVisitas, double tarifaKm) {
        super(nombre, edad, sexo, horas, salarioHora);
        this.kmVisitas=kmVisitas;
        this.tarifaKm=tarifaKm;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        double km=0;
        for (int i = 0; i < kmVisitas.length; i++) {
            km=km+kmVisitas[i];
        }
        System.out.println("Km totales: " + km);
        System.out.println("Tarifa km: " + tarifaKm);

    }

    @Override
    public double calcularSalario() {
        double salarioKilometraje=0;
        double km=0;
        for (int i = 0; i < kmVisitas.length; i++) {
            km=km+kmVisitas[i];
        }
        double salariokm =km* tarifaKm;
        return salariokm + horas * salarioHora;
    }
}
