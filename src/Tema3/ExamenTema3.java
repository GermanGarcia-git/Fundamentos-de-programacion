package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 30/10/2026
 * Programa de Maquina Expendedora (Examen Tema 3)
 * */
import java.util.Scanner;

public class ExamenTema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        double totalRecaudado = 0;
        int totalUnidades = 0;

        do {
            System.out.println("\n===== MENU MAQUINA EXPENDEDORA =====");
            System.out.println("1) Agua $15");
            System.out.println("2) Jugo $22");
            System.out.println("3) Galletas $18");
            System.out.println("4) Sándwich $45");
            System.out.println("5) Consultar total");
            System.out.println("6) Finalizar compra ");
            System.out.print("Elija una opción: ");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    double precio1 = 15;
                    String producto1 = "Agua";
                    int uagua = 0;

                    while (uagua <= 0) {
                        System.out.print("Ingrese la cantidad de " + producto1 + " a comprar");
                        uagua = scanner.nextInt();
                        if (uagua <= 0) {
                            System.out.println("Error la cantidad debe ser un número entero positivo.");
                        }
                    }

                    double importe1 = precio1 * uagua;
                    totalRecaudado += importe1;
                    totalUnidades += uagua;
                    System.out.println(" Importe de esta compra: $" + importe1);

                    if (importe1 < 50) {
                        System.out.println("Clasificación de la compra: Pequeña");
                    } else if (importe1 >= 50 && importe1 <= 100) {
                        System.out.println("Clasificación de la compra: Mediana");
                    } else {
                        System.out.println("Clasificación de la compra: Grande");
                    }
                    break;

                case 2:
                    double precio2 = 22;
                    String producto2 = "Jugo";
                    int ujugo = 0;

                    while (ujugo <= 0) {
                        System.out.print("Ingrese la cantidad de " + producto2 + " a comprar ");
                        ujugo = scanner.nextInt();
                        if (ujugo <= 0) {
                            System.out.println("Erro la cantidad debe ser un número entero positivo.");
                        }
                    }

                    double importe2 = precio2 * ujugo;
                    totalRecaudado += importe2;
                    totalUnidades += ujugo;
                    System.out.println(" Importe de esta compra: $" + importe2);

                    if (importe2 < 50) {
                        System.out.println("Clasificación de la compra: Pequeña");
                    } else if (importe2 >= 50 && importe2 <= 100) {
                        System.out.println("Clasificación de la compra: Mediana");
                    } else {
                        System.out.println("Clasificación de la compra: Grande");
                    }
                    break;

                case 3:
                    double precio3 = 18;
                    String producto3 = "Galletas";
                    int ugalletas = 0;

                    while (ugalletas <= 0) {
                        System.out.print("Ingrese la cantidad de " + producto3 + " a comprar  ");
                        ugalletas = scanner.nextInt();
                        if (ugalletas <= 0) {
                            System.out.println("Error la cantidad debe ser un número entero positivo.");
                        }
                    }

                    double importe3 = precio3 * ugalletas;
                    totalRecaudado += importe3;
                    totalUnidades += ugalletas;
                    System.out.println(" Importe de esta compra: $" + importe3);

                    if (importe3 < 50) {
                        System.out.println("Clasificación de la compra: Pequeña");
                    } else if (importe3 >= 50 && importe3 <= 100) {
                        System.out.println("Clasificación de la compra: Mediana");
                    } else {
                        System.out.println("Clasificación de la compra: Grande");
                    }
                    break;

                case 4:
                    double precio4 = 45;
                    String producto4 = "Sándwich";
                    int usandwich = 0;

                    while (usandwich <= 0) {
                        System.out.print("Ingrese la cantidad de " + producto4 + " a comprar  ");
                        usandwich = scanner.nextInt();
                        if (usandwich <= 0) {
                            System.out.println("Error la cantidad debe ser un número entero positivo.");
                        }
                    }

                    double importe4 = precio4 * usandwich;
                    totalRecaudado += importe4;
                    totalUnidades += usandwich;
                    System.out.println(" Importe de esta compra: $" + importe4);

                    if (importe4 < 50) {
                        System.out.println("Clasificación de la compra: Pequeña");
                    } else if (importe4 >= 50 && importe4 <= 100) {
                        System.out.println("Clasificación de la compra: Mediana");
                    } else {
                        System.out.println("Clasificación de la compra: Grande");
                    }
                    break;

                case 5:
                    System.out.println("--- Estado Actual ---");
                    System.out.println("Total de unidades vendidas: " + totalUnidades);
                    System.out.println("Dinero total recaudado: $" + totalRecaudado);
                    break;

                case 6:
                    System.out.println("Finalizando programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (op != 6);


        System.out.println("\n===== REPORTE FINAL =====");
        System.out.println("Total de unidades vendidas: " + totalUnidades);
        System.out.println("Total dinero recaudado: $" + totalRecaudado);
    }
}