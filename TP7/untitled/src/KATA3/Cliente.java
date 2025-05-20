package KATA3;

public class Cliente implements Notificable{
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override //sobreescribiendo metodo de la interfaz Notificable
    public void notificar(String mensaje) {
        System.out.println("[" + email + "] " + nombre + ", " + mensaje);
    }
}
