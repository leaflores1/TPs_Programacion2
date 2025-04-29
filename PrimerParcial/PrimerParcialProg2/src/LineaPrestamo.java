import java.util.Date;

public class LineaPrestamo {
    private Ejemplar ejemplar;
    private Date fechaDevolucionEstimada;

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    @Override
    public String toString() {
        return "\n  LineaPrestamo{" +
                "\nejemplar=" + ejemplar +
                ", fechaDevolucionEstimada=" + fechaDevolucionEstimada +
                '}';
    }
}

