package je27;


public class CuentaBancaria {

    protected String titular;
    protected double saldo;
    protected String numeroCuenta;
    protected TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double saldo, String numeroCuenta, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
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
        System.out.println(" Titular: " + titular);
        System.out.println(" Cuenta: " + numeroCuenta);
        System.out.println(" Tipo: " + tipoCuenta);
        System.out.println(" Saldo: $" + saldo);
    }
}