package br.edu.iftm.tspi.domain;

import java.util.Date;

public class Cliente {

    private String inclusaoAlteracao;

    private String cpf;

    private String nome;

    private String endereco;

    private String bairro;

    private String cidade;

    private String estado;

    private Date dataHoraCadastro;

    public boolean isAtualizou(String valor) {
        for (char c: valor.toCharArray()) {
            if (c != '_') {
                return true;
            }
        }
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public String getInclusaoAlteracao() {
        return inclusaoAlteracao;
    }

    public void setInclusaoAlteracao(String inclusaoAlteracao) {
        this.inclusaoAlteracao = inclusaoAlteracao;
    }

    @Override
    public String toString() {
        return "Cliente [inclusaoAlteracao=" + inclusaoAlteracao + ", cpf=" + cpf + ", nome=" + nome + ", endereco="
                + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", dataHoraCadastro="
                + dataHoraCadastro + "]";
    }

    
    

}
