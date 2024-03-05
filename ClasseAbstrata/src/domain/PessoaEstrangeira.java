package domain;

public class PessoaEstrangeira extends Pessoa {
    private String passaporte;

    @Override
    protected boolean validaAbstract() {
        boolean validaPassaporte = true;

        return validaPassaporte;
    }

    @Override
    protected boolean isNomeSujo() {
        throw new UnsupportedOperationException("Pessoa estrangeira não tem nome sujo");
    }

}
