public class Usuario {
    private static int contadorUsuarios = 0;
    private int id;
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.id = ++contadorUsuarios;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario #" + id + ": " + nombre + " (" + email + ")";
    }
}
