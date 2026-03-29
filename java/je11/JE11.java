package je11; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE11 { //
    public static void main(String[] args) { //
        // Uso de 'var' para inferencia de tipo: el compilador infiere que 'cuenta' es de tipo CuentaBancaria
        var cuenta = new CuentaBancaria("Iván Lara", 7000.0, "9988776655", TipoCuenta.AHORRO); //

        cuenta.depositar(2000); //
        cuenta.mostrarInformacion(); //

        // Uso de 'var' para inferir el tipo de la variable 'resultado' (boolean)
        var resultado = cuenta.tieneSaldoMayorQue(5000); //
        System.out.println("¿Tiene más de $5000? " + resultado); //
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}
