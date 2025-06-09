package KATA2;

import KATA1.Producto;
import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
    private final List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void eliminarProducto(T producto) {
        productos.remove(producto);
    }

    public double obtenerTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void mostrarProductos() {
        productos.forEach(System.out::println);
    }
}
