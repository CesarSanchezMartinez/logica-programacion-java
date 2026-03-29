package je25;

public class Cajero {

    private String sucursal;

    public Cajero(String sucursal) {
        this.sucursal = sucursal;
    }

    // Clase interna que representa una operación bancaria
    public class Operacion {
        private String tipo;
        private double monto;

        public Operacion(String tipo, double monto) {
            this.tipo = tipo;
            this.monto = monto;
        }

        public void ejecutar() {
            System.out.println("Operación: " + tipo +
                               "\n Monto: $" + monto +
                               "\n Sucursal: " + sucursal); // usa campo externo
        }
    }
}