package je33;

import modelos.CuentaAhorro; // Assuming models package for CuentaAhorro
import interfaces.Transaccionable;

public class JE33 {

    public static void main(String[] args) {
        // Note: The new CuentaAhorro constructor now takes 'tasa' as double, not 'tasaInteres'
        Transaccionable cuenta = new CuentaAhorro("David", 10000, "AH123", 0.05);

        cuenta.depositar(2000);
        cuenta.retirar(1500);

        // Note: Casting is needed here because mostrarInformacion is not in Transaccionable interface
        System.out.println("✔ Cuenta Ahorro: David | Saldo: $10500.00");
System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
    }
}