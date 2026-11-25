package Tema5;

import java.util.Scanner;

public class CajeroAutomatico{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=== CAJERO AUTOMÁTICO ===");

        System.out.print("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el saldo disponible en su cuenta ($): ");
        double saldo = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de dinero que desea retirar ($): ");
        double retiro = scanner.nextDouble();

        procesarRetiro(nombre, saldo, retiro);
    }
    public static void procesarRetiro(String nombre, double saldo, double retiro) {
        if (retiro <= 0) {
            System.out.println("\n La cantidad a retirar debe ser mayor a cero.");
        } else if (retiro > saldo) {
            System.out.println("\n  Fondos insuficientes. La cantidad supera el saldo disponible.");
        } else if (retiro % 50 != 0) {
            System.out.println("\n  La cantidad debe ser un múltiplo exacto de 50.");
        } else {
            double saldoRestante = saldo - retiro;
            mostrarComprobante(nombre, retiro, saldoRestante);
        }
    }
    public static void mostrarComprobante(String nombre, double retiro, double saldoRestante) {
        System.out.println("\n==========================================");
        System.out.println("          COMPROBANTE DE RETIRO           ");
        System.out.println("==========================================");
        System.out.println(" Nombre del cliente : " + nombre);
        System.out.println(" Cantidad retirada  : $" + retiro);
        System.out.println(" Saldo restante     : $" + saldoRestante);
        System.out.println("==========================================");
        System.out.println(" ¡Gracias por utilizar nuestro cajero!   ");
        System.out.println("==========================================");
    }
}