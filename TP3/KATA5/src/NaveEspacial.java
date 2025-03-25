public class NaveEspacial {

    private String nombre;
    private int combustible;

public NaveEspacial(String nombre, int combustible) {
    this.nombre = nombre;
    this.combustible = combustible;
}

    //Reduce 10 unidades de combustible al despegar. No puede despegar si hay menos de 10 unidades.
    public boolean despegar() {
        if (combustible < 10) {
            System.out.println("❌ No hay suficiente combustible para despegar.");
            System.out.println("combustible actual: " + combustible);
            return false;
        } else {
            combustible -= 10;
            System.out.println("🚀 La nave ha despegado.");
            System.out.println("combustible actual: " + combustible);
            return true;
        }
    }


    //: Consume 1 unidad de combustible por cada unidad de distancia.
    //No puede avanzar si no hay suficiente combustible.
   public boolean avanzar(int distancia){
    boolean sepudoavanzar=false;

            if (distancia > combustible) {
                System.out.println("Falta combustible para avanzar");
            } else {
                combustible -= distancia;
                System.out.println("Se avanzó " + distancia + " metros");
                System.out.println("combustible actual: " + combustible);
                sepudoavanzar = true;
            }

        return sepudoavanzar;
    }

    //: Aumenta la cantidad de combustible en la nave. No
    //puede superar el límite máximo de 100 unidades.
    public boolean recargarCombustible(int cantidad){
    boolean cargatanque=false;
         if(combustible + cantidad <= 100){
             combustible += cantidad;
             System.out.println("Se recargó "+cantidad+" de combustible.");
             cargatanque=true;
         }else{
             System.out.println("el combustible no puede superar el límite máximo de 100 unidades");
             System.out.println("combustible actual: " + combustible);
         }
         return cargatanque;
    }

    //Muestra el nombre de la nave y la cantidad de combustible actual.
   public void mostrarEstado(){
        System.out.println("Nombre: " + nombre + "\nCombustible: " + combustible);
    }


}
