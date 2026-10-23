package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 29/10/2026
 * Programa de Estadisticas secuencia
 * */
import java.util.Scanner;

public class EstadisticasSecuencia {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final int VALOR_MINIMO = 1;
            int opcionRepetir;

            do {
                int n = 0;

                while (n < VALOR_MINIMO) {
                    System.out.print("Ingrese un número entero positivo N (mayor o igual a 1): ");
                    n = scanner.nextInt();
                    if (n < VALOR_MINIMO) {
                        System.out.println("Error: El número debe ser positivo.");
                    }
                }

                int sumaDivisibles4 = 0;
                int contadorMultiplos3 = 0;
                int contadorAmbos = 0;

                for (int i = 1; i <= n; i++) {

                    if (i % 4 == 0) {
                        sumaDivisibles4 += i;
                    }

                    if (i % 3 == 0) {
                        contadorMultiplos3++;
                    }

                    if (i % 4 == 0 && i % 3 == 0) {
                        contadorAmbos++;
                    }
                }

                System.out.println("\n===== REPORTE GENERAL DE LA SECUENCIA (1 a " + n + ") =====");
                System.out.println("Suma de los números divisibles entre 4: " + sumaDivisibles4);
                System.out.println("Cantidad de números múltiplos de 3: " + contadorMultiplos3);
                System.out.println("Cantidad de números divisibles entre ambos (4 y 3): " + contadorAmbos);

                System.out.println("\n--- MENÚ DE ESTADÍSTICAS ADICIONALES ---");
                System.out.println("1. Ver cantidad y suma de números PARES");
                System.out.println("2. Ver cantidad y suma de números IMPARES");
                System.out.println("3. Ver cantidad de MÚLTIPLOS DE 5");
                System.out.print("Seleccione una opción: ");
                int opcionMenu = scanner.nextInt();

                int contadorAdicional = 0;
                int sumaAdicional = 0;

                switch (opcionMenu) {
                    case 1:

                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                contadorAdicional++;
                                sumaAdicional += i;
                            }
                        }
                        System.out.println("\n--- ESTADÍSTICAS DE PARES ---");
                        System.out.println("Cantidad de números pares: " + contadorAdicional);
                        System.out.println("Suma de números pares: " + sumaAdicional);
                        break;

                    case 2:
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 != 0) {
                                contadorAdicional++;
                                sumaAdicional += i;
                            }
                        }
                        System.out.println("\n--- ESTADÍSTICAS DE IMPARES ---");
                        System.out.println("Cantidad de números impares: " + contadorAdicional);
                        System.out.println("Suma de números impares: " + sumaAdicional);
                        break;

                    case 3:
                        for (int i = 1; i <= n; i++) {
                            if (i % 5 == 0) {
                                contadorAdicional++;
                            }
                        }
                        System.out.println("\n--- ESTADÍSTICAS DE MÚLTIPLOS DE 5 ---");
                        System.out.println("Cantidad de múltiplos de 5: " + contadorAdicional);
                        break;

                    default:
                        System.out.println("Opción no válida en el menú.");
                        break;
                }

                System.out.println("\n¿Desea realizar otro análisis completo?");
                System.out.println("1. Sí");
                System.out.println("2. No (Finalizar)");
                System.out.print("Seleccione una opción: ");
                opcionRepetir = scanner.nextInt();

            } while (opcionRepetir == 1);

            System.out.println("Programa finalizado con éxito.");
        }
    }
