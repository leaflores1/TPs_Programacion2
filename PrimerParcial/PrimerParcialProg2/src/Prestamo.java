import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.ZoneId;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private List<LineaPrestamo> lineas;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = new ArrayList<>();
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamo linea = new LineaPrestamo();
        linea.setEjemplar(ejemplar);
        Date fechaEstimada = Date.from(LocalDate.now().plusDays(14).atStartOfDay(ZoneId.systemDefault()).toInstant());
        linea.setFechaDevolucionEstimada(fechaEstimada);
        lineas.add(linea);
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    @Override
    public String toString() {
        return "\n   Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", lineas=" + lineas +
                '}';
    }
}
