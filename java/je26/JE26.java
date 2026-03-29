package je26;


public class JE26 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("David Cedillo", 7500.0, "ABC123456", TipoCuenta.AHORRO); // <--- Problem line (JE26.java:8)
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta);
        cajero.iniciar();
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
    }
}