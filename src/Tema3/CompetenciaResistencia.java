package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 29/10/2026
 * Programa de Competencia Resistencia
 * */
import java.util.Scanner;

public class CompetenciaResistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int RONDAS_TOTALES = 5;
        int opcionRepetir;


        do {
            int totalParticipantes = 0;


            while (totalParticipantes <= 0) {
                System.out.print("Ingrese la cantidad de participantes: ");
                totalParticipantes = scanner.nextInt();
                if (totalParticipantes <= 0) {
                    System.out.println("Error: La cantidad de participantes debe ser mayor que cero.");
                }
            }

            int rondasBajo = 0;
            int rondasMedio = 0;
            int rondasAlto = 0;

            double mayorDistanciaAcumulada = -1.0;
            int participanteGanador = 0;

            for (int p = 1; p <= totalParticipantes; p++) {
                System.out.println("\n--- REGISTRO PARA EL PARTICIPANTE " + p + " ---");
                double distanciaTotalParticipante = 0.0;

                for (int r = 1; r <= RONDAS_TOTALES; r++) {
                    double distanciaRonda = -1.0;

                    while (distanciaRonda < 0) {
                        System.out.print("Ingrese la distancia recorrida en la ronda " + r + " (en km): ");
                        distanciaRonda = scanner.nextDouble();
                        if (distanciaRonda < 0) {
                            System.out.println("Error: La distancia no puede ser negativa.");
                        }
                    }

                    distanciaTotalParticipante += distanciaRonda;

                    if (distanciaRonda < 2.0) {
                        rondasBajo++;
                    } else if (distanciaRonda >= 2.0 && distanciaRonda <= 4.0) {
                        rondasMedio++;
                    } else {
                        rondasAlto++;
                    }
                }

                double promedioParticipante = distanciaTotalParticipante / RONDAS_TOTALES;
                System.out.println("-> Distancia total acumulada del participante " + p + ": " + distanciaTotalParticipante + " km");
                System.out.println("-> Promedio del participante " + p + ": " + promedioParticipante + " km/ronda");

                if (distanciaTotalParticipante > mayorDistanciaAcumulada) {
                    mayorDistanciaAcumulada = distanciaTotalParticipante;
                    participanteGanador = p;
                }
            }

            System.out.println("\n--- MENÚ DE ESTADÍSTICAS GENERALES ---");
            System.out.println("1. Mostrar el conteo de rondas por cada categoría (Bajo, Medio, Alto)");
            System.out.println("2. Mostrar el participante con la mayor distancia acumulada");
            System.out.print("Seleccione una opción: ");
            int opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\n===== REPORTE DE RONDAS POR CATEGORÍA =====");
                    System.out.println("Rondas con rendimiento BAJO (< 2 km): " + rondasBajo);
                    System.out.println("Rondas con rendimiento MEDIO (entre 2 y 4 km): " + rondasMedio);
                    System.out.println("Rondas con rendimiento ALTO (> 4 km): " + rondasAlto);
                    break;

                case 2:
                    System.out.println("\n===== PARTICIPANTE DESTACADO =====");
                    System.out.println("El participante con la mayor distancia acumulada es el Participante "
                            + participanteGanador + " con un total de " + mayorDistanciaAcumulada + " km.");
                    break;

                default:
                    System.out.println("Opción de menú no válida.");
                    break;
            }

            System.out.println("\n¿Desea registrar otra competencia?");
            System.out.println("1. Sí");
            System.out.println("2. No (Finalizar)");
            System.out.print("Seleccione una opción: ");
            opcionRepetir = scanner.nextInt();

        } while (opcionRepetir == 1);

        System.out.println("Simulador de competencia finalizado con éxito.");
    }
}
