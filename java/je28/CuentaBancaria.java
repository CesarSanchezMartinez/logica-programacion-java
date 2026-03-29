package je28;


public class CuentaBancaria { // cite: 3

    protected String titular; // cite: 3
    protected double saldo; // cite: 3
    protected String numeroCuenta; // cite: 3
    protected TipoCuenta tipoCuenta; // cite: 3

    public CuentaBancaria(String titular, double saldo, String numeroCuenta, TipoCuenta tipoCuenta) { // cite: 3
        this.titular = titular; // cite: 3
        this.saldo = saldo; // cite: 3
        this.numeroCuenta = numeroCuenta; // cite: 3
        this.tipoCuenta = tipoCuenta; // cite: 3
    }

    public void mostrarInformacion() { // cite: 3
        System.out.println(" Titular: " + titular + " | " + numeroCuenta + " | $" + saldo + " | Tipo: " + tipoCuenta); // cite: 3
    }
}