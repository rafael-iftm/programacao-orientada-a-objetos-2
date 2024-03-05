package domain;

public abstract class Pessoa {
    private Integer codigo;
    private String nome;

    protected abstract boolean validaAbstract();

    // Template
    public boolean valida() {
        boolean validaNome = true;

        return validaNome && validaAbstract();
    }
}