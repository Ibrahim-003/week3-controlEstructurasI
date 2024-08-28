package programas;

import java.util.Scanner;

public class CalcularImpuestos {
    private Scanner userInput = new Scanner(System.in);
    private double ingresoAnual;
    private double totalInpuesto;

    public void menu() {
        System.out.println("Cuanto es su ingreso anual en soles: ");
        ingresoAnual = userInput.nextDouble();
        obtenerInpuesto(ingresoAnual);

        System.out.println("""
                Ingreso Anual: %.2f
                Inpuesto total: %.2f
                """.formatted(ingresoAnual, totalInpuesto));
    }

    private void obtenerInpuesto(double ingresoAnual) {
        if (ingresoAnual <= 20000) {
            totalInpuesto = ingresoAnual * 0.1;
        } else if (ingresoAnual > 20000 && ingresoAnual <= 50000) {
            totalInpuesto = ingresoAnual * 0.2;
        } else {
            totalInpuesto = ingresoAnual * 0.3;
        }
    }
}


