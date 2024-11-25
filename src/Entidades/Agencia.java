package src.Entidades;

public class Agencia {

    /* Atributos */
    final private int codigo;
    private String nome;
    private String endereco;
    private Banco banco;

    /**
     * Construtor de Agencia.
     * @param codigo Código da agência.
     * @param nome Nome da agência.
     * @param endereco Endereço da agência.
     * @param banco Banco ao qual a agência pertence.
     */
    public Agencia(int codigo, String nome, String endereco, Banco banco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.banco = banco;
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

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    /**
     * Método sobreescrito que transforma uma agência em uma representação 
     * de texto com todos seus dados.
     * @return Representação da agência em texto.
     */
    @Override
    public String toString() {
        return "Agencia{" +
                "codigo=" + this.codigo + ", " + 
                "nome='" + this.nome + "'" + ", " + 
                "endereco='" + this.endereco + "'" + ", " +
                "banco=" + this.banco +
                '}';
    }
}
