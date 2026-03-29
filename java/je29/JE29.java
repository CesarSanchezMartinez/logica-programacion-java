package je29;



public class JE29 {

    public static void main(String[] args) {
        CuentaBancaria ca = new CuentaAhorro("Cesar", 6000, "111111", 0.04);
        CuentaBancaria cn = new CuentaNomina("Sanchez", "222222");

        ca.mostrarInformacion();
        System.out.println("------------------------------------------\n");
        cn.mostrarInformacion();
                System.out.println("Cesar Sanchez Martinez - 24598 - 3C");

    }
}