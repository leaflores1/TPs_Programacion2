import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion {
    private String isbn;
    private Editorial editorial;
    private List<Autor> autores;

    public Libro(String isbn, String titulo, int anio, Genero genero, Editorial editorial, List<Autor> autores) {
        super(titulo, anio, genero);
        this.isbn = isbn;
        this.editorial = editorial;
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", editorial=" + editorial +
                ", autores=" + autores +
                '}';
    }
}
