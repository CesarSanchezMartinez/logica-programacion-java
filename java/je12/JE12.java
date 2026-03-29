package je12; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE12 { //
    public static void main(String[] args) { //
        // Crea una cuenta bancaria con datos iniciales
        CuentaBancaria cuenta = new CuentaBancaria("Isabel Martinez", 5000.0, "123123123", TipoCuenta.NOMINA); //

        // Crea una instancia del CajeroAutomatico, pasándole la cuenta
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta); //

        // Inicia el menú del cajero automático
        cajero.iniciar(); //
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}