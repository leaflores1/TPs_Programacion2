import java.time.LocalDate;

public class Autor {
    private String nombreCompleto;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    public Autor(String nombreCompleto, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
