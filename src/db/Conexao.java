package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String SERVIDOR = "localhost";
    private static final String BANCO = "db_projeto_final";
    private static final String URL = "jdbc:mysql://" + SERVIDOR + "/" + BANCO;
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    protected Connection conexao;

    public Conexao() throws SQLException {
        try {
            this.conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
    }

    public Connection getConnection() {
        return this.conexao;
    }

    public void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
}
