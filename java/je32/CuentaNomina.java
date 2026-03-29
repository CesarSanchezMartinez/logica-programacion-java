package je32;

// Note: The constructor parameters and super call are different from JE29/JE30 examples.
// Also, the display format in mostrarInformacion is specific.
public class CuentaNomina extends CuentaBancaria {

    public CuentaNomina(String titular, double saldo, String cuenta) { // Constructor signature from image
        super(titular, saldo, cuenta, TipoCuenta.NOMINA);
    }

    @Override
    public void mostrarInformacion() {
        // Concatenating strings directly as seen in the image
        System.out.println(" Titular: " + titular + " | " + numeroCuenta + " | " + "$" + saldo + " (Nómina)");
    }
}