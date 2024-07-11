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
import model.Pessoa;
import view.RelatorioCondutor;

public class CondutorService {

    private Conexao conexao;

    public CondutorService() throws SQLException, IOException {
        this.conexao = new Conexao();
    }

    public void salvarCondutor(Pessoa condutor) throws SQLException {
        String sql = "INSERT INTO tb_condutor (nome, cpf, fone, cnh, categoria) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, condutor.getNome());
            pstmt.setString(2, condutor.getCpf());
            pstmt.setString(3, condutor.getFone());
            pstmt.setString(4, condutor.getCnh());
            pstmt.setString(5, condutor.getCategoria());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (pstmt != null) {
                pstmt.close(); // Fecha o PreparedStatement
            }
            // Não feche a conexão aqui para permitir operações subsequentes
        }
    }

    public List<Pessoa> consultar() throws SQLException {
        String sql = "SELECT id, nome, cpf, fone, cnh, categoria FROM tb_condutor";
        List<Pessoa> condutores = new ArrayList<>();
        try (Connection conn = conexao.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Pessoa condutor = new Pessoa();
                condutor.setId(rs.getInt("id"));
                condutor.setNome(rs.getString("nome"));
                condutor.setCpf(rs.getString("cpf"));
                condutor.setFone(rs.getString("fone"));
                condutor.setCnh(rs.getString("cnh"));
                condutor.setCategoria(rs.getString("categoria"));
                condutores.add(condutor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return condutores;
    }

    public Pessoa consultaId(int id) throws SQLException {
        Pessoa condutor = null;
        String sql = "SELECT id, nome, cpf, fone, cnh, categoria FROM tb_condutor WHERE id = ?";
        try (Connection conn = conexao.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    condutor = new Pessoa();
                    condutor.setId(rs.getInt("id"));
                    condutor.setNome(rs.getString("nome"));
                    condutor.setCpf(rs.getString("cpf"));
                    condutor.setFone(rs.getString("fone"));
                    condutor.setCnh(rs.getString("cnh"));
                    condutor.setCategoria(rs.getString("categoria"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return condutor;
    }

    public List<Pessoa> pesquisar(String txt) throws SQLException {
        String sql = "SELECT id, nome, cpf, fone, cnh, categoria FROM tb_condutor"
                + " WHERE nome LIKE ? OR cpf LIKE ?";
        List<Pessoa> condutores = new ArrayList<>();
        try (Connection conn = conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + txt + "%");
            stmt.setString(2, "%" + txt + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Pessoa condutor = new Pessoa();
                    condutor.setId(rs.getInt("id"));
                    condutor.setNome(rs.getString("nome"));
                    condutor.setCpf(rs.getString("cpf"));
                    condutor.setFone(rs.getString("fone"));
                    condutor.setCnh(rs.getString("cnh"));
                    condutor.setCategoria(rs.getString("categoria"));
                    condutores.add(condutor);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return condutores;
    }

    public void fecharConexao() {
        conexao.fecharConexao();
    }
}
