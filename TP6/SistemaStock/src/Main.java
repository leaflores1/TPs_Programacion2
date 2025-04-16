import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Inventario inventario = new Inventario(); // Crear una instancia de Inventario

      Producto p1 = new Producto("1","pan",100.00,5,CategoriaProducto.ALIMENTOS);
      Producto p2 = new Producto("2","cable",500.00,1,CategoriaProducto.ELECTRONICA);
      Producto p3 = new Producto("3","remera",2000.00,2,CategoriaProducto.ROPA);
      Producto p4 = new Producto("4","pantalon",1100.00,2,CategoriaProducto.ROPA);
        Producto p5 = new Producto("5","leche",700.00,1,CategoriaProducto.ALIMENTOS);

        // Agregar productos al inventario a través de su instancia
      inventario.agregarProducto(p1);
      inventario.agregarProducto(p2);
      inventario.agregarProducto(p3);
      inventario.agregarProducto(p4);
      inventario.agregarProducto(p5);

      inventario.listarProductos();

      System.out.println("");

      System.out.println("Buscando producto por id...");
      System.out.println(inventario.buscarProductoPorId("1"));

      System.out.println("");

      inventario.eliminarProducto("2");
      System.out.println("Eliminando producto...");
      inventario.listarProductos();

      System.out.println("");
      inventario.actualizarStock("3", 10);
      System.out.println("Actualizando stock...");
      inventario.listarProductos();


      System.out.println("");

      System.out.println("Filtrando por categoria...");
     inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
      System.out.println("");

      System.out.println("Obteniendo total de stock...");
      System.out.println(inventario.obtenerTotalStock());

      System.out.println("El producto con mayor stock es: ");
      System.out.println(inventario.obtenerProductoConMayorStock());
        System.out.println("");

      System.out.println("Productos entre el rango de 500 y 1000...");
      inventario.filtrarProductosPorPrecio(1000.00,3000.00);
      System.out.println("");

      System.out.println("Categorias disponibles con descripcion...");
      inventario.mostrarCategoriasDisponibles();
    }
}