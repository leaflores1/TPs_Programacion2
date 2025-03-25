public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

   public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
    public int cumplirAnios(int ed){
        edad += 1;

        return edad;
    }

}
