package je33;


public class CuentaAhorro extends CuentaBancaria implements Transaccionable {
    private double tasa; // Variable name is 'tasa'

    public CuentaAhorro(String titular, double saldo, String cuenta, double tasa) {
        super(titular, saldo, cuenta, TipoCuenta.AHORRO); // Ensure TipoCuenta is imported/accessible
        this.tasa = tasa;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) { // Check for sufficient funds
            saldo -= monto;
        } else {
            System.out.println("✗ Fondos insuficientes.");
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("✔ Cuenta Ahorro: " + titular + " | Saldo: $" + String.format("%.2f", saldo));
    }
}