public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    CategoriaProducto categoria;


    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.categoria=categoria;
    }

    public void mostrarInfo(){
        System.out.println("nombre: " + nombre + " precio: " + precio + " cantidad: " + cantidad);
    }

    public String getId() {
        return id;
    }

    public int setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}
