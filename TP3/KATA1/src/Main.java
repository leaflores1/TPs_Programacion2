import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double calif;
        int opcion;
        int continuar=1;


        // Crear objeto Estudiante
        Estudiante estudiante1 = new Estudiante("Lea", "Flores", "A", 0.00);

        while(continuar != 0) {
            estudiante1.mostrarInfo();

            System.out.println("Desea subir o bajar puntos? opcion1: subir, opcion2: bajar. : ");
            opcion = input.nextInt();

            if (opcion == 1) {
                System.out.println("\nIngrese puntos a subir en la calificacion: ");
                calif = input.nextDouble();
                estudiante1.subirCalificacion(calif);
            }
            if (opcion == 2) {
                System.out.println("\nIngrese puntos a bajar en la calificacion: ");
                calif = input.nextDouble();
                estudiante1.bajarCalificacion(calif);
            }

            // Mostrar información actualizada
            System.out.println("\nInformación actualizada del estudiante:");
            estudiante1.mostrarInfo();

            System.out.println("desea continuar? ingrese 0 para no, cualquier otro para si.: ");
            continuar = input.nextInt();


        }
        // Cerrar scanner
        input.close();
    }
}
