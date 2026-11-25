package Proyecto;

public class OperacionesFinancieras {

    public static double calcularPorcentaje(double parte, double total) {
        if (total <= 0) {
            return 0;
        }
        return (parte / total) * 100;
    }


    public static boolean hayFondosSuficientes(double saldoDisponible, double montoGasto) {
        return montoGasto > 0 && montoGasto <= saldoDisponible;
    }


    public static int obtenerIndiceMayorGasto(double[] gastos) {
        int indiceMayor = 0;
        for (int i = 1; i < gastos.length; i++) {
            if (gastos[i] > gastos[indiceMayor]) {
                indiceMayor = i;
            }
        }
        return indiceMayor;
    }


    public static double calcularPromedioGasto(double totalGastado, int totalMovimientos) {
        if (totalMovimientos <= 0) {
            return 0;
        }
        return totalGastado / totalMovimientos;
    }

    public static double calcularFaltanteMeta(double metaAhorro, double saldoDisponible) {
        if (saldoDisponible >= metaAhorro) {
            return 0;
        }
        return metaAhorro - saldoDisponible;
    }

    public static double calcularAhorroPorDia(double montoMeta, int dias) {
        if (dias <= 0) {
            return montoMeta;
        }
        return montoMeta / dias;
    }
}