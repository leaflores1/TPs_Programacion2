package KATA2;

public class ejecutable {
    public static void main(String[] args) {

        // Usamos la interfaz como tipo: POLIMORFISMO PURO
        PagoConDescuento pago1 = new TarjetaCredito("1111-2222-3333-4444");
        pago1.aplicarDescuento(10); // Aplica 10%
        pago1.procesarPago(1000);   // Paga 900

        System.out.println("------------------------------");

        PagoConDescuento pago2 = new Paypal("leandro@mail.com");
        pago2.aplicarDescuento(5);  // Aplica 5%
        pago2.procesarPago(2000);   // Paga 1900
    }
}
