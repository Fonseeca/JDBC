package src.Entidades.Cliente;

import java.util.List;

public class Banco {

    /* Atributos */
    final private int codigo;
    private String nome;
    private String endereco;
    private List<Cliente> clientes;

    /**
     * Construtor de Banco.
     * @param codigo Código do banco.
     * @param nome Nome do banco.
     * @param endereco Endereço do banco.
     * @param clientes Lista de clientes do banco.
     */
    public Banco(int codigo, String nome, String endereco, List<Cliente> clientes) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.clientes = clientes;
    }

    /* Getters e setters */
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Método sobreescrito que transforma um banco em uma representação 
     * de texto com todos seus dados.
     * @return Representação do banco em texto.
     */
    @Override
    public String toString() {
        return "Banco{" +
                "codigo=" + this.codigo + ", " + 
                "nome='" + this.nome + "'" + ", " + 
                "endereco='" + this.endereco + "'" + ", " + 
                "clientes=" + this.clientes + 
                '}';
    }
}
