package expeciones;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");

        try {
            String input = sc.nextLine();
            int numero = Integer.parseInt(input);
            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("⚠ Error: El valor ingresado no es un número válido.");
        }
    }
}
