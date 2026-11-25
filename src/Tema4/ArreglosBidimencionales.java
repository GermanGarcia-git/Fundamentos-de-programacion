package Tema4;

public class ArreglosBidimencionales {

    static void main(String[] args) {

        int [] edades = new int[5];
        int [] edades2 = {1,2,3,4,5};
        Float [] decimales = {1.1f,2.2f,4.5f};


        int[][] numeros;
        int[][] numeros2 = new int [3][4];
        int[][] numeros3 ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(numeros3[0][0]);
        System.out.println(numeros3[1][1]);
    }
}
