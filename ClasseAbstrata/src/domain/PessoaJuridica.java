package domain;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    @Override
    protected boolean validaAbstract() {
        boolean validaCnpj = true;

        return validaCnpj;
    }

    @Override
    protected boolean isNomeSujo() {
        boolean validaCnpjSujo = true;

        return validaCnpjSujo;
    }
}
