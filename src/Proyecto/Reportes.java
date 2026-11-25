package Proyecto;

public class Reportes {

    public static void mostrarEncabezado() {
        System.out.println("=======================================================");
        System.out.println("   FINANZAS ESTUDIANTILES - CONTROL DE PRESUPUESTO    ");
        System.out.println("=======================================================");
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\n------------------- MENÚ PRINCIPAL -------------------");
        System.out.println("1. Registrar un gasto");
        System.out.println("2. Consultar balance actual");
        System.out.println("3. Ver desglose por categoría");
        System.out.println("4. [PLUS] Simulador y seguimiento de meta de ahorro");
        System.out.println("5. Finalizar periodo y ver reporte final");
        System.out.println("------------------------------------------------------");
    }

    public static void mostrarBalanceActual(double inicial, double gastado, double disponible, int movimientos) {
        double pctGastado = OperacionesFinancieras.calcularPorcentaje(gastado, inicial);
        double pctDisponible = OperacionesFinancieras.calcularPorcentaje(disponible, inicial);
        double promedio = OperacionesFinancieras.calcularPromedioGasto(gastado, movimientos);

        System.out.println("\n================ BALANCE FINANCIERO ================");
        System.out.println("Presupuesto inicial : $" + String.format("%.2f", inicial));
        System.out.println("Total gastado       : $" + String.format("%.2f", gastado) + " (" + String.format("%.2f", pctGastado) + "%)");
        System.out.println("Saldo disponible    : $" + String.format("%.2f", disponible) + " (" + String.format("%.2f", pctDisponible) + "%)");
        System.out.println("Gastos registrados  : " + movimientos);
        System.out.println("Gasto promedio/mov. : $" + String.format("%.2f", promedio));
        System.out.println("====================================================");
    }

    public static void mostrarDesgloseCategorias(String[] categorias, double[] gastos, int[] movimientos, double totalGastado) {
        System.out.println("\n=============== DESGLOSE POR CATEGORÍA ===============");
        for (int i = 0; i < categorias.length; i++) {
            double pctDelGasto = OperacionesFinancieras.calcularPorcentaje(gastos[i], totalGastado);
            System.out.printf("%-18s | $%8.2f | %5.2f%% del gasto | %d mov.%n",
                    categorias[i], gastos[i], pctDelGasto, movimientos[i]);
        }
        System.out.println("======================================================");
    }


    public static void mostrarAnalisisMeta(double metaAhorro, int dias, double saldoDisponible) {
        double faltante = OperacionesFinancieras.calcularFaltanteMeta(metaAhorro, saldoDisponible);
        double cuotaDiaria = OperacionesFinancieras.calcularAhorroPorDia(metaAhorro, dias);

        System.out.println("\n===========  PLAN DE META DE AHORRO ===========");
        System.out.println("Meta propuesta      : $" + String.format("%.2f", metaAhorro));
        System.out.println("Plazo elegido       : " + dias + " días");
        System.out.println("Ahorro sugerido/día : $" + String.format("%.2f", cuotaDiaria));
        System.out.println("Saldo libre actual  : $" + String.format("%.2f", saldoDisponible));

        if (faltante == 0) {
            System.out.println("Estado de la meta   : ¡META CUBIERTA! Tu saldo actual alcanza para cubrirla.");
        } else {
            System.out.println("Estado de la meta   : Te faltan $" + String.format("%.2f", faltante) + " para alcanzarla.");
            System.out.println("Consejo             : Evita gastos hormiga para proteger este objetivo.");
        }
        System.out.println("=====================================================");
    }

    public static void mostrarReporteFinal(
            double inicial,
            double gastado,
            double ahorroFinal,
            int movimientos,
            String[] categorias,
            double[] gastos
    ) {
        double pctAhorro = OperacionesFinancieras.calcularPorcentaje(ahorroFinal, inicial);
        double pctGastado = OperacionesFinancieras.calcularPorcentaje(gastado, inicial);
        int indiceMayor = OperacionesFinancieras.obtenerIndiceMayorGasto(gastos);

        System.out.println("\n=======================================================");
        System.out.println("              REPORTE FINAL DE FINANZAS                ");
        System.out.println("=======================================================");
        System.out.println("Presupuesto inicial : $" + String.format("%.2f", inicial));
        System.out.println("Total gastado       : $" + String.format("%.2f", gastado) + " (" + String.format("%.2f", pctGastado) + "%)");
        System.out.println("Ahorro / Saldo final: $" + String.format("%.2f", ahorroFinal) + " (" + String.format("%.2f", pctAhorro) + "%)");
        System.out.println("Total de gastos     : " + movimientos);

        if (gastado > 0) {
            System.out.println("Categoría con mayor gasto: " + categorias[indiceMayor] +
                    " ($" + String.format("%.2f", gastos[indiceMayor]) + ")");
        } else {
            System.out.println("Categoría con mayor gasto: Ninguno (no se registraron gastos)");
        }

        System.out.println("\nDIAGNÓSTICO FINANCIERO:");
        if (pctAhorro >= 20.0) {
            System.out.println("Excelente control: conservaste el 20% o más de tu presupuesto inicial.");
        } else if (ahorroFinal > 0.0) {
            System.out.println("Buen resultado: terminaste con saldo positivo y sin déficit.");
        } else {
            System.out.println("Atención: agotaste por completo tu presupuesto. Conviene ajustar gastos variables.");
        }
        System.out.println("=======================================================");
    }
}