package Tema3;

import java.util.Scanner;

public class Areas {

    static void main(String[] args) {
        final double pi=3.14159;
        int op,l,b,h,r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Cuadrado \n 2) Rectangulo \n 3)Triangulo \n 4)Circulo");
        op = scanner.nextInt();
        System.out.println("Ingerese el valor de uno de los lados");
        l = scanner.nextInt();
        System.out.println("Ingerese el valor de la base ");
        b = scanner.nextInt();
        System.out.println("Ingerese el valor de la altura");
        h = scanner.nextInt();
        System.out.println("Ingerese el valor del rodio");
        r = scanner.nextInt();
        int opcion = scanner.nextInt();
        switch (op) {

            case 1:
                System.out.println("Resultado =" + (l*l) +"cm²");
                break;
            case 2:
                System.out.println("Resultado =" + (b*h) + "cm²");
                break;
            case 3:
                System.out.println("Resultado =" + (b*b) + "cm²");
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Resultado = " + ((pi*r)*2) + "cm²");
                } else {
                    System.out.println("No puedes dividir entre 0");


                }
        }
    }
}

