package controller;

import java.io.IOException;
import model.Veiculo;
import model.Combustivel;
import service.VeiculoService;

import java.sql.SQLException;
import java.util.List;

public class VeiculoController {

    private VeiculoService veiculoService;

    public VeiculoController() throws IOException {
        try {
            this.veiculoService = new VeiculoService();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salvarVeiculo(String marca, String modelo, int ano, Combustivel combustivel) {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setAno(ano);
        veiculo.setCombustivel(combustivel);

        try {
            veiculoService.salvarVeiculo(veiculo);
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratamento de erros, como exibir uma mensagem de erro na UI
        }
    }

    public List<Veiculo> consultarVeiculos() {
        try {
            return veiculoService.consultar();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratamento de erros, como exibir uma mensagem de erro na UI
        }
        return null;
    }

    public Veiculo consultarVeiculoPorId(int id) {
        try {
            return veiculoService.consultaId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Veiculo> pesquisarVeiculos(String txt) {
        try {
            return veiculoService.pesquisar(txt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
