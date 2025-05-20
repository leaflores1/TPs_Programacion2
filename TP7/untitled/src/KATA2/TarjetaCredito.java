package KATA2;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private double descuento = 0.0;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void aplicarDescuento(double porcentaje){
       this.descuento = porcentaje;
    }
    @Override
    public void procesarPago(double monto){
       double montoFinal = monto - (monto * descuento / 100);
        System.out.println("Pagando $" + montoFinal + " con tarjeta " + numeroTarjeta + " (descuento: " + descuento + "%)");
    }



}
