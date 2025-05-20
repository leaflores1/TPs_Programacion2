package expeciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("⚠ Archivo no encontrado.");
        }
    }
}
