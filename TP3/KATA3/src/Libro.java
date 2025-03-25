import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crear objeto Libro
        int anoActual = 2024; // Suponiendo el año actual
        Libro libro1 = new Libro("No me puedes lastimar", "David Goggins", anoActual);

        // Mostrar información inicial
        libro1.mostrarInfo();

        // Modificar año de publicación
        System.out.println("\nIngrese un año para modificar la publicación:");
        int nuevoAno = input.nextInt();

        // Intentar modificar con el setter (ahora con validación)
        libro1.setAnoPublicacion(nuevoAno);

        // Mostrar la información después de la modificación
        libro1.mostrarInfo();

        input.close();
    }
}
