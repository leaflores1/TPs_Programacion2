import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//KATA 1.1
System.out.println("PRIMER USUARIO QUE CONSULTA A SOPORTE");
        System.out.println("ingrese su nombre:");
            String nombre = input.next();
        System.out.println("ingrese su email:");
            String email = input.next();

        Usuario usuario1 = new Usuario( nombre, email);

        TicketSoporte ticket1 = new TicketSoporte("descripcion del ticket","10/02/1999", usuario1);
        System.out.println("MOSTRANDO PRIMER DETALLE");
        ticket1.mostrarDetalle();

System.out.println("CERRANDO ESTADO DE LA CONSULTA...");
        ticket1.cerrarTicket();

        System.out.println(ticket1.getEstado());

//KATA 1.2
System.out.println("GENERANDO TICKET SIN USUARIO");
    TicketSoporte ticket2 = new TicketSoporte("descripcion del ticket","10/02/1999");
        ticket2.mostrarDetalle();

System.out.println("ELIJA A QUE TECNICO DESEA CONSULTAR: (1)frontend (2)backend (3)base de datos (4)otro");
        int tecnicoElegido = input.nextInt();
        ticket1.asignarTecnico(tecnicoElegido);
System.out.println("DETALLE DEL TICKET CON USUARIO Y TECNICO ASIGNADO");
        ticket1.mostrarDetalle();
    }
}