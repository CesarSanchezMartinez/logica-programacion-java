package je34;


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

    public abstract void mostrarInformacion(); // Abstract method

    @Override
    public String toString() {
        // Example toString() as seen in some previous images.
        // It's not directly used by mostrarInformacion() in this JE.
        return tipoCuenta + " - " + numeroCuenta + " - $" + saldo;
    }
}