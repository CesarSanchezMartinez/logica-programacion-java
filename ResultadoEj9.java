package ejercicio9gui;

public class ResultadoEj9 {

    private int id;
    private int numero;
    private String serie;

    public ResultadoEj9(int numero) {
        this.numero = numero;
        this.serie = calcularSerie(numero);
    }

    private String calcularSerie(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "0, 1";
        }

        StringBuilder sb = new StringBuilder("0, 1");
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            sb.append(", ").append(temp);
            a = b;
            b = temp;
        }
        return sb.toString();
    }
    
    // Getters y Setters...
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public String getSerie() {
        return serie;
    }
}