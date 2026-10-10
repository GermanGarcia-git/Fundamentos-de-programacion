import java.util.Scanner;

    public class SCalificaciones {
        public static void main(String[] args) {

            final double MINIMO_APROBATORIO = 70.0;
            final double MINIMO_UNIDAD = 60.0;

            Scanner scanner = new Scanner(System.in);


            System.out.print("Ingrese la calificación de la unidad 1: ");
            double calificacion1 = scanner.nextDouble();

            System.out.print("Ingrese la calificación de la unidad 2: ");
            double calificacion2 = scanner.nextDouble();

            System.out.print("Ingrese la calificación de la unidad 3: ");
            double calificacion3 = scanner.nextDouble();


            double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;


            System.out.println("\n===== RESUMEN DE CALIFICACIONES =====");
            System.out.println("Unidad 1: " + calificacion1);
            System.out.println("Unidad 2: " + calificacion2);
            System.out.println("Unidad 3: " + calificacion3);
            System.out.println("Promedio general: " + promedio);


            if (promedio >= MINIMO_APROBATORIO) {
                System.out.println("Resultado final: Aprobado");
            } else {
                System.out.println("Resultado final: Reprobado");
            }


            if (calificacion1 < MINIMO_UNIDAD) {
                System.out.println("Atención: Debe presentar recuperación de la Unidad 1.");
            }
            if (calificacion2 < MINIMO_UNIDAD) {
                System.out.println("Atención: Debe presentar recuperación de la Unidad 2.");
            }
            if (calificacion3 < MINIMO_UNIDAD) {
                System.out.println("Atención: Debe presentar recuperación de la Unidad 3.");
            }

            scanner.close();
        }
    }

