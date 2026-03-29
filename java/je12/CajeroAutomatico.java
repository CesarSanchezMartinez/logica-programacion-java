package je12; //

import java.util.Scanner; // Importa la clase Scanner para entrada de usuario

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class CajeroAutomatico { //
    private CuentaBancaria cuenta; // La cuenta bancaria con la que operará el cajero

    // Constructor del cajero automático
    public CajeroAutomatico(CuentaBancaria cuenta) { //
        this.cuenta = cuenta; //
    }

    // Método para iniciar el menú del cajero
    public void iniciar() { //
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        int opcion; // Variable para almacenar la opción seleccionada por el usuario

        do { // Bucle do-while para mostrar el menú hasta que el usuario decida salir
            System.out.println("\n\n\u001B[34m======== CAJERO AUTOMÁTICO ========\u001B[0m"); //
            System.out.println("\u001B[36m1. Mostrar información de la cuenta\u001B[0m"); //
            System.out.println("\u001B[36m2. Depositar\u001B[0m"); //
            System.out.println("\u001B[36m3. Retirar\u001B[0m"); //
            System.out.println("\u001B[36m4. Salir\u001B[0m"); //
            System.out.print("\u001B[32mSeleccione una opción: \u001B[0m"); //
            opcion = scanner.nextInt(); // Lee la opción del usuario

            switch (opcion) { // Estructura switch para manejar las opciones del menú
                case 1:
                    cuenta.mostrarInformacion(true); // Muestra toda la información de la cuenta (incluido número)
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("\u001B[35mGracias por usar el cajero automático. ¡Hasta pronto!\u001B[0m");
                    break;
                default:
                    System.out.println("\u001B[31mOpción no válida. Por favor, intente de nuevo.\u001B[0m");
            }
        } while (opcion != 4); // El bucle continúa hasta que la opción sea 4 (Salir)

        scanner.close(); // Cierra el objeto Scanner
    }
}