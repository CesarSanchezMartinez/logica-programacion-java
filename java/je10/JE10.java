package je10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE10 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Estela Robles", 2000.0, "101010101", TipoCuenta.NOMINA); //

        cuenta.mostrarInformacion(); //
        System.out.println("Realizando depósito..."); //
        cuenta.depositar(500); //
        cuenta.mostrarInformacion();
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}