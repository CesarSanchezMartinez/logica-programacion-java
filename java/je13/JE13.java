package je13; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE13 { //
    public static void main(String[] args) { //
        // Crear un arreglo de cuentas bancarias (tamaño fijo de 3)
        CuentaBancaria[] cuentas = new CuentaBancaria[3]; //

        // Instanciar las cuentas y guardarlas en el arreglo
        cuentas[0] = new CuentaBancaria("Ana López", 3000.0, "111111111", TipoCuenta.AHORRO); //
        cuentas[1] = new CuentaBancaria("Luis Díaz", 4500.0, "222222222", TipoCuenta.NOMINA); //
        cuentas[2] = new CuentaBancaria("María Pérez", 10000.0, "333333333", TipoCuenta.EMPRESARIAL); //

        // Mostrar la información de todas las cuentas usando un bucle for tradicional
        for (int i = 0; i < cuentas.length; i++) { //
            System.out.println("Cuenta " + (i + 1) + "):"); //
            cuentas[i].mostrarInformacion(); //
            System.out.println("----------"); //
        }

        // Realizar una operación con la segunda cuenta (índice 1)
        cuentas[1].depositar(1000); //
        System.out.println("Nuevo saldo de Luis:"); //
        cuentas[1].mostrarInformacion(); //
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
    }
}