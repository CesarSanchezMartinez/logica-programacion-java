package je32;



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

    public void depositar(double monto) {
        saldo += monto;
    }

    // This method is now abstract, so subclasses MUST implement it.
    public abstract void mostrarInformacion();
}