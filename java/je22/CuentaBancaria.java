package  je22;


public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;

    private static int totalCuentas = 0;

    public CuentaBancaria(String titular, double saldoInicial, String numeroCuenta, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        totalCuentas++;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public void mostrarInformacion() {
        System.out.println(" Titular: " + titular);
        System.out.println(" Número de cuenta: " + numeroCuenta);
        System.out.println(" Tipo de cuenta: " + tipoCuenta);
        System.out.println(" Saldo actual: $" + String.format("%.2f", saldo));
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println(" Depósito de $" + String.format("%.2f", cantidad));
        } else {
            System.out.println(" La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println(" Retiro de $" + String.format("%.2f", cantidad));
            } else {
                System.out.println(" Fondos insuficientes para retirar $" + String.format("%.2f", cantidad));
            }
        } else {
            System.out.println(" La cantidad a retirar debe ser mayor que cero.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
}