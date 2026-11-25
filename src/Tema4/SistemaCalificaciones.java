package Tema4;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes hay en el grupo? ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("Error: La cantidad debe ser mayor a 0. Intente de nuevo: ");
            n = scanner.nextInt();
        }

        double[] calificaciones = new double[n];
        double suma = 0;
        int aprobados = 0;
        int reprobados = 0;


        System.out.println();

        for (int i = 0; i < n; i++) {
            double calificacion = -1;
            while (calificacion < 0 || calificacion > 100) {
                System.out.print("Ingresa la calificación del estudiante " + (i + 1) + ": ");
                calificacion = scanner.nextDouble();

                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("Valor inválido");
                }
            }
            calificaciones[i] = calificacion;
            suma += calificacion;
        }

        double max = calificaciones[0];
        double min = calificaciones[0];

        for (int i = 0; i < n; i++) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
            if (calificaciones[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / n;
        double porcentajeAprobacion = ((double) aprobados / n) * 100;

        // Mostrar resultados con el formato solicitado
        System.out.println("\n--------- RESULTADOS ---------\n");

        System.out.println("Calificaciones:");
        for (int i = 0; i < n; i++) {

            if (calificaciones[i] == (int) calificaciones[i]) {
                System.out.print((int) calificaciones[i] + (i < n - 1 ? " " : ""));
            } else {
                System.out.print(calificaciones[i] + (i < n - 1 ? " " : ""));
            }
        }
        System.out.println("\n");

        System.out.println("Promedio general: " + promedio);
        System.out.println("Calificación más alta: " + (max == (int) max ? (int) max : max));
        System.out.println("Calificación más baja: " + (min == (int) min ? (int) min : min));

        System.out.println("\nEstudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);


        if (porcentajeAprobacion == (int) porcentajeAprobacion) {
            System.out.println("\nPorcentaje de aprobación: " + (int) porcentajeAprobacion + "%");
        } else {
            System.out.println("\nPorcentaje de aprobación: " + porcentajeAprobacion + "%");
        }
    }
}