package br.edu.iftm.tspi.service;

import java.util.List;

public abstract class ProcessadorLinha<T> {

    protected List<String> lines;
    protected Integer lote;

    public ProcessadorLinha(List<String> lines) {
        this.lines = lines;
    }

    public void processa() throws Exception {
        for (String linha : lines) {
            String opcao = linha.substring(0, 1);
            if (opcao.equals("2")) {
                processaDetalhe(linha);
            } else if (opcao.equals("1")) {
                processaCabecalho(linha);
            } else {
                throw new Exception("Desconheço essa opção de processar a linha: " + opcao);
            }
        }
        salvarLote();
    }

    protected abstract void processaCabecalho(String linha) throws Exception;

    protected abstract void processaDetalhe(String linha) throws Exception;

    protected abstract void salvarLote() throws Exception;
}

