package je26;


import java.util.Scanner;

public class CajeroAutomatico {

    private CuentaBancaria cuenta;

    public CajeroAutomatico(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.mostrarInformacion();
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double monto = sc.nextDouble();
                    if (Validaciones.montoValido(monto)) {
                        cuenta.depositar(monto);
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (Validaciones.montoValido(retiro)) {
                        cuenta.retirar(retiro);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }

    // Clase interna para el menú
    private class Menu {
        public void mostrar() {
            // Este método está vacío en la imagen, pero se llama en iniciar()
        }
    }
}