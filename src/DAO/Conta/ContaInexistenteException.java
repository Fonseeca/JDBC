package DAOs.Conta;

public class ContaInexistenteException extends Exception{
    public ContaInexistenteException(String message) {
        super(message);
    }
}
