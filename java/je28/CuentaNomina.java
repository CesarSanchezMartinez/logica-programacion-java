package je28;

public class CuentaNomina extends CuentaBancaria { // cite: 4

    public CuentaNomina(String titular, String numeroCuenta) { // cite: 4
        super(titular, 1000.0, numeroCuenta, TipoCuenta.NOMINA); // Saldo inicial fijo y tipo definido // cite: 4
    }

    public void cobrarNomina(double sueldo) { // cite: 4
        saldo += sueldo; // cite: 4
        System.out.println(" Se depositó la nómina: $" + sueldo); // cite: 4
    }
}