package Tema3;

import java.util.Scanner;

public class DiasDeLaSemana {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Elige una opcion del 1 al 7");
        opcion = scanner.nextInt();
        switch (opcion){
            case 1://inicio de caso 1
                System.out.println("Lunes");

                break;//fin de caso 1
            case 2://inicio de caso 2
                    System.out.println("Martes");
                break;//fin de caso 2
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
                case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Elegiste una opcion no valida");
                break;




        }
    }

}
