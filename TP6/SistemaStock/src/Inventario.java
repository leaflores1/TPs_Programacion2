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

}
