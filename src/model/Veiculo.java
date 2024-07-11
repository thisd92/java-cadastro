package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Veiculo {

    private int id;
    public String modelo;
    public String marca;
    public int ano;
    public Combustivel combustivel;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, int ano, Combustivel combustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void cadastrar() {
        JOptionPane.showMessageDialog(null, "Veiculo Cadastrado!");
    }

    public void excluir() {
        JOptionPane.showMessageDialog(null, "Veiculo Excluido!");
    }

    public String getLista() {
        return "Veiuclo: " + marca + " " + modelo
                + "\nAno: " + ano + "\nTipo de Combustivel: " + combustivel;
    }
}
