package programas;

import java.util.Scanner;

public class IdentificarTriangulo {
    private Scanner userInput = new Scanner(System.in);
    private int lado1;
    private int lado2;
    private int lado3;

    public void menu() {
        System.out.println("Ingrese la longitud del primer lado: ");
        lado1 = userInput.nextInt();
        System.out.println("Ingrese la longitud del segundo lado: ");
        lado2 = userInput.nextInt();
        System.out.println("Ingrese la longitud del tercer lado: ");
        lado3 = userInput.nextInt();

        validarTriangulo(lado1, lado2, lado3);
    }

    public void validarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es \"Equilatero\"");
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es Isosceles");
        }else {
            System.out.println("El triangulo es Escaleno");
        }
    }
}
