package domain;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    @Override
    public boolean valida() {
        super.valida();
        return true;
        // Implementa isso depois
    }
}
