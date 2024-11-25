package Entidades;

public class Conta {

    /* Atributos */
    final private int numero;
    private double saldo;
    private String tipo;
    private Cliente cliente;

    /**
     * Construtor de Conta.
     * @param numero Número da conta.
     * @param saldo Saldo da conta.
     * @param tipo Tipo da conta (corrente, poupança, etc.).
     * @param cliente Cliente associado à conta.
     */
    public Conta(int numero, double saldo, String tipo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    /* Getters e setters */
    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método sobreescrito que transforma uma conta em uma representação 
     * de texto com todos seus dados.
     * @return Representação da conta em texto.
     */
    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + this.numero + ", " + 
                "saldo=" + this.saldo + ", " + 
                "tipo='" + this.tipo + "'" + ", " +
                "cliente=" + this.cliente +
                '}';
    }
}
