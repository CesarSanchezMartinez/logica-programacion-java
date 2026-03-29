package je33;


public abstract class CuentaBancaria {
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

    // The abstract method, must be implemented by subclasses
    public abstract void mostrarInformacion();
}