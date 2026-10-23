package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * Fernandez Cervantes Diego 26201065
 * 23/10/2026
 * Programa de Analisis de Numeros
 * */

import java.util.Scanner;

public class Numeros {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= 0;

        while(n <= 0){
            System.out.println("Ingrese un numero entero positivo");
            n = scanner.nextInt();
            if (n <= 0){
                System.out.println("Error, debe colocar numeros mayores a cero");
            }
        }

        int sumaPares = 0;
        int contadorDivisibles3 =0 ;
        int sumaPrimos = 0;
        int contadorPrimos = 0;

        System.out.println("\n -- De 1 hasta " + n + " ---");
        for (int i = 1; i <= n; i++) {
            if (i % 2 ==0){
                sumaPares += i;
            }
            if (i % 3 ==0){
                contadorDivisibles3++;
            }
            int contadorDivisores =0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                }
            }
            if (contadorDivisores==2){
                sumaPrimos +=i;
                contadorPrimos++;
            }
        }

        double promedioPrimos =0;
        if (contadorPrimos >0){
            promedioPrimos = sumaPrimos / contadorPrimos;
        }
        System.out.println("\n=====REPORTE DEL ANALISIS =====");
        System.out.println("Suma de los numeros pares: " + sumaPares);
        System.out.println("Cantidad de numeros divisibles entre 3: " + contadorDivisibles3);
        System.out.println("Cantidad de los numeros primos encontrados: " + contadorPrimos);
        System.out.println("Promedio de los numeros primos: " + promedioPrimos);
    }

}
