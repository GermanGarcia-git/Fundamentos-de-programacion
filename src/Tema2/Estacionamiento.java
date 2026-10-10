import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {

        final double TARIFA_MOTOCICLETA = 10.0;
        final double TARIFA_AUTOMOVIL = 20.0;
        final double TARIFA_CAMIONETA = 30.0;


        final double DESCUENTO_5_HORAS = 0.10;
        final double DESCUENTO_10_HORAS = 0.20;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Tipo de vehículo:");
        System.out.println("1. Motocicleta");
        System.out.println("2. Automóvil");
        System.out.println("3. Camioneta");
        System.out.print("Seleccione una opción (1, 2 o 3): ");
        int tipoVehiculo = scanner.nextInt();

        System.out.print("Ingrese el número de horas estacionado: ");
        int horas = scanner.nextInt();


        if (horas <= 0) {
            System.out.println("Error: La cantidad de horas no es válida.");
        } else {
            double tarifa = 0.0;
            String nombreVehiculo = "";


            if (tipoVehiculo == 1) {
                tarifa = TARIFA_MOTOCICLETA;
                nombreVehiculo = "Motocicleta";
            } else {
                if (tipoVehiculo == 2) {
                    tarifa = TARIFA_AUTOMOVIL;
                    nombreVehiculo = "Automóvil";
                } else {
                    if (tipoVehiculo == 3) {
                        tarifa = TARIFA_CAMIONETA;
                        nombreVehiculo = "Camioneta";
                    } else {
                        System.out.println("Tipo de vehículo no válido.");
                    }
                }
            }


            if (tipoVehiculo >= 1 && tipoVehiculo <= 3) {
                double subtotal = horas * tarifa;
                double porcentajeDescuento = 0.0;


                if (horas > 10) {
                    porcentajeDescuento = DESCUENTO_10_HORAS;
                } else {
                    if (horas > 5) {
                        porcentajeDescuento = DESCUENTO_5_HORAS;
                    } else {
                        porcentajeDescuento = 0.0;
                    }
                }

                double descuento = subtotal * porcentajeDescuento;
                double totalAPagar = subtotal - descuento;


                System.out.println("\n===== RESUMEN DE COBRO =====");
                System.out.println("Tipo de vehículo: " + nombreVehiculo);
                System.out.println("Horas estacionado: " + horas);
                System.out.println("Tarifa por hora: $" + tarifa);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalAPagar);
            }
        }

        scanner.close();
    }
}
