package domain;

public class PessoaFisica extends Pessoa {
    private String cpf;

    @Override
    protected boolean validaAbstract() {
        boolean validaCPF = true;

        return validaCPF;
    }

    @Override
    protected boolean isNomeSujo() {
        boolean validaCPFSujo = true;

        return validaCPFSujo;
    }
}
