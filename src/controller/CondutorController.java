package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import model.Pessoa;
import service.CondutorService;
import view.RelatorioCondutor;

public class CondutorController {

    private CondutorService condutorService;

    public CondutorController() throws IOException {
        try {
            this.condutorService = new CondutorService();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salvarCondutor(String nome, String cpf, String fone, String cnh, String categoria) {
        Pessoa condutor = new Pessoa();
        condutor.setNome(nome);
        condutor.setCpf(cpf);
        condutor.setFone(fone);
        condutor.setCnh(cnh);
        condutor.setCategoria(categoria);

        try {
            condutorService.salvarCondutor(condutor);
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratamento de erros, como exibir uma mensagem de erro na UI
        }
    }

    public List<Pessoa> consultarCondutores() {
        try {
            return condutorService.consultar();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratamento de erros, como exibir uma mensagem de erro na UI
        }
        return null;
    }

    public Pessoa consultarCondutorPorId(int id) {
        try {
            return condutorService.consultaId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Pessoa> pesquisarCondutores(String txt) {
        try {
            return condutorService.pesquisar(txt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void fecharConexao() {
        condutorService.fecharConexao(); // Fechar a conexão ao fechar a janela interna
    }
}
