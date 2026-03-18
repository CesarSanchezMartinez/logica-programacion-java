package ejercicio9gui;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResultadoEj9DAO {

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/ejercicios_java", "root", "");
    }

    public void guardar(ResultadoEj9 r) {
        String sql = "INSERT INTO resultado_ej9 (numero, serie) VALUES (?, ?)";
        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, r.getNumero());
            stmt.setString(2, r.getSerie());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ResultadoEj9> listar() {
        List<ResultadoEj9> lista = new ArrayList<>();
        String sql = "SELECT * FROM resultado_ej9";
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ResultadoEj9 r = new ResultadoEj9(rs.getInt("numero"));
                r.setId(rs.getInt("id"));
                lista.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}