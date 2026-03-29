package je27;


public class JE27 {

    public static void main(String[] args) {
        CuentaAhorro ahorro = new CuentaAhorro("David", 5000, "001001001");
        ahorro.mostrarInformacion();
        ahorro.aplicarInteres();

        System.out.println("\n----------\n");

        CuentaNomina nomina = new CuentaNomina("David", 2000, "002002002");
        nomina.mostrarInformacion();
        nomina.cobrarNomina(8500);
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
    }
}