package je9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE9 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Andrés Salas", 3000.0, "7788990011", TipoCuenta.EMPRESARIAL); //

        // Usar método depositar sin mensaje
        cuenta.depositar(500); //
        System.out.println("Saldo actual después de depósito sin mensaje: $" + cuenta.obtenerSaldo());

        // Usar método depositar con mensaje
        cuenta.depositar(1000, "Bonificación mensual"); //
        System.out.println("Saldo actual después de depósito con mensaje: $" + cuenta.obtenerSaldo());


        // Mostrar información con y sin número de cuenta
        System.out.println("\n--- Información Básica ---"); //
        cuenta.mostrarInformacion(); //

        System.out.println("\n--- Información Completa ---"); //
        cuenta.mostrarInformacion(true); //
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}
