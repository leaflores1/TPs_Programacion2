public class Editorial {
    private String nombre;
    private String sitioWeb;
    private Direccion direccion;

    public Editorial(String nombre, String sitioWeb, Direccion direccion) {
        this.nombre = nombre;
        this.sitioWeb = sitioWeb;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
