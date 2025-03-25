import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ed=10;

       Mascota mascota1 = new Mascota("Teo","perro",ed );

        mascota1.mostrarInfo();

        System.out.println("Aumentar la edad en 1 año.");
        mascota1.cumplirAnios(ed);

        mascota1.mostrarInfo();

        input.close();
    }
}
