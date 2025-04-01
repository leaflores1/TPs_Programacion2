public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // CONSTRUCTOR 1: Recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // CONSTRUCTOR 2: Recibe solo nombre y puesto, asignando un id y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = 200;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 3000;
        totalEmpleados++;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPuesto(){
        return puesto;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método estático para mostrar el total de empleados creados
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    @Override
    public String toString(){
        return "id: " + id + " nombre: " + nombre + " puesto: " + puesto + " salario: " + salario;
    }

    // Método que actualiza el salario aumentando un porcentaje
    public void actualizarSalario(double porcentaje){
        System.out.println("Actualizando el salario del empleado en un " + porcentaje + "%");
        double nuevoSalario = this.salario * (1 + porcentaje / 100.0);
        this.setSalario(nuevoSalario);
    }

    // Método que actualiza el salario sumando una cantidad fija
    public void actualizarSalario(int cantidad){
        System.out.println("Actualizando el salario del empleado sumando " + cantidad);
        this.setSalario(this.salario + cantidad);
    }

}
