package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 29/10/2026
 * Programa de Menu de Operaciones Matematicas
 * */
import java.util.Scanner;

public class MenuOperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("\n===== MENÚ DE OPERACIONES MATEMÁTICAS =====");
            System.out.println("1. Calcular el cuadrado de un número");
            System.out.println("2. Calcular el cubo de un número");
            System.out.println("3. Determinar si un número es par o impar");
            System.out.println("4. Calcular la suma de los números desde 1 hasta un número ingresado");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para calcular su cuadrado: ");
                    double numCuadrado = scanner.nextDouble();
                    double resultadoCuadrado = numCuadrado * numCuadrado;
                    System.out.println("El cuadrado de " + numCuadrado + " es: " + resultadoCuadrado);
                    break;

                case 2:
                    System.out.print("Ingrese un número para calcular su cubo: ");
                    double numCubo = scanner.nextDouble();
                    double resultadoCubo = numCubo * numCubo * numCubo;
                    System.out.println("El cubo de " + numCubo + " es: " + resultadoCubo);
                    break;

                case 3:
                    System.out.print("Ingrese un número entero para determinar si es par o impar: ");
                    int numParImpar = scanner.nextInt();
                    if (numParImpar % 2 == 0) {
                        System.out.println("El número " + numParImpar + " es PAR.");
                    } else {
                        System.out.println("El número " + numParImpar + " es IMPAR.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese un número entero positivo: ");
                    int n = scanner.nextInt();


                    if (n > 0) {
                        int suma = 0;
                        for (int i = 1; i <= n; i++) {
                            suma += i;
                        }
                        System.out.println("La suma de los números desde 1 hasta " + n + " es: " + suma);
                    } else {
                        System.out.println("Error: El número ingresado debe ser positivo.");
                    }
                    break;

                case 5:
                    System.out.println("¡Gracias por utilizar el sistema! Saliendo del programa...");
                    break;

                default:

                    System.out.println("Error: Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
                    break;
            }

        } while (opcion != 5);
    }
}
