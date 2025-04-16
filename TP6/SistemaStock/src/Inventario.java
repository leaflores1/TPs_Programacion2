import java.util.ArrayList;


public class Inventario {
    ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    public int cantProductos() {
    return productos.size();
    }

    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while(i < cantProductos() && productoEncontrado == null){
            Producto producto = productos.get(i);
            if(producto.getId().equalsIgnoreCase(id)){
                productoEncontrado = producto;
            }
            i++;
        }
        return productoEncontrado;
    }

    public void eliminarProducto(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while(i < cantProductos() && productoEncontrado == null){
            Producto producto = productos.get(i);
            if(producto.getId().equalsIgnoreCase(id)){
               productos.remove(producto);
               productoEncontrado = producto;
            }
            i++;
        }
    }

    public void actualizarStock(String id, int nuevaCantidad){
        Producto productoEncontrado = null;
        int i = 0;
        while(i < cantProductos() && productoEncontrado == null){
            Producto producto = productos.get(i);
            if(producto.getId().equalsIgnoreCase(id)){
                producto.setCantidad(nuevaCantidad);

                productoEncontrado = producto;
            }
            i++;
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto p : productos) {
            if(p.categoria == categoria){
                System.out.println(p);
            }
        }

    }
   public int obtenerTotalStock(){
        int cantidadAcumulada = 0;
for (Producto p : productos) {
    cantidadAcumulada = cantidadAcumulada + p.getCantidad();
}
        return cantidadAcumulada;
    }
    public Producto obtenerProductoConMayorStock(){
        Producto productoMax = productos.get(0);
        for (Producto p : productos) {
            if(p.getCantidad() > productoMax.getCantidad()){
                productoMax = p;
            }
        }
        return productoMax;
    }

    public void filtrarProductosPorPrecio(double min, double max){
        for (Producto p : productos) {
            if(p.getPrecio()>=min && p.getPrecio()<=max){
                System.out.println(p);
            }
        }
    }
    public void mostrarCategoriasDisponibles(){
        System.out.println(CategoriaProducto.ROPA.getDescripcion());
        System.out.println(CategoriaProducto.ALIMENTOS.getDescripcion());
        System.out.println(CategoriaProducto.ELECTRONICA.getDescripcion());
        System.out.println(CategoriaProducto.HOGAR.getDescripcion());
    }
    /*MEJORA
    * public void mostrarCategoriasDisponibles(){
    for (CategoriaProducto cat : CategoriaProducto.values()) {
        System.out.println(cat.getDescripcion());
    }
}
*/
}


