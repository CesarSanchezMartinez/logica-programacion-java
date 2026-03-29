package je21;

import java.util.Random; // Importa la clase Random para generar números aleatorios

/**
 *
 * @author usuario
 */
public class GeneradorMovimientos {

    // Constantes para el número de movimientos y el monto máximo/mínimo de los movimientos
    private static final int NUM_MOVIMIENTOS = 5;
    private static final double MONTO_MAXIMO = 2000.0;

    /**
     * Genera movimientos automáticos (depósitos o retiros) en una cuenta bancaria.
     * @param cuenta La instancia de CuentaBancaria sobre la que se realizarán los movimientos.
     */
    public static void generar(CuentaBancaria cuenta) {
        Random random = new Random(); // Crea un objeto Random para la generación de números aleatorios

        // Bucle para generar el número predefinido de movimientos
        for (int i = 0; i < NUM_MOVIMIENTOS; i++) {
            // Decide aleatoriamente si el movimiento es un depósito (true) o un retiro (false)
            boolean esDeposito = random.nextBoolean();
            // Genera un monto aleatorio entre 100 y 2000
            double monto = 100 + random.nextDouble() * (MONTO_MAXIMO - 100);

            // Si es un depósito, se deposita el monto en la cuenta
            if (esDeposito) {
                cuenta.depositar(monto);
                System.out.println(" Depósito automático de $" + String.format("%.2f", monto));
            } else { // Si es un retiro, se retira el monto de la cuenta
                cuenta.retirar(monto);
                System.out.println(" Retiro automático de $" + String.format("%.2f", monto));
            }
        }
    }
}