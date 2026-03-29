package je18; //

import java.util.ArrayList; //

import je16.CuentaBancaria;
import je16.TipoCuenta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE18 { //
    public static void main(String[] args) { //
        // Crear una lista dinámica de cuentas
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>(); //

        // Agregar cuentas
        cuentas.add(new CuentaBancaria("María López", 3000.0, "111111111", TipoCuenta.AHORRO)); //
        cuentas.add(new CuentaBancaria("Pablo Torres", 5000.0, "222222222", TipoCuenta.NOMINA)); //
        cuentas.add(new CuentaBancaria("Diana Gómez", 8000.0, "333333333", TipoCuenta.EMPRESARIAL)); //

        // Mostrar todas las cuentas
        System.out.println("✅ Listado de cuentas:"); //
        for (CuentaBancaria cuenta : cuentas) { //
            cuenta.mostrarInformacion(); //
            System.out.println("--------------------"); //
        }

        // Obtener una cuenta por índice
        System.out.println("✅ Operación en la segunda cuenta:"); //
        cuentas.get(1).depositar(1000); // Acceso por índice y operación

        // Eliminar una cuenta
        cuentas.remove(0); // Elimina la primera cuenta (índice 0)

        // Mostrar lista actualizada
        System.out.println("\n✅ Lista actualizada de cuentas:"); //
        for (CuentaBancaria cuenta : cuentas) { //
            cuenta.mostrarInformacion(); //
            System.out.println("-----------"); //
        }
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}