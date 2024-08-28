package programas;

import java.util.Scanner;

public class CalcularNota {
    private Scanner userInput = new Scanner(System.in);
    private int notaParcial1;
    private int notaParcial2;
    private int notaParcial3;
    private int notaPromedio;
    private String letraCalificacion;

    public void mostrarMenu() {
        System.out.println("Ingrese la primera nota: ");
        notaParcial1 = userInput.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        notaParcial2 = userInput.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        notaParcial3 = userInput.nextInt();

        notaPromedio = calcularPromedio(notaParcial1, notaParcial2, notaParcial3);

        letraCalificacion = determinarLetra(notaPromedio);

        System.out.println("Tu calificacion en nota fue: " + notaPromedio);
        System.out.println("Tu calificacion en letra fue: " + letraCalificacion);
    }

    private int calcularPromedio(int notaParcial1, int notaParcial2, int notaParcial3) {
        double promedio = (notaParcial1 + notaParcial2 + notaParcial3) / 3;

        return (int) (Math.floor(promedio));
    }

    private String determinarLetra(int promedio) {

        String letra;

        if (promedio > 0 && promedio <= 59) {
            letra = "F";
        }else if(promedio >= 60 && promedio <= 69) {
            letra = "D";
        }else if(promedio >= 70 && promedio <= 79) {
            letra = "C";
        }else if(promedio >= 80 && promedio <= 89) {
            letra = "B";
        }else {
            letra = "A";
        }

        return letra;
    }

}
