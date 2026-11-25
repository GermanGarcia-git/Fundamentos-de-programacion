package Tema5.Tareas;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("Selecciona una opcion 1) Cuadrado 2)Triangulo ");
        op = scanner.nextInt();
        Areas.menu(op);
    }
}
