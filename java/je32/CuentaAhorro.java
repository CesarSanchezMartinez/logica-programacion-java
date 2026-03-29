package je32;

// Note: The variable name for interest rate is 'tasa' here, not 'tasaInteres' as in JE29/JE30 examples.
public class CuentaAhorro extends CuentaBancaria {
    private double tasa; // Using 'tasa' as per the image

    public CuentaAhorro(String titular, double saldo, String numeroCuenta, double tasa) {
        super(titular, saldo, numeroCuenta, TipoCuenta.AHORRO);
        this.tasa = tasa;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("✔ Titular: " + titular);
        System.out.println("✔ Saldo: $" + saldo);
        System.out.println("✔ Tasa de interés: " + (tasa * 100) + "%");
    }
}