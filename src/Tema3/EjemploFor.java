package Tema3;

import java.util.Scanner;

public class EjemploFor {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int interacciones;
        System.out.println("Ingresa el numero de ineracciones");
        interacciones= scanner.nextInt();

        for (int i = 1; i<=10; i++ ){//inicio de for
            System.out.println(i);
        }//fin de for
        System.out.println("Continua operacion");
    }

}
