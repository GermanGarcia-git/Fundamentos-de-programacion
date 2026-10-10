import java.util.Scanner;

public class Comision {
    public static void main(String[] args) {

        final double COMISION = 10.0;
        final double LIMITE_RETIRO = 5000.0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el saldo disponible: ");
        double saldoDisponible = scanner.nextDouble();

        System.out.print("Ingrese la cantidad que desea retirar: ");
        double montoRetiro = scanner.nextDouble();


        if (montoRetiro <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor a cero.");
        } else {
            if (montoRetiro > LIMITE_RETIRO) {
                System.out.println("Error: La cantidad a retirar supera el límite permitido ($" + LIMITE_RETIRO + ").");
            } else {
                if ((montoRetiro + COMISION) > saldoDisponible) {
                    System.out.println("Error: Saldo insuficiente para cubrir el retiro y la comisión de $" + COMISION);
                } else {

                    double totalDeducido = montoRetiro + COMISION;
                    double saldoFinal = saldoDisponible - totalDeducido;

                    System.out.println("\n===== RETIRO AUTORIZADO =====");
                    System.out.println("Monto retirado: $" + montoRetiro);
                    System.out.println("Comisión bancaria: $" + COMISION);
                    System.out.println("Saldo final: $" + saldoFinal);
                }
            }
        }

        scanner.close();
    }
}
