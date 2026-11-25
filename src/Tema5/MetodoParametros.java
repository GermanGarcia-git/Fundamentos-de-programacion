package Tema5;

import java.util.Scanner;

public class MetodoParametros {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op= 0,a,b;
        System.out.println("Ingresa una opcion 1)Suma 2)Resta 3)Multiplicacion 4)Division");
        op = scanner.nextInt();
        System.out.println("Ingresa el valor de a");
        a = scanner.nextInt();
        System.out.println("Ingresa el valor de b");
        b = scanner.nextInt();

        switch (op){

            case 1:
                suma(a,b);
                break;
            case 2:
                resta(a,b);
                break;
            case 3:
                multiplicacion(a,b);
                break;
            case 4:
                division(a,b);
                break;
            default:
                System.out.println("No valido");
                break;
        }
    }

    public static void suma(int a, int b){

           System.out.println("Suma =" + (a+b));
       }
    public static void resta(int a, int b) {

        System.out.println("Resta =" + (a - b));
    }
    public static void multiplicacion(int a, int b) {

        System.out.println("Multiplicacion =" + (a + b));
    }
    public static void division(int a, int b) {
        if (b==0){
            System.out.println("No se puede");
        }else {
            System.out.println("Division =" + (a / b));
        }
    }
}

