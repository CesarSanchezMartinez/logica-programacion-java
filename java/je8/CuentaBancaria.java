package je8;

/*
 * La clase CuentaBancaria con todas las funcionalidades desarrolladas hasta la Práctica 8,
 * incluyendo el tipo de cuenta como enumeración.
 */

/**
 *
 * @author usuario
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta; // Atributo de tipo enumeración

    // Constructor completo actualizado para incluir TipoCuenta
    public CuentaBancaria(String titular, double saldoInicial, String numeroCuenta, TipoCuenta tipoCuenta) { //
        this.titular = titular; //
        this.saldo = saldoInicial; //
        this.numeroCuenta = numeroCuenta; //
        this.tipoCuenta = tipoCuenta; //
    }

    // Métodos (incluyendo los de prácticas anteriores y actualizados)

    public void depositar(double cantidad) {
        saldo += cantidad;
        // Otras impresiones o lógica aquí si se requiere
    }

    public void retirar(double cantidad) {
        // Lógica de retiro (se asume que incluye límites si viene de JE7)
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        } else if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarInformacion() { //
        System.out.println("Titular: " + titular); //
        System.out.println("Número de cuenta: " + numeroCuenta); //
        System.out.println("Tipo de cuenta: " + tipoCuenta); // Muestra el tipo de cuenta
        System.out.println("Saldo: $" + saldo); //
    }

    // Otros métodos como obtenerSaldo, estaEnRojo, transferir (asumiendo que existen)
}