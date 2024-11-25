package Entidades;

import java.util.List;

public class Cliente {

    /* Atributos */
    final private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private List<Agente> agentes;

    /**
     * Construtor de Cliente.
     * @param id ID do cliente.
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     * @param endereco Endereço do cliente.
     * @param agentes Lista de agentes associados ao cliente.
     */
    public Cliente(int id, String nome, String cpf, String endereco, List<Agente> agentes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.agentes = agentes;
    }

    /* Getters e setters */
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Agente> getAgentes() {
        return this.agentes;
    }

    public void setAgentes(List<Agente> agentes) {
        this.agentes = agentes;
    }

    /**
     * Método sobreescrito que transforma um cliente em uma representação 
     * de texto com todos seus dados.
     * @return Representação do cliente em texto.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + this.id + ", " + 
                "nome='" + this.nome + "'" + ", " + 
                "cpf='" + this.cpf + "'" + ", " + 
                "endereco='" + this.endereco + "'" + ", " +
                "agentes=" + this.agentes +
                '}';
    }
}
