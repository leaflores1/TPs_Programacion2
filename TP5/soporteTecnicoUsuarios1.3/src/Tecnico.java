public class Tecnico {
    private static int contadorTecnicos = 0;
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico(String especialidad) {
        this.id = ++contadorTecnicos;
        this.especialidad = especialidad;
        asignarTecnico(); // Asigna el nombre automáticamente
    }

    public void asignarTecnico() {
        if ("frontend".equalsIgnoreCase(especialidad)) {
            this.nombre = "Julio";
        } else if ("backend".equalsIgnoreCase(especialidad)) {
            this.nombre = "Hector";
        } else if ("database".equalsIgnoreCase(especialidad)) {
            this.nombre = "Cesar";
        } else {
            this.nombre = "Ricardo";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Técnico #" + id + ": " + nombre + " (" + especialidad + ")";
    }
}
