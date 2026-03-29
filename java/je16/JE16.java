package je16; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE16 { //
    public static void main(String[] args) { //
        // Crear una instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 5000.0, "1234567890", TipoCuenta.AHORRO); //

        // Crear una instancia de Cliente
        Cliente cliente = new Cliente("Juan Perez"); //

        // Mostrar información de la cuenta y sus últimos dígitos
        System.out.println("Información de la Cuenta:"); //
        cuenta.mostrarInformacion(); //
        System.out.println("Últimos 4 dígitos de la cuenta: " + cuenta.obtenerUltimosDigitos(4)); //
        System.out.println("--------------------"); //

        // Mostrar información del cliente y manipular su nombre
        System.out.println("Información del Cliente:"); //
        System.out.println("Nombre: " + cliente.getNombre()); //
        System.out.println("Longitud del nombre: " + cliente.getLongitudNombre()); //
        System.out.println("El nombre empieza con 'Juan': " + cliente.empiezaCon("Juan")); //
        System.out.println("El nombre contiene 'Pere': " + cliente.contiene("Pere")); //
        System.out.println("Nombre en mayúsculas: " + cliente.getNombreMayusculas()); //
        System.out.println("--------------------"); //
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}