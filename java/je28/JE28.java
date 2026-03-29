package je28;



public class JE28 {

    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro("Laura", 3000.0, "000A123", 0.05); // cite: 1
        ca.mostrarInformacion(); // cite: 1
        ca.aplicarInteres(); // cite: 1

        System.out.println("\n"); // cite: 1

        CuentaNomina cn = new CuentaNomina("Carlos", "000N456"); // cite: 1
        cn.mostrarInformacion(); // cite: 1
        cn.cobrarNomina(6500); // cite: 1
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
    }
}