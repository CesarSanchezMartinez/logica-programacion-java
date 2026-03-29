package je34;



public class CuentaNomina extends CuentaBancaria implements Transaccionable {

    public CuentaNomina(String titular, double saldo, String numeroCuenta) {
        super(titular, saldo, numeroCuenta, TipoCuenta.NOMINA);
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
            // No explicit System.out.println for insufficient funds in this image.
        }
    }

    public void cobrarNomina(double sueldo) {
        saldo += sueldo;
        System.out.println("✔ Nómina recibida: $" + sueldo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("✔ Cuenta Nómina de " + titular + " | Saldo: $" + String.format("%.2f", saldo));
    }
}