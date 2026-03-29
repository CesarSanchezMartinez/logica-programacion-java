package je23;


public class JE23 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Sofia Herrera", 4500.0, "44488811", TipoCuenta.AHORRO);

        cuenta.mostrarInformacion();

        System.out.println("\n Realizando operaciones...");

        cuenta.depositar(1500);

        cuenta.retirar(2000);
        cuenta.retirar(5000);

        System.out.println("\n Información actualizada:");
        cuenta.mostrarInformacion();
                System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Línea agregada

    }
}