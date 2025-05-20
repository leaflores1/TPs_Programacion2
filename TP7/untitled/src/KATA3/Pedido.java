package KATA3;

public class Pedido{
    private Notificable cliente;
    private String estado;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "Sin estado";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("su pedido cambió a estado: " + nuevoEstado);
    }
}
