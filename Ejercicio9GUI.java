package ejercicio9gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Ejercicio9GUI extends JFrame {

    private JTextField txtNumero;
    private JTextArea resultadoArea;
    private ResultadoEj9DAO dao = new ResultadoEj9DAO();

    public Ejercicio9GUI() {
        setTitle("Ejercicio 9 - Serie de Fibonacci");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Número (>=0):"));
        txtNumero = new JTextField();
        add(txtNumero);

        JButton btnCalcular = new JButton("Calcular y Guardar");
        add(btnCalcular);
        btnCalcular.addActionListener(e -> calcularGuardar());

        JButton btnListar = new JButton("Listar");
        add(btnListar);
        btnListar.addActionListener(e -> listar());

        resultadoArea = new JTextArea(5, 20);
        add(new JScrollPane(resultadoArea));

        pack();
        setVisible(true);
    }

    private void calcularGuardar() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            if (numero < 0) {
                throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
            }
            ResultadoEj9 r = new ResultadoEj9(numero);
            dao.guardar(r);
            resultadoArea.setText("Serie de Fibonacci hasta " + numero + ":\n" + r.getSerie());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Entrada inválida. " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void listar() {
        resultadoArea.setText("Resultados guardados:\n");
        for (ResultadoEj9 r : dao.listar()) {
            resultadoArea.append("ID: " + r.getId() + ", Serie hasta " + r.getNumero() + ": " + r.getSerie() + "\n");
        }
    }

    public static void main(String[] args) {
        new Ejercicio9GUI();
    }
}