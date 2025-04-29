import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    private String titulo;
    private int anio;
    private Genero genero;
    private List<Ejemplar> ejemplares;

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        List<Ejemplar> disponibles = new ArrayList<>();
        for (Ejemplar e : ejemplares) {
            if (e.estaDisponible()) {
                disponibles.add(e);
            }
        }
        return disponibles;
    }

    @Override
    public String toString() {
        return "\n  Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ",\n genero=" + genero +
                ",\n ejemplares=" + ejemplares +
                '}';
    }
}
