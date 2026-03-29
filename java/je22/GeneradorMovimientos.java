package je22;

import java.util.Random;

public class GeneradorMovimientos {

    private static final int NUM_MOVIMIENTOS = 5;
    private static final double MONTO_MAXIMO = 2000.0;

    public static void generar(CuentaBancaria cuenta) {
        Random random = new Random();

        for (int i = 0; i < NUM_MOVIMIENTOS; i++) {
            boolean esDeposito = random.nextBoolean();
            double monto = 100 + random.nextDouble() * (MONTO_MAXIMO - 100);

            if (esDeposito) {
                cuenta.depositar(monto);
            } else {
                cuenta.retirar(monto);
            }
        }
    }
}