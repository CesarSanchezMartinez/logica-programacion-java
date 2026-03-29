package je18; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class CuentaBancaria { //
    private String titular; //
    private double saldo; //
    private String numeroCuenta; //
    private TipoCuenta tipoCuenta; //

    public CuentaBancaria(String titular, double saldoInicial, String numeroCuenta, TipoCuenta tipoCuenta) { //
        this.titular = titular; //
        this.saldo = saldoInicial; //
        this.numeroCuenta = numeroCuenta; //
        this.tipoCuenta = tipoCuenta; //
    }

    public void mostrarInformacion() { //
        System.out.println("Titular: " + titular); //
        System.out.println("Número de cuenta: " + numeroCuenta); //
        System.out.println("Tipo de cuenta: " + tipoCuenta); //
        System.out.println("Saldo actual: $" + saldo); //
    }

    public void depositar(double cantidad) { //
        if (cantidad > 0) { //
            saldo += cantidad; //
            System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo); //
        } else { //
            System.out.println("❌ La cantidad debe ser mayor a cero."); //
        }
    }

    public void retirar(double cantidad) { //
        if (cantidad > 0) { //
            if (saldo >= cantidad) { //
                saldo -= cantidad; //
                System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo); //
            } else { //
                System.out.println("❌ Fondos insuficientes."); //
            }
        } else { //
            System.out.println("❌ La cantidad debe ser mayor a cero."); //
        }
    }
}