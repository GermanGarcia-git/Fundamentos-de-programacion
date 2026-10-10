package Tema2;

import java.util.Scanner;

public class EXAMEN {
    static void main(String[] args) {
        final double Sincosto =0;
        final double Peso_Maximo = 30;
        final double Cargo_Ligero =150;
        final double Cargo_Medio =300;
        final double Cargo_Pesado =500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del pasajero");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el peso de la maleta");
        double peso = scanner.nextDouble();

        double CostoCargo =0.0;

        if (peso <= 15.0){
            CostoCargo = 0.0;
        } else {
            if (peso <=20.0){
                CostoCargo = Cargo_Ligero;
            } else{
                if (peso <= Peso_Maximo){
                    CostoCargo = Cargo_Medio;
                } else {
                    CostoCargo = Cargo_Pesado;
                }
            }
        }
        System.out.println("\n===== Registro De Equipaje =====");
        System.out.println("Pasajero: " + nombre);
        System.out.println("Peso del equipaje: " + peso + "kg.");
        System.out.println("Costo por equipaje: $" + CostoCargo);

        if (peso > Peso_Maximo){
            System.out.println("ADVERTENCIA: El equipaje excede el peso permitido (" + Peso_Maximo + "Kg.");
        }
        scanner.close();





    }
}
