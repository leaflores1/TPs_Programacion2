import java.util.UUID;

public class Gallina {

    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int edad, int huevosPuestos) {
        this.idGallina = UUID.randomUUID().toString();
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    // Métodos de comportamiento
    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    public void envejecer() {
        edad += 1;
    }

    // Getters
    public String getId() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    // Mostrar estado actual
    public void mostrarEstado() {
        System.out.println("🐔 Estado actual -> ID: " + idGallina + ", Edad: " + edad + " años, Huevos: " + huevosPuestos);
    }
}
