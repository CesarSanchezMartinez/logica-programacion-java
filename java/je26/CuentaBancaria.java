package je26;


public class CuentaBancaria {

    private String titular;
    private double saldo;
    private final String numeroCuenta;
    private final TipoCuenta tipo;

    private static int totalCuentas = 0;

    public CuentaBancaria(String titular, double saldo, String numeroCuenta, TipoCuenta tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
        totalCuentas++;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) saldo -= monto;
    }

    public void mostrarInformacion() {
        System.out.println(" Titular: " + titular);
        System.out.println(" Número de cuenta: " + numeroCuenta);
        System.out.println(" Tipo: " + tipo);
        System.out.println(" Saldo: $" + saldo);
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }
    }