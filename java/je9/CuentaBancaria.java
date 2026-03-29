package je9; //

/*
 * La clase CuentaBancaria con todas las funcionalidades desarrolladas hasta la Práctica 9,
 * incluyendo sobrecarga de métodos.
 */

/**
 *
 * @author usuario
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;

    // Constante: límite máximo de retiro diario (de Práctica 7)
    public static final double LIMITE_RETIRO_DIARIO = 10000.0;

    // Constructor completo (de Práctica 8)
    public CuentaBancaria(String titular, double saldoInicial, String numeroCuenta, TipoCuenta tipoCuenta) { //
        this.titular = titular; //
        this.saldo = saldoInicial; //
        this.numeroCuenta = numeroCuenta; //
        this.tipoCuenta = tipoCuenta; //
    }

    // Constructor con solo titular y número de cuenta (saldo por defecto) (de Práctica 6)
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = TipoCuenta.AHORRO; // Asumiendo un tipo por defecto
    }

    // Constructor vacío (valores por defecto) (de Práctica 6)
    public CuentaBancaria() {
        this.titular = "Desconocido";
        this.numeroCuenta = "000000000";
        this.saldo = 0.0;
        this.tipoCuenta = TipoCuenta.AHORRO; // Asumiendo un tipo por defecto
    }

    // Método depositar original (de Práctica 1-3)
    public void depositar(double cantidad) { //
        if (cantidad > 0) { //
            saldo += cantidad; //
            System.out.println("Depósito de $" + cantidad + " realizado."); //
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Sobrecarga del método depositar con un mensaje (nuevo en Práctica 9)
    public void depositar(double cantidad, String mensaje) { //
        if (cantidad > 0) {
            saldo += cantidad; //
            System.out.println("Depósito con mensaje: " + mensaje + " | Monto: $" + cantidad); //
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método retirar (de Práctica 4 y 7)
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        } else if (cantidad > LIMITE_RETIRO_DIARIO) {
            System.out.println("Error: No se puede retirar más de $" + LIMITE_RETIRO_DIARIO + " en un día.");
        } else if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    // Método transferir (de Práctica 5)
    public void transferir(double cantidad, CuentaBancaria destino) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.retirar(cantidad); // Reutiliza el método retirar
            destino.depositar(cantidad); // Reutiliza el método depositar
            System.out.println("Se transfirieron $" + cantidad + " a " + destino.titular);
        } else {
            System.out.println("No se puede transferir esa cantidad.");
        }
    }

    // Método mostrarInformacion original (de Práctica 1-3 y 8)
    public void mostrarInformacion() { //
        System.out.println("Titular: " + titular); //
        System.out.println("Tipo de cuenta: " + tipoCuenta); //
        System.out.println("Saldo: $" + saldo); //
        // No muestra el número de cuenta por defecto en esta versión base
    }

    // Sobrecarga del método mostrarInformacion para incluir/excluir número de cuenta (nuevo en Práctica 9)
    public void mostrarInformacion(boolean mostrarNumeroCuenta) { //
        mostrarInformacion(); // Llama al método base para mostrar info común
        if (mostrarNumeroCuenta) { //
            System.out.println("Número de cuenta: " + numeroCuenta); //
        }
    }

    // Método que devuelve el saldo actual (de Práctica 4)
    public double obtenerSaldo() {
        return saldo;
    }

    // Método que devuelve si la cuenta está en números rojos (de Práctica 4)
    public boolean estaEnRojo() {
        return saldo < 0;
    }
}