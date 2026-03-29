package je29;


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

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo: " + tipoCuenta);
    }
}