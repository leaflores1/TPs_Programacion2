import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántas gallinas desea agregar?: ");
        int num = input.nextInt();

        Gallina[] gallinas = new Gallina[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nIngrese la edad y la cantidad de huevos puestos de la gallina " + (i + 1) + ":");
            int edad = input.nextInt();
            int huevosPuestos = input.nextInt();
            gallinas[i] = new Gallina(edad, huevosPuestos);
        }

        System.out.println("\n📋 Estado inicial de las gallinas:");
        for (Gallina gallina : gallinas) {
            gallina.mostrarEstado();
        }

        System.out.println("\n🥚 Incrementando la cantidad de huevos puestos...");
        for (Gallina gallina : gallinas) {
            gallina.ponerHuevo();
        }

        System.out.println("\n📋 Estado después de poner un huevo:");
        for (Gallina gallina : gallinas) {
            gallina.mostrarEstado();
        }

        System.out.println("\n🕒 Envejeciendo a las gallinas...");
        for (Gallina gallina : gallinas) {
            gallina.envejecer();
        }

        System.out.println("\n📋 Estado final de las gallinas:");
        for (Gallina gallina : gallinas) {
            gallina.mostrarEstado();
        }

        input.close();
    }
}
