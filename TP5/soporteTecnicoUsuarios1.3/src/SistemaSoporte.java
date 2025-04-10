import java.util.ArrayList;

public class SistemaSoporte {
    private ArrayList<TicketSoporte> tickets = new ArrayList<>();

    public void agregarTicket(TicketSoporte ticket) {
        tickets.add(ticket);
    }

    public void mostrarTickets() {
        for (TicketSoporte t : tickets) {
            System.out.println(t);
        }
    }
}
