import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "\npublicaciones=" + publicaciones +
                ",\n usuarios=" + usuarios +
                '}';
    }
}

