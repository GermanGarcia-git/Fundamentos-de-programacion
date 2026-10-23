package Tema3;

import java.util.Scanner;

public class VentasDiasFor {
    static void main(String[] args) {

        int numeroDias, ventaDia, acumuladorVentas = 0,contadorDiasBuenos=0, respuesta;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingresa el numero de dias");
            numeroDias = scanner.nextInt();
            for (int i = 1; i <= numeroDias; i++) {//inicio for
                System.out.println("Ingresa la venta del dia " + i);
                ventaDia = scanner.nextInt();
                acumuladorVentas += ventaDia; //acumulador ventas = acumulador ventas + ventasDia
                if (ventaDia >= 1000) {
                    contadorDiasBuenos++;
                }
                if (ventaDia>= 5000){
                    break;
                }
            }//fin del for
            System.out.println("Dias buenos = " + contadorDiasBuenos);
            System.out.println("Acumulador de ventas = " + acumuladorVentas);
            System.out.println("Desea repetir la operacion? \n 1)si \n 2)No");
            respuesta = scanner.nextInt();
        }while(respuesta==1);
    }

}
