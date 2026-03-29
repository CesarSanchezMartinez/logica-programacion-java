package je29;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldo, String numeroCuenta, double tasaInteres) {
        super(titular, saldo, numeroCuenta, TipoCuenta.AHORRO);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama primero a la versión padre
        System.out.println("Tasa de interés: " + (tasaInteres * 100) + "%");
    }
}