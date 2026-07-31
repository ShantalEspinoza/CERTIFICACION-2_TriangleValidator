package trianglevalidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado A del triangulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el lado B del triangulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el lado C del triangulo: ");
        double ladoC = scanner.nextDouble();

        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            System.out.println("Error: todos los lados deben ser mayores que cero.");
            return;
        }

        if (ladoA + ladoB <= ladoC ||
                ladoA + ladoC <= ladoB ||
                ladoB + ladoC <= ladoA) {

            System.out.println("Los valores ingresados no forman un triangulo.");
            return;
        }

        if (ladoA == ladoB && ladoB == ladoC) {

            System.out.println("El triangulo es EQUILATERO");

        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {

            System.out.println("El triangulo es ISOSCELES");

        } else {

            System.out.println("El triangulo es ESCALENO");

        }

        scanner.close();
    }
}