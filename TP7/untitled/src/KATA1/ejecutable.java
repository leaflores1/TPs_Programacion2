package KATA1;

public class ejecutable {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Leche",1000.00);
        Producto producto2 = new Producto("Carne",2000.00);

       Pedido pedido1 = new Pedido();

       pedido1.agregarProducto(producto1);
       pedido1.agregarProducto(producto2);
       /*El solo hecho de necesitar usar métodos que NO están definidos
       en la interfaz (como agregarProducto()),
        te impide usar polimorfismo puro a través de la interfaz.*/

        System.out.println("Total a pagar: $" + pedido1.calcularTotal());

    }
}
