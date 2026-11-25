package Tema5;

public class Metodo {

    static int CONSTANTE =10;
    static int acumulador = 0;

    static void main(String[] args) {

        System.out.println("Hola mundo");
        float a = 5.0f;
        float b = 10.5f;
        suma();
        resta();
        float c = a+b+CONSTANTE;
        acumulador +=c;
        System.out.println("c = " + c);
        resta();
        resta();
        resta();
    }

    public static void suma(){

        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Resultado = " + (a+b+CONSTANTE));
        acumulador += (a+b+CONSTANTE);
    }

    public static void resta(){
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Resultado = " + (a-b+CONSTANTE));
        acumulador += (a-b+CONSTANTE);
    }



}
