package Tema3;

import java.util.Scanner;

public class OperacionesMatematicas {

    static void main(String[] args) {
        int op, a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Suma 2) Resta 3)Multiplicaccion 4)Division");
        op = scanner.nextInt();
        System.out.println("Ingerese el valor para a");
        a = scanner.nextInt();
        System.out.println("Ingerese el valor para b");
        b = scanner.nextInt();
        switch (op) {

            case 1:
                System.out.println("Resultado =" + (a + b));
                break;
            case 2:
                System.out.println("Resultado =" + (a - b));
                break;
            case 3:
                System.out.println("Resultado =" + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Resultado = " + (a / b));
                } else {
                    System.out.println("No puedes dividir entre 0");


                }
        }
    }
}