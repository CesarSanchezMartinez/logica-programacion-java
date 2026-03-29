package je13; //

/*
 * La clase CuentaBancaria con todas las funcionalidades desarrolladas hasta la Práctica 13.
 */

/**
 *
 * @author usuario
 */
public class CuentaBancaria {
    private String titular; //
    private double saldo; //
    private String numeroCuenta; //
    private TipoCuenta tipoCuenta; //

    // Constante: límite máximo de retiro diario (de Práctica 7)
    public static final double LIMITE_RETIRO_DIARIO = 10000.0;

    // Constructor completo (de Práctica 10)
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

    // Método depositar (de Práctica 1-3, modificado en Práctica 12 para mensajes)
    public void depositar(double cantidad) { //
        if (cantidad > 0) { //
            saldo += cantidad; //
            System.out.println("\u001B[32mDepósito exitoso. Nuevo saldo: $" + saldo + "\u001B[0m"); //
        } else {
            System.out.println("\u001B[31m✖ La cantidad debe ser mayor a cero.\u001B[0m"); //
        }
    }

    // Sobrecarga del método depositar con un mensaje (de Práctica 9)
    public void depositar(double cantidad, String mensaje) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println(mensaje + " | Monto: $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método retirar (de Práctica 4 y 7, modificado en Práctica 12 para mensajes)
    public void retirar(double cantidad) { //
        if (cantidad <= 0) { //
            System.out.println("\u001B[31m✖ La cantidad debe ser mayor a cero.\u001B[0m"); //
        } else if (cantidad > LIMITE_RETIRO_DIARIO) {
            System.out.println("Error: No se puede retirar más de $" + LIMITE_RETIRO_DIARIO + " en un día.");
        } else if (saldo >= cantidad) { //
            saldo -= cantidad; //
            System.out.println("\u001B[32mRetiro exitoso. Nuevo saldo: $" + saldo + "\u001B[0m"); //
        } else { //
            System.out.println("\u001B[31m✖ Fondos Insuficientes.\u001B[0m"); //
        }
    }

    // Método transferir (de Práctica 5)
    public void transferir(double cantidad, CuentaBancaria destino) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.retirar(cantidad);
            destino.depositar(cantidad);
            System.out.println("Se transfirieron $" + cantidad + " a " + destino.titular);
        } else {
            System.out.println("No se puede transferir esa cantidad.");
        }
    }

    // Método mostrarInformacion (de Práctica 1-3 y 8, modificado en Práctica 12)
    public void mostrarInformacion() { //
        System.out.println("Titular: " + titular); //
        System.out.println("Número de cuenta: " + numeroCuenta); //
        System.out.println("Tipo de cuenta: " + tipoCuenta); //
        System.out.println("Saldo actual: $" + saldo); //
    }

    // Sobrecarga del método mostrarInformacion (de Práctica 9)
    public void mostrarInformacion(boolean mostrarNumeroCuenta) {
        System.out.println("\n--- Información de la Cuenta ---");
        System.out.println("Titular: " + this.titular);
        System.out.println("Tipo de cuenta: " + this.tipoCuenta);
        System.out.println("Saldo: $" + this.saldo);
        if (mostrarNumeroCuenta) {
            System.out.println("Número de cuenta: " + this.numeroCuenta);
        }
    }

    // Método que devuelve el saldo actual (de Práctica 4, renombrado a getSaldo en Práctica 13)
    public double getSaldo() { //
        return saldo; //
    }

    // Método que devuelve si la cuenta está en números rojos (de Práctica 4)
    public boolean estaEnRojo() {
        return this.saldo < 0;
    }

    // Nuevo método para verificar si el saldo es mayor que un monto dado (de Práctica 11)
    public boolean tieneSaldoMayorQue(double monto) {
        return this.saldo > monto;
    }
}