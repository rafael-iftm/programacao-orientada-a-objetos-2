package domain;

public class Pessoa {
    private Integer codigo;
    private String nome;

    public boolean valida() {
        return true;
    }

    public boolean validaPessoaAbstrata() {
        return valida();
    }
}
