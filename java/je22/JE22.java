package je22;


/**
 * Clase principal para probar el sistema bancario.
 * @author usuario
 */
public class JE22 {

    public static void main(String[] args) {
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Línea agregada
        // Crea una cuenta bancaria con datos iniciales
        CuentaBancaria cuenta = new CuentaBancaria("Laura", 6000.0, "123123123", TipoCuenta.NOMINA);
        
        // Crea una instancia de CajeroAutomatico asociada a la cuenta
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta);
        
        // Genera algunos movimientos automáticos para la cuenta
        GeneradorMovimientos.generar(cuenta);
        
        // Inicia la interfaz del cajero automático
        cajero.iniciar();
    }
}