package je27;


public class CuentaAhorro extends CuentaBancaria {

    private double tasaInteres = 0.03; // 3% anual

    public CuentaAhorro(String titular, double saldo, String numeroCuenta) {
        super(titular, saldo, numeroCuenta, TipoCuenta.AHORRO);
    }

    public void aplicarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.println(" Interés aplicado: $" + String.format("%.2f", interes));
    }
}