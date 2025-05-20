package KATA2;

public class Paypal implements PagoConDescuento {
    private String email;
    private double descuento = 0.0;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuento / 100);
        System.out.println("Pagando $" + montoFinal + " con cuenta PayPal: " + email + " (descuento: " + descuento + "%)");
    }
}