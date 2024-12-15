package org.example;

import java.util.Scanner;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División entre cero no permitida.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {


            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Introduce el segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Introduce el segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Introduce el segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Introduce el segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = dividir(num1, num2);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("¡Gracias por usar la calculadora! ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (continuar) {
                System.out.print("¿Quieres realizar otra operación? (s/n): ");
                char respuesta = scanner.next().charAt(0);
                if (respuesta == 'n' || respuesta == 'N') {
                    continuar = false;
                    System.out.println("¡Gracias por usar la calculadora! ¡Hasta luego!");
                }
            }
        }

        scanner.close();
    }
}