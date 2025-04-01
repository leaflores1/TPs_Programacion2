import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Creando empleado...");

        Empleado empleado1 = new Empleado(100, "Leandro", "Dev Junior", 1000);
        Empleado empleado2 = new Empleado("Nicolas", "Dev Senior");

        System.out.println("Los datos de los empleados son:");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println("Ingrese el porcentaje de aumento del empleado (0 al 100)%: ");
        double porcentaje = input.nextDouble();

        empleado1.actualizarSalario(porcentaje);
        System.out.println("El salario recibiendo un porcentaje de aumento es: " + empleado1.getSalario());

        System.out.println("Ingrese una cantidad fija a aumentar: ");
        int cantidad = input.nextInt();

        empleado1.actualizarSalario(cantidad);
        System.out.println("El salario recibiendo una cantidad fija es: " + empleado1.getSalario());

        int totalEmpleados = Empleado.mostrarTotalEmpleados();
        System.out.println("El total de empleados es: " + totalEmpleados);
    }

}