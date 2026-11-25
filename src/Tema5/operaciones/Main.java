package Tema5.operaciones;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese el valor para a");
        a = scanner.nextInt();
        System.out.println("Ingrese el valor para b");
        b = scanner.nextInt();
        System.out.println("Suma -> " + Operaciones.sumar(a,b));
        System.out.println("Resta -> " + Operaciones.restar(a,b));
        System.out.println("Multiplicar -> " + Operaciones.multiplicar(a,b));
        System.out.println("Dividir -> " + Operaciones.dividir(a,b));
        int resultado = Operaciones.sumar(a,b);

    }
}
