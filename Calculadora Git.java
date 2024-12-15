package org.example;

import java.util.Scanner;

public class Calculadora {

    public static Integer sumar(Integer a, Integer b) {
        return a + b;
    }

    public static Integer restar(Integer a, Integer b) {
        return a - b;
    }

    public static Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    public static Integer dividir(Integer a, Integer b) {
        if (b == 0) {
            System.out.println("Error: División entre cero no permitida.");
            return Integer.NaN;
        }
        return a / b;
    }

    public static Integer raiz(Integer valor) {
        if (valor < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {


            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            Integer opcion = scanner.nextInt();

            Integer resultado = 0;

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    Integer num1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número: ");
                    Integer num2 = scanner.nextInt();
                    resultado = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    Integer num1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número: ");
                    Integer num2 = scanner.nextInt();
                    resultado = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    Integer num1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número: ");
                    Integer num2 = scanner.nextInt();
                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    Integer num1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número: ");
                    Integer num2 = scanner.nextInt();
                    resultado = dividir(num1, num2);
                    if (!Integer.isNaN(resultado)) {
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;
                case 5:
                    System.out.print("Introduce el número: ");
                    Integer num1 = scanner.nextInt();
                    resultado = raizCuadrada(num1);
                    System.out.println("El resultado de la raíz cuadrada es: " + resultado);
                    break;
                case 6:
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