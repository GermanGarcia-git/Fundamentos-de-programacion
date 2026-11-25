package Tema5;

import java.util.Scanner;

public class MetodosRetorno {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
      int op;
        System.out.println("Seleciona una opcion \n 1)Cuadrado \n 2)Triangulo \n 3)Circulo \n 4)Rectangulo \n 5)Salir");
        op = scanner.nextInt();
        switch (op){
            case 1:
                System.out.println("Area = " + cuadrado());
                break;
            case 2:
                System.out.println("Area = " + triangulo());
                break;
            case 3:
                System.out.println("Area = " + circulo());
                break;
            case 4:
                System.out.println("Area = " + rectangulo());
                break;
            case 5:
                op=5;
                System.out.println("Saliendo");
                break;

        }
    }

    public static double cuadrado(){
        double l =0;
        System.out.println("Ingresa el valor de una lado");
        l = scanner.nextDouble();
        return(l*l);
    }
    public static double triangulo() {
        double b,h = 0;
        System.out.println("Ingresa el valor de la base");
        b = scanner.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        h = scanner.nextDouble();
        return (b*h/2);
    }
    public static double circulo() {
        double r = 0;
        System.out.println("Ingresa el valor del radio");
        r = scanner.nextDouble();
        return (3.1416*(r*r));
    }
    public static double rectangulo() {
        double b,h = 0;
        System.out.println("Ingresa el valor de la base");
        b = scanner.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        h = scanner.nextDouble();
        return (b*h);
    }
}
