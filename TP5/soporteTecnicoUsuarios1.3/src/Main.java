import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemaSoporte sistema = new SistemaSoporte();

        boolean continuar = true;

        while (continuar) {
            System.out.println("=== CONSULTA A SOPORTE ===");

            System.out.print("Ingrese su nombre: ");
            String nombreUsuario = input.next();

            System.out.print("Ingrese su email: ");
            String email = input.next();

            Usuario usuario = new Usuario(nombreUsuario, email);

            System.out.println("Elija a qué técnico desea consultar: frontend / backend / database / otro");
            String especialidad = input.next();

            Tecnico tecnico = new Tecnico(especialidad);
            tecnico.asignarTecnico();

            System.out.print("Ingrese una descripción del problema: ");
            input.nextLine(); // Limpiar el buffer
            String descripcion = input.nextLine();

            System.out.print("Ingrese la fecha de creación (ej: 10/02/1999): ");
            String fecha = input.next();

            TicketSoporte ticket = new TicketSoporte(descripcion, fecha, usuario, tecnico);
            sistema.agregarTicket(ticket);

            System.out.println("\n--- Ticket generado correctamente ---");
            System.out.println(ticket);

            System.out.println("\n¿Desea realizar otra consulta? (1: sí / 0: no)");
            int opcion = input.nextInt();
            if (opcion == 0) {
                continuar = false;
                System.out.println("CONSULTA TERMINADA.");
            }
        }

        System.out.println("\n=== TODOS LOS TICKETS ===");
        sistema.mostrarTickets();

        input.close();
    }
}
