package com.exemplo.encapsulamento;

public abstract class Cliente {
    private String nome;

    protected Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double aplicarDesconto(double precoBase);
}
