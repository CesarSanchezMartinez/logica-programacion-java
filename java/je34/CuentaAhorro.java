package je34;
 // Ensure TipoCuenta is in tipos package

public class CuentaAhorro extends CuentaBancaria implements Transaccionable {
    private double tasaInteres; // Variable name 'tasaInteres' here

    public CuentaAhorro(String titular, double saldo, String numeroCuenta, double tasaInteres) {
        super(titular, saldo, numeroCuenta, TipoCuenta.AHORRO); // Ensure correct super call for abstract CuentaBancaria
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            // Note: The previous image for CuentaAhorro in JE33 had "✗ Fondos insuficientes."
            // This image does not show an else block for insufficient funds.
            // I'll assume for simulation no message is printed on insufficient.
        }
    }

    public void aplicarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("✔ Cuenta Ahorro: " + titular + " | Saldo: $" + String.format("%.2f", saldo) + " | Interés: " + (tasaInteres * 100) + "%");
    }
}