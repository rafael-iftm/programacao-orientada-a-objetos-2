package domain;

public class PessoaEstrangeira extends Pessoa {
    private String passaporte;

    @Override
    public boolean valida() {
        super.valida();
        return true;
        // Implementa isso depois
    }

    // public boolean testarNacionalidade() {
    //     // Quebra o polimorfismo
    // }
}
