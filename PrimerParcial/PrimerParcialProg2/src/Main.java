import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Dirección de la editorial
        Direccion direccion = new Direccion("Calle Falsa", 123, "Springfield", "1234");

        // Editorial
        Editorial editorial = new Editorial("Ediciones UTN", "https://utn.edu.ar", direccion);

        // Autores
        Autor autor1 = new Autor("Carlos Gonzalez", "Argentina", LocalDate.of(2000, 3, 15));
        Autor autor2 = new Autor("Maria Perez", "Argentina", LocalDate.of(1980, 7, 22));
        //agrego los autores
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);

        // Género
        Genero genero = new Genero("Programación", "Libros sobre Parciales");

        //Instancio un Libro
        Libro libro = new Libro("978-3-16-148410-0", "Programando para el Parcial", 2024, genero, editorial, autores);

        // Ejemplares del libro
        Ejemplar ej1 = new Ejemplar("EJ001", EstadoEjemplar.DISPONIBLE, libro);
        Ejemplar ej2 = new Ejemplar("EJ002", EstadoEjemplar.PRESTADO, libro);
        Ejemplar ej3 = new Ejemplar("EJ003", EstadoEjemplar.DISPONIBLE, libro);

        libro.getEjemplares().add(ej1);
        libro.getEjemplares().add(ej2);
        libro.getEjemplares().add(ej3);

        //Instancio la Revista
        Revista revista = new Revista(5, 12, "Revista TIMES", 2023, genero);
        Ejemplar ejRev = new Ejemplar("REV001", EstadoEjemplar.DISPONIBLE, revista);
        revista.getEjemplares().add(ejRev);

        // Creo la biblioteca y registro las publicaciones
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.getPublicaciones().add(libro);
        biblioteca.getPublicaciones().add(revista);

        //Registro un Usuario
        Usuario usuario = new Usuario("Leandro", "Flores", "41660531");
        biblioteca.getUsuarios().add(usuario);

        // Préstamo del usuario
        Prestamo prestamo = new Prestamo(new Date(), null);
        prestamo.agregarLineaPrestamo(ej1);
        usuario.getPrestamos().add(prestamo);

        // Mostrar todo
        System.out.println("Publicaciones en la biblioteca:");
        System.out.println(biblioteca);

        //Mostrar ejemplares disponibles
        System.out.println("\nMostrar ejemplares disponibles");
        System.out.println(libro.getEjemplaresDisponibles());

        //Mostrar historial de prestamos
        System.out.println("\nHistorial de préstamos del usuario:");
        usuario.mostrarHistorialPrestamos();
    }
}
