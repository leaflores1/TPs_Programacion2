package KATA1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable{
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal(){
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // usa el método de Producto
        }
        return total;
    }


}
