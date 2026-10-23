package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 29/10/2026
 * Programa de Numeros Amigos
 * */
import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int VALOR_MINIMO = 1;
        int opcionRepetir;


        do {
            int num1 = 0;
            int num2 = 0;

            while (num1 < VALOR_MINIMO || num2 < VALOR_MINIMO) {
                System.out.print("Ingrese el primer número entero positivo: ");
                num1 = scanner.nextInt();

                System.out.print("Ingrese el segundo número entero positivo: ");
                num2 = scanner.nextInt();

                if (num1 < VALOR_MINIMO || num2 < VALOR_MINIMO) {
                    System.out.println("Error: Ambos números deben ser mayores o iguales a 1. Intente de nuevo.\n");
                }
            }

            int sumaDivisores1 = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDivisores1 += i;
                }
            }

            int sumaDivisores2 = 0;
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumaDivisores2 += i;
                }
            }

            System.out.println("\n--- MENÚ DE VISUALIZACIÓN ---");
            System.out.println("1. Mostrar la suma de los divisores de cada número y el resultado");
            System.out.println("2. Mostrar únicamente el resultado de la comparación");
            System.out.print("Seleccione una opción: ");
            int opcionMenu = scanner.nextInt();

            boolean sonAmigos = (sumaDivisores1 == num2 && sumaDivisores2 == num1);

            switch (opcionMenu) {
                case 1:
                    System.out.println("\n--- DETALLE DEL ANÁLISIS ---");
                    System.out.println("Suma de los divisores propios de " + num1 + " = " + sumaDivisores1);
                    System.out.println("Suma de los divisores propios de " + num2 + " = " + sumaDivisores2);

                    if (sonAmigos) {
                        System.out.println("Resultado: ¡Los números " + num1 + " y " + num2 + " SON números amigos!");
                    } else {
                        System.out.println("Resultado: Los números " + num1 + " y " + num2 + " NO son números amigos.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- RESULTADO DE LA COMPARACIÓN ---");
                    if (sonAmigos) {
                        System.out.println("¡SON números amigos!");
                    } else {
                        System.out.println("NO son números amigos.");
                    }
                    break;

                default:
                    System.out.println("Opción de menú no válida.");
                    break;
            }

            System.out.println("\n¿Desea analizar otra pareja de números?");
            System.out.println("1. Sí");
            System.out.println("2. No (Finalizar)");
            System.out.print("Seleccione una opción: ");
            opcionRepetir = scanner.nextInt();

        } while (opcionRepetir == 1);

        System.out.println("Programa finalizado con éxito.");
    }
}
