package je8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE8 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Laura Méndez", 5000.0, "1122334455", TipoCuenta.AHORRO);
        CuentaBancaria cuenta2 = new CuentaBancaria("Jorge Torres", 8000.0, "5566778899", TipoCuenta.NOMINA);

        cuenta1.mostrarInformacion();
        System.out.println("----");
        cuenta2.mostrarInformacion();
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}