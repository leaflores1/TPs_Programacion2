public class TicketSoporte {
    private static int contadorTickets = 1000;
    private int id;
    private String descripcion;
    private String fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;
    private String estado;

    public TicketSoporte(String descripcion, String fechaCreacion, Usuario usuario, Tecnico tecnico) {
        this.id = ++contadorTickets;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.tecnico = tecnico;
        this.estado = "abierto";
    }

    @Override
    public String toString() {
        return "Ticket #" + id + " (" + estado + ") - " + descripcion + " - " + fechaCreacion +
                "\nUsuario: " + usuario.getNombre() +
                "\nTécnico asignado: " + tecnico.getNombre();
    }
}
