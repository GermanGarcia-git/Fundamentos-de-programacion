
    import java.util.Scanner;

    public class CajeroAuto {
        public static void main(String[] args) {

            final double LIMITE_RETIRO = 5000.0;

            Scanner scanner = new Scanner(System.in);


            System.out.print("Ingrese el saldo disponible: ");
            double saldoDisponible = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que desea retirar: ");
            double montoRetiro = scanner.nextDouble();


            if (montoRetiro <= 0) {
                System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
            } else {
                if (montoRetiro > LIMITE_RETIRO) {
                    System.out.println("Error: La cantidad a retirar supera el límite permitido ($" + LIMITE_RETIRO + ").");
                } else {
                    if (montoRetiro > saldoDisponible) {
                        System.out.println("Error: Fondos insuficientes. La cantidad a retirar es mayor al saldo disponible.");
                    } else {

                        double nuevoSaldo = saldoDisponible - montoRetiro;

                        System.out.println("\nRetiro autorizado");
                        System.out.println("Cantidad retirada: $" + montoRetiro);
                        System.out.println("Nuevo saldo: $" + nuevoSaldo);


                        if (nuevoSaldo < 500.0) {
                            System.out.println("Advertencia: Su saldo restante es menor a $500.");
                        }
                    }
                }
            }

            scanner.close();
        }
    }

