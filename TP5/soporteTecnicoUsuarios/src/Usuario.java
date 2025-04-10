public class Usuario {
    private String nombre;
    private int id;
    private static int contadorUsuarios = 0;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.id = ++contadorUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
