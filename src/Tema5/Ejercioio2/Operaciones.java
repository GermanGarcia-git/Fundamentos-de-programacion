package Tema5.Ejercioio2;

public class Operaciones {


    public static double calcularSubtotal(double precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }


    public static double calcularDescuento(double subtotal) {
        return subtotal * 0.15;
    }


    public static double calcularIva(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    
    public static double calcularTotal(double subtotalConDescuento, double iva) {
        return subtotalConDescuento + iva;
    }
}
