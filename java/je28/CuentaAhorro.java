package je28;


public class CuentaAhorro extends CuentaBancaria { // cite: 2

    private double tasaInteres; // cite: 2

    public CuentaAhorro(String titular, double saldo, String numeroCuenta, double tasaInteres) { // cite: 2
        super(titular, saldo, numeroCuenta, TipoCuenta.AHORRO); // cite: 2
        this.tasaInteres = tasaInteres; // cite: 2
    }

    public void aplicarInteres() { // cite: 2
        double interes = saldo * tasaInteres; // cite: 2
        saldo += interes; // cite: 2
        System.out.println(" Interés ganado: $" + interes); // cite: 2
    }
}