package je22 ;

import java.util.Scanner;

public class CajeroAutomatico {

    private CuentaBancaria cuenta;

    public CajeroAutomatico(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.mostrarInformacion();
                    break;
                case 2:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println(" Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
