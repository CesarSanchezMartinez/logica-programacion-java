package je24;



public class JE24 {

    public static void main(String[] args) {
        new CuentaBancaria("Carlos", 5000.0, "5000123", TipoCuenta.NOMINA);
        new CuentaBancaria("Luisa", 8000.0, "456", TipoCuenta.AHORRO);

        System.out.println(" Total de cuentas creadas: " + CuentaBancaria.getTotalCuentas());
                        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Línea agregada

    }
}