package je15; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE15 { //
    public static void main(String[] args) { //
        // Crear un arreglo de cuentas bancarias inicializado directamente
        CuentaBancaria[] cuentas = { //
            new CuentaBancaria("Carlos Ruiz", 6000.0, "100100100", TipoCuenta.AHORRO), //
            new CuentaBancaria("Elena Torres", 2500.0, "200200200", TipoCuenta.NOMINA), //
            new CuentaBancaria("Fernando Díaz", 8000.0, "300300300", TipoCuenta.EMPRESARIAL) //
        }; //

        // Usar un bucle for-each para recorrer el arreglo y mostrar información
        System.out.println("--- Información de Cuentas ---"); //
        for (CuentaBancaria cuenta : cuentas) { //
            cuenta.mostrarInformacion(); //
            System.out.println("----------"); //
        }
                System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido

    }
}