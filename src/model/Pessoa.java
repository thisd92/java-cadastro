package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Pessoa {
    
    public String nome, cpf, fone, cnh, categoria;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void cadastroPessoa(){
        id++;
        JOptionPane.showMessageDialog(null, "Condutor Cadastrado!");
    }
    
    public void excluirPessoa(){
        JOptionPane.showMessageDialog(null, "Condutor Excluido!");
    }
    
    public List<Pessoa> getPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa = pessoa;
        List<Pessoa> listaCond = new ArrayList<>();
        listaCond.add(pessoa);
        return listaCond;
    }
    
    public String getCondutor(){
        return "Id: " + id + " Condutor: " + nome + "\nCPF: " + cpf
                + "\nTelefone: " + fone + "\nCNH: " + cnh + "\nCategoria: " + categoria;
    }
}
