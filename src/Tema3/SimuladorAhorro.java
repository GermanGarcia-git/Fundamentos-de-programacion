package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 29/10/2026
 * Programa de Simulador Ahorro
 * */
import java.util.Scanner;

public class SimuladorAhorro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TASA_INTERES = 0.01;
        int opcionRepetir;

        do {
            double cantidadInicial = -1;
            double metaAhorro = -1;
            double ahorroMensualFijo = -1;

            while (cantidadInicial < 0 || metaAhorro < 0 || ahorroMensualFijo < 0) {
                System.out.print("Ingrese la cantidad inicial de dinero: ");
                cantidadInicial = scanner.nextDouble();

                System.out.print("Ingrese la meta de ahorro: ");
                metaAhorro = scanner.nextDouble();

                System.out.print("Ingrese el ahorro mensual fijo: ");
                ahorroMensualFijo = scanner.nextDouble();

                if (cantidadInicial < 0 || metaAhorro < 0 || ahorroMensualFijo < 0) {
                    System.out.println("Error: Todos los valores deben ser mayores o iguales a cero. Intente de nuevo.\n");
                }
            }

            System.out.println("\n--- SELECCIONE EL PLAZO DE SIMULACIÓN ---");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            System.out.print("Seleccione una opción: ");
            int opcionPlazo = scanner.nextInt();

            int mesesMaximos = 0;
            switch (opcionPlazo) {
                case 1:
                    mesesMaximos = 6;
                    break;
                case 2:
                    mesesMaximos = 12;
                    break;
                case 3:
                    mesesMaximos = 24;
                    break;
                default:
                    System.out.println("Opción no válida. Se por defecto asignará un plazo de 12 meses.");
                    mesesMaximos = 12;
                    break;
            }

            double saldoAcumulado = cantidadInicial;
            double interesesGeneradosTotales = 0.0;
            int mesesNecesarios = 0;
            boolean metaAlcanzada = false;

            for (int mes = 1; mes <= mesesMaximos; mes++) {
                double interesMes = saldoAcumulado * TASA_INTERES;
                interesesGeneradosTotales += interesMes;


                saldoAcumulado = saldoAcumulado + interesMes + ahorroMensualFijo;

                if (saldoAcumulado >= metaAhorro && !metaAlcanzada) {
                    mesesNecesarios = mes;
                    metaAlcanzada = true;
                }
            }

            if (!metaAlcanzada) {
                mesesNecesarios = mesesMaximos;
            }

            System.out.println("\n===== REPORTE DE SIMULACIÓN DE AHORRO =====");
            System.out.println("Saldo final acumulado: $" + saldoAcumulado);
            System.out.println("Intereses totales generados: $" + interesesGeneradosTotales);

            if (saldoAcumulado >= metaAhorro) {
                System.out.println("Estado: ¡Meta alcanzada con éxito!");
                System.out.println("Meses necesarios para alcanzarla: " + mesesNecesarios);
            } else {
                System.out.println("Estado: No se logró alcanzar la meta en el plazo seleccionado.");
            }

            System.out.println("\n¿Desea realizar otra simulación?");
            System.out.println("1. Sí");
            System.out.println("2. No (Finalizar)");
            System.out.print("Seleccione una opción: ");
            opcionRepetir = scanner.nextInt();

        } while (opcionRepetir == 1);

        System.out.println("Simulador finalizado con éxito.");

    }
}