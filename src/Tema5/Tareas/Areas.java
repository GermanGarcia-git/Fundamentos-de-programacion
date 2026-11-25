package Tema5.Tareas;

import java.util.Scanner;

public class Areas {
    static Scanner scanner = new Scanner(System.in);
    public static void menu(int op){
        switch (op){
            case 1:
                System.out.println(cuadrado());
            break;
            case 2:
                System.out.println(Triangulo());
                break;
            default:
        }
    }
    private static int cuadrado(){
        int l;
        System.out.println("Ingrese el valor de  un lado");
        l = scanner.nextInt();
        return l*l;

    }
    private static int Triangulo(){
        int b,h;
        System.out.println("Ingresa el valor de la base");
        b = scanner.nextInt();
        System.out.println("Ingresa el valor de la altura");
        h = scanner.nextInt();
        return (b*h/2);
    }
}
