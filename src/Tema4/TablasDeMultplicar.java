package Tema4;



public class TablasDeMultplicar {

    static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = " + i*j);
                for (int k = 1; k <= 10; k++) {
                    System.out.println(i+" * "+j+" * "+k+" = "+(i*j*k));
                }
            }
        }


    }

}
