package je21;

/**
 *
 * @author usuario
 */
public class JE21 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan García", 5000.0, "555666777", TipoCuenta.NOMINA);

        System.out.println(" Saldo inicial:");
        cuenta.mostrarInformacion();

        System.out.println("\n Generando movimientos automáticos...");
        GeneradorMovimientos.generar(cuenta);

        System.out.println("\n Saldo final:");
        cuenta.mostrarInformacion();
                System.out.println("Cesar Sanchez Martinez - 24598 - 3C");

    }
}