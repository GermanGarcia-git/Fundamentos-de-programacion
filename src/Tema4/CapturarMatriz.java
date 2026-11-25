package Tema4;

import java.util.Scanner;

public class CapturarMatriz {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingresa el valor de la fola" + i + "y columna" + j);
                numeros[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mostrar contenido de la matriz");
     for (int i =0;i< numeros.length;i++){
         for (int j = 0; j< numeros[i].length; j++){
             System.out.print(numeros[i][j]+ "\t");
         }
         System.out.println();
     }
    }
}
