package service;

import db.Conexao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;
import model.Combustivel;

public class VeiculoService {

    private Conexao conexao;

    public VeiculoService() throws SQLException, IOException {
        this.conexao = new Conexao();
    }

    public void salvarVeiculo(Veiculo veiculo) throws SQLException {
        String sql = "INSERT INTO tb_veiculo (marca, modelo, ano, combustivel) VALUES (?, ?, ?, ?)";
        try (Connection conn = conexao.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, veiculo.getMarca());
            pstmt.setString(2, veiculo.getModelo());
            pstmt.setInt(3, veiculo.getAno());
            pstmt.setString(4, veiculo.getCombustivel().name());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Veiculo> consultar() throws SQLException {
        String sql = "SELECT id, marca, modelo, ano, combustivel FROM tb_veiculo";
        List<Veiculo> veiculos = new ArrayList<>();
        try (Connection conn = conexao.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("id"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setCombustivel(Combustivel.valueOf(rs.getString("combustivel")));
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }

    public Veiculo consultaId(int id) throws SQLException {
        String sql = "SELECT * FROM tb_veiculo WHERE id = ?";
        try (Connection conn = conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Veiculo veiculo = new Veiculo();
                    veiculo.setMarca(resultSet.getString("marca"));
                    veiculo.setModelo(resultSet.getString("modelo"));
                    veiculo.setAno(resultSet.getInt("ano"));
                    veiculo.setCombustivel(Combustivel.valueOf(resultSet.getString("combustivel"))); // Convertendo String para Enum
                    return veiculo;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Veiculo> pesquisar(String txt) throws SQLException {
        String sql = "SELECT id, marca, modelo, ano, combustivel FROM tb_veiculo"
                + " WHERE marca LIKE ? OR modelo LIKE ?";
        List<Veiculo> veiculos = new ArrayList<>();
        try (Connection conn = conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + txt + "%");
            stmt.setString(2, "%" + txt + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Veiculo veiculo = new Veiculo();
                    veiculo.setId(rs.getInt("id"));
                    veiculo.setMarca(rs.getString("marca"));
                    veiculo.setModelo(rs.getString("modelo"));
                    veiculo.setAno(rs.getInt("ano"));
                    veiculo.setCombustivel(Combustivel.valueOf(rs.getString("combustivel")));
                    veiculos.add(veiculo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }
}
