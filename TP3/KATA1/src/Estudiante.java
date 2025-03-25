public class Estudiante {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    //constructor?
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    //METODOS
   public void mostrarInfo(){
       System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);
    }
    public void subirCalificacion(double calif) {
      calificacion += calif;
    }
    public void bajarCalificacion(double calif) {
        calificacion -= calif;
    }
    public double getCalificacion() {
        return calificacion;
    }
}
