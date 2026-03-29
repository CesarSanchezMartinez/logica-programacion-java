package je25;

public class JE25 {

    public static void main(String[] args) {
        Cajero cajero = new Cajero("UTSC Campus Central");

        // Crear instancia de clase interna Operacion
        Cajero.Operacion operacion = cajero.new Operacion("Depósito", 1500);
        
        operacion.ejecutar();
                System.out.println("Cesar Sanchez Martinez - 24598 - 3C");

    }
}