import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        // Constantes para los porcentajes de descuento según las instrucciones[span_0](start_span)[span_0](end_span)[span_1](start_span)[span_1](end_span)
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        final double MONTO_MINIMO_ADICIONAL = 2000.0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        System.out.println("Tipo de cliente:");
        System.out.println("1. Cliente normal");
        System.out.println("2. Cliente frecuente");
        System.out.println("3. Cliente VIP");
        System.out.print("Seleccione una opción (1, 2 o 3): ");
        int tipoCliente = scanner.nextInt();

        double porcentajeCliente = 0.0;


        if (tipoCliente == 2) {
            porcentajeCliente = DESCUENTO_FRECUENTE;
        } else {
            if (tipoCliente == 3) {
                porcentajeCliente = DESCUENTO_VIP;
            } else {
                porcentajeCliente = 0.0; // Cliente normal o valor por defecto
            }
        }


        double descuentoCliente = montoCompra * porcentajeCliente;


        double descuentoAdicional = 0.0;
        if (montoCompra > MONTO_MINIMO_ADICIONAL) {
            descuentoAdicional = montoCompra * DESCUENTO_ADICIONAL;
        }


        double totalDescuentos = descuentoCliente + descuentoAdicional;
        double totalAPagar = montoCompra - totalDescuentos;


        System.out.println("\n===== RESUMEN DE COMPRA =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto original: $" + montoCompra);
        System.out.println("Descuento por tipo de cliente: $" + descuentoCliente);
        System.out.println("Descuento adicional (> $2000): $" + descuentoAdicional);
        System.out.println("Total de descuentos: $" + totalDescuentos);
        System.out.println("Total a pagar: $" + totalAPagar);

        scanner.close();
    }
}