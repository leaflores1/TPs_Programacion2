import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void mostrarHistorialPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println("Fecha préstamo: " + p.getFechaPrestamo());
            for (LineaPrestamo lp : p.getLineas()) {
                System.out.println("- Ejemplar: " + lp.getEjemplar().getCodigo());
                System.out.println("  Fecha devolución: " + lp.getFechaDevolucionEstimada());
            }
        }
    }

    @Override
    public String toString() {
        return "\n  Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ",\n  prestamos=" + prestamos +
                '}';
    }
}

