package Tema3;
/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 16/10/2026
 * Programa de cobro de gasolinera
 * */
import java.util.Scanner;

public class Gasolinera {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


         final  double Descuento =0.5;
        int op=0;
        final double cargalimite= 40;
        int cargas =0;
        double acomuladorLitros =0;
        double acomuladorSindescuento =0;
        double acomuladorTotalCobrado =0;
        int contadorconDescuento =0;


                do{
                    System.out.println("========Nueva Carga========");
                    System.out.println("Ingrese los litros cargados");
                    double litros = scanner.nextDouble();

                    System.out.println("Ingrese el precio por litro");
                    double precioporlitro = scanner.nextDouble();

                    if (litros <=0 || precioporlitro <=0){
                        System.out.println("Error los litros y el precio deben de ser mayores a cero");
                    }else {
                        cargas++;
                        double importesindescuento = litros * precioporlitro;

                        acomuladorLitros += litros;
                        acomuladorSindescuento += importesindescuento;

                        double importefinalcarga = importesindescuento;

                        if (litros >= cargalimite){
                            double descuento = importesindescuento * Descuento;
                            importefinalcarga = importesindescuento - descuento;
                            contadorconDescuento++;
                            System.out.println("Se aplico un descuento del 5%");
                        }else {
                            System.out.println("No aplica descuento por menos de 40 litros");
                        }
                        acomuladorTotalCobrado += importefinalcarga;
                        System.out.println("Importe a pagar por esta carga es: $" + importefinalcarga );

                    }
                    System.out.println("Desea registrar otra carga?");
                    System.out.println("1)Si");
                    System.out.println("2)No");
                    System.out.println("Seleccione una opcion");
                    op= scanner.nextInt();

                    switch (op){
                        case 1:

                            break;
                        case 2:

                            break;
                        default:
                            System.out.println("Opcion no valida");
                            op=2;
                            break;

                    }
                }while(op==1);
        System.out.println("=====REPORTE FINIAL=====");
        System.out.println("Total de cargas: " + cargas);
        System.out.println("Total de litros vendidos: " + acomuladorLitros + " L");
        System.out.println("Importe total antes de descuentos: $" + acomuladorSindescuento);
        System.out.println("Total cobrado $" + acomuladorTotalCobrado);
        System.out.println("Cargas con descuento: " + contadorconDescuento);

        if (cargas >0){
            double importe = acomuladorTotalCobrado / cargas;
            System.out.println("Importe promedio por carga: $" + importe);
        }else {
            System.out.println("No se registraron cargas validas");
        }
    }
}
