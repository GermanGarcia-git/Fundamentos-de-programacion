package Proyecto;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] categorias = {
                "Transporte",
                "Alimentos",
                "Material Escolar",
                "Entretenimiento",
                "Varios"
        };
        double[] gastosPorCategoria = new double[categorias.length];
        int[] movimientosPorCategoria = new int[categorias.length];

        Reportes.mostrarEncabezado();

        double presupuestoInicial = solicitarMontoPositivo("Ingrese su presupuesto inicial para el periodo ($): ");
        double saldoDisponible = presupuestoInicial;
        double totalGastado = 0;
        int totalMovimientos = 0;

        System.out.println("Presupuesto registrado correctamente: $" + String.format("%.2f", presupuestoInicial));

        int opcion;
        do {
            Reportes.mostrarMenuPrincipal();
            opcion = leerEntero("Seleccione una opción (1-5): ");

            switch (opcion) {
                case 1:
                    int catSeleccionada = seleccionarCategoria(categorias);
                    if (catSeleccionada != -1) {
                        double montoGasto = solicitarMontoPositivo(
                                "Ingrese el monto del gasto en " + categorias[catSeleccionada] + " ($): "
                        );

                        if (OperacionesFinancieras.hayFondosSuficientes(saldoDisponible, montoGasto)) {
                            saldoDisponible -= montoGasto;
                            totalGastado += montoGasto;
                            gastosPorCategoria[catSeleccionada] += montoGasto;
                            movimientosPorCategoria[catSeleccionada]++;
                            totalMovimientos++;

                            System.out.println("\n[OK] Gasto registrado en " + categorias[catSeleccionada] + ".");
                            System.out.println("Saldo disponible actual: $" + String.format("%.2f", saldoDisponible));
                        } else {
                            System.out.println("\n[ALERTA] Fondos insuficientes.");
                            System.out.println("Saldo disponible: $" + String.format("%.2f", saldoDisponible));
                        }
                    } else {
                        System.out.println("\n[ERROR] Categoría no válida. Debe elegir entre 1 y " + categorias.length + ".");
                    }
                    break;

                case 2:
                    Reportes.mostrarBalanceActual(presupuestoInicial, totalGastado, saldoDisponible, totalMovimientos);
                    break;

                case 3:
                    Reportes.mostrarDesgloseCategorias(categorias, gastosPorCategoria, movimientosPorCategoria, totalGastado);
                    break;

                case 4:
                    double meta = solicitarMontoPositivo("\nIngrese el monto de su meta de ahorro ($): ");
                    int dias = solicitarEnteroPositivo("¿En cuántos días desea lograr esta meta?: ");
                    Reportes.mostrarAnalisisMeta(meta, dias, saldoDisponible);
                    break;

                case 5:
                    System.out.println("\nCerrando registro del periodo y generando reporte final...");
                    break;

                default:
                    System.out.println("\n[ERROR] Opción no válida. Intente con un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);

        Reportes.mostrarReporteFinal(
                presupuestoInicial,
                totalGastado,
                saldoDisponible,
                totalMovimientos,
                categorias,
                gastosPorCategoria
        );

        scanner.close();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("[ERROR] Ingrese un número entero válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("[ERROR] Ingrese un monto numérico válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static double solicitarMontoPositivo(String mensaje) {
        double monto = leerDouble(mensaje);
        while (monto <= 0) {
            System.out.println("[ERROR] El monto debe ser mayor a $0.00.");
            monto = leerDouble("Intente nuevamente: ");
        }
        return monto;
    }

    public static int solicitarEnteroPositivo(String mensaje) {
        int valor = leerEntero(mensaje);
        while (valor <= 0) {
            System.out.println("[ERROR] El valor debe ser mayor a 0.");
            valor = leerEntero("Intente nuevamente: ");
        }
        return valor;
    }

    public static int seleccionarCategoria(String[] categorias) {
        System.out.println("\n--- Categorías de Gasto ---");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }

        int opcionCat = leerEntero("Elija una categoría (1-" + categorias.length + "): ");
        if (opcionCat >= 1 && opcionCat <= categorias.length) {
            return opcionCat - 1;
        }
        return -1;
    }
}