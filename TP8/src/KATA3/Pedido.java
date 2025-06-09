package KATA3;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;

    public Pedido(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Pedido{" + "fecha=" + fecha + '}';
    }
}
