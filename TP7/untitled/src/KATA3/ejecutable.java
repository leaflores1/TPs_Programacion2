package KATA3;

public class ejecutable {
    public static void main(String[] args) {
        Notificable cliente = new Cliente("Leandro", "leandro@mail.com");

        cliente.notificar("estamos ejecutando su compra");
        System.out.println("------");

        // Creamos un pedido asociado a ese cliente
        Pedido pedido = new Pedido(cliente);

        pedido.cambiarEstado("Pendiente");
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");
    }
}
