package Tema3;

import java.util.Scanner;

public class FastFood {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona algo del menu A)Hamburguesa B)Hot-Dog C) Pizza");

        int op=0;
        switch (op){

            case 1:
                System.out.println("Hamburguesa");
                break;
            case 2:
                System.out.println("Hot-Dog");
                break;
            case 3:
                System.out.println("Pizza");
                break;
            default:
                System.out.println("No seleccionaste nada del menu");
                break;


        }
    }
}
