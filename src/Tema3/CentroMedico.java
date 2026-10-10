package Tema3;

import java.util.Scanner;

/*
 * Instituto Tecnologico De Pachuca
 * Fundamentos de programacion
 * GARCIA REYES GERMAN 26201073
 * 16/10/2026
 * Programa de Centro Medico
 * */
public class CentroMedico {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double porcentajeDescuento = 0.15;
        int contNiños =0;
        int contAdolecentes=0;
        int contAdultos =0;
        int contMayores =0;
        int totalPacientes =0;
        double acumDineroRecaudado = 0;
        double acumDescuentosAplicados = 0;
        int op;

        do{
            System.out.println("=====REGISTRO PACIENTE=====");
            System.out.println("Ingrese la edad del paciente");
            int edad = scanner.nextInt();

            System.out.println("Ingrese el costo de la consulta");
            double costoConsulta = scanner.nextDouble();

            if (edad<0 || costoConsulta<0){
                System.out.println("Eror. La edad y el costo deben ser mayores a cero.");
            }else {
                totalPacientes++;
                double descuento=0;

                if (edad < 12){
                    System.out.println("Niño");
                    contNiños++;
                }else {
                    if (edad <=17){
                        System.out.println("Adolecente");
                        contAdolecentes++;
                    }else{
                        if (edad <=59){
                            System.out.println("Adulto");
                            contAdultos++;
                        }else{
                            System.out.println("Adulto Mayor");
                            contMayores++;

                            descuento=costoConsulta*porcentajeDescuento;
                        }
                    }
                }
                double costofinal= costoConsulta-descuento;

                acumDescuentosAplicados += descuento;
                acumDineroRecaudado+=costofinal;

                System.out.println("Descuento aplicado: $" + descuento);
                System.out.println("Total a pagar del paciente: $" + costofinal);
            }
            System.out.println("Desea registrar a otro paciente?");
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
                    System.out.println("Se finalizara su registro.");
                    op=2;
                    break;
            }

        }while (op==1);

        System.out.println("=====REPORTE FINAL DEL DIA=====");
        System.out.println("Total de pacientes atendidos: " + totalPacientes);
        System.out.println("Niños atendidos: " + contNiños);
        System.out.println("Adolecentes atendidos: " + contAdolecentes);
        System.out.println("Adultos atendidos: " + contAdultos);
        System.out.println("Adultos mayores atendidos: " + contMayores);
        System.out.println("Dinero total recaudado: $" + acumDineroRecaudado);
        System.out.println("Total de descuentos aplicados: $" + acumDescuentosAplicados);

        if (totalPacientes>0){
            double promedioPagado= acumDineroRecaudado/totalPacientes;
            System.out.println("Promedio pagado por paciente: $" + promedioPagado);
        }else{
            System.out.println("No se registraron pacientes");
        }

    }

}
