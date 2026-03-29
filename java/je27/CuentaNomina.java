package je27;


public class CuentaNomina extends CuentaBancaria {

    public CuentaNomina(String titular, double saldo, String numeroCuenta) {
        super(titular, saldo, numeroCuenta, TipoCuenta.NOMINA);
    }

    public void cobrarNomina(double sueldo) {
        depositar(sueldo);
        System.out.println(" Nómina depositada: $" + sueldo);
    }
}