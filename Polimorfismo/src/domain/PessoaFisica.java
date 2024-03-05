package domain;

public class PessoaFisica extends Pessoa {
    private String cpf;

    @Override
    public boolean valida() {
        super.valida();
        return true;
        // Impelementar isso depois
    }
}
