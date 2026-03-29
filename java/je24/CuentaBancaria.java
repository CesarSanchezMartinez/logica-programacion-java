package je24;


public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;

    private static int totalCuentas = 0;

    public CuentaBancaria(String titular, double saldo, String numeroCuenta, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        totalCuentas++;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println(" Saldo insuficiente.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo: " + tipoCuenta);
        System.out.println("Saldo: $" + String.format("%.2f", saldo));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo >= 0) {
            this.saldo = nuevoSaldo;
        }
    }
}