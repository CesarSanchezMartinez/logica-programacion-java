package je11; //

/*
 * La clase CuentaBancaria con todas las funcionalidades desarrolladas hasta la Práctica 11,
 * incluyendo inferencia de tipo con 'var'.
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

    // Constructor utilizando 'this' para diferenciar variables (de Práctica 10)
    public CuentaBancaria(String titular, double saldo, String numeroCuenta, TipoCuenta tipoCuenta) { //
        this.titular = titular; //
        this.saldo = saldo; //
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
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado.");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Sobrecarga del método depositar con un mensaje (de Práctica 9)
    public void depositar(double cantidad, String mensaje) { //
        if (cantidad > 0) {
            this.saldo += cantidad; //
            System.out.println(mensaje + " | Monto: $" + cantidad); //
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
        } else if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
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

    // Método mostrarInformacion original (de Práctica 1-3 y 8)
    public void mostrarInformacion() { //
        // Uso de 'var' para inferir el tipo de la variable 'info' (String)
        var info = "Titular: " + this.titular + "\n" + //
                   "Cuenta: " + this.numeroCuenta + "\n" + //
                   "Tipo: " + this.tipoCuenta + "\n" + //
                   "Saldo: $" + this.saldo; //
        System.out.println(info); //
    }

    // Sobrecarga del método mostrarInformacion (de Práctica 9)
    public void mostrarInformacion(boolean mostrarNumeroCuenta) {
        this.mostrarInformacion();
        if (mostrarNumeroCuenta) {
            System.out.println("Número de cuenta: " + this.numeroCuenta);
        }
    }

    // Método que devuelve el saldo actual (de Práctica 4)
    public double obtenerSaldo() {
        return this.saldo;
    }

    // Método que devuelve si la cuenta está en números rojos (de Práctica 4)
    public boolean estaEnRojo() {
        return this.saldo < 0;
    }

    // Nuevo método para verificar si el saldo es mayor que un monto dado (nuevo en Práctica 11)
    public boolean tieneSaldoMayorQue(double monto) { //
        // Uso de 'var' para inferir el tipo de la variable 'resultado' (boolean)
        var resultado = this.saldo > monto; //
        return resultado; //
    }
}