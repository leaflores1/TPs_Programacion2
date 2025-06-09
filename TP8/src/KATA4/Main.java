package KATA4;

import KATA1.Producto;
import KATA2.Carrito;
import KATA3.Pedido;
import KATA3.ComparadorPedidosPorFecha;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // KATA 1: Producto
        Producto<Integer> prod1 = new Producto<>(101, "Camiseta", 1500);
        Producto<Integer> prod2 = new Producto<>(102, "Pantalón", 2500);
        System.out.println(prod1);
        System.out.println(prod2);

        // KATA 2: Carrito
        Carrito<Producto<Integer>> carrito = new Carrito<>();
        carrito.agregarProducto(prod1);
        carrito.agregarProducto(prod2);
        carrito.mostrarProductos();
        System.out.println("Total: " + carrito.obtenerTotal());

        // KATA 3: Pedido + Comparador
        Pedido pedido1 = new Pedido(LocalDate.of(2024, 6, 1));
        Pedido pedido2 = new Pedido(LocalDate.of(2024, 4, 15));
        Pedido pedido3 = new Pedido(LocalDate.of(2024, 5, 10));

        List<Pedido> pedidos = Arrays.asList(pedido1, pedido2, pedido3);
        Collections.sort(pedidos, new ComparadorPedidosPorFecha());
        System.out.println("Pedidos ordenados por fecha:");
        pedidos.forEach(System.out::println);

        // KATA 4: Buscador
        Buscador<Producto<Integer>, Integer> buscador = new Buscador<>();
        Producto<Integer> encontrado = buscador.buscar(List.of(prod1, prod2), 102);
        System.out.println("Producto encontrado por ID: " + encontrado);

    }
}
