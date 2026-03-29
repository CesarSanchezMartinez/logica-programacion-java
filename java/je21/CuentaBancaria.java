package je21;

/**
 *
 * @author usuario
 */
public class CuentaBancaria {

    // Atributos de la cuenta bancaria
    private String titular;
    private double saldo;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta; // Utiliza el enum TipoCuenta

    /**
     * Constructor de la clase CuentaBancaria.
     * @param titular El nombre del titular de la cuenta.
     * @param saldoInicial El saldo inicial de la cuenta.
     * @param numeroCuenta El número de cuenta.
     * @param tipoCuenta El tipo de cuenta (AHORRO, NOMINA, EMPRESARIAL).
     */
    public CuentaBancaria(String titular, double saldoInicial, String numeroCuenta, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * Muestra la información actual de la cuenta bancaria.
     */
    public void mostrarInformacion() {
        System.out.println(" Titular: " + titular);
        System.out.println(" Número de cuenta: " + numeroCuenta);
        System.out.println(" Tipo de cuenta: " + tipoCuenta); // Muestra el tipo de cuenta
        System.out.println(" Saldo actual: $" + String.format("%.2f", saldo)); // Formatea el saldo a dos decimales
    }

    /**
     * Realiza un depósito en la cuenta.
     * @param cantidad La cantidad a depositar.
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) { // Solo se permite depositar cantidades positivas
            saldo += cantidad;
        }
    }

    /**
     * Realiza un retiro de la cuenta.
     * @param cantidad La cantidad a retirar.
     */
    public void retirar(double cantidad) {
        // Se verifica que la cantidad sea positiva y que haya saldo suficiente
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            // Mensaje si no hay fondos suficientes
            System.out.println(" Fondos insuficientes para retirar $" + String.format("%.2f", cantidad));
        }
    }
}