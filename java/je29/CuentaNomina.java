package je29;

public class CuentaNomina extends CuentaBancaria {

    public CuentaNomina(String titular, String numeroCuenta) {
        super(titular, 1000.0, numeroCuenta, TipoCuenta.NOMINA);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cuenta de Nómina protegida");
        System.out.println("Titular: " + titular);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}