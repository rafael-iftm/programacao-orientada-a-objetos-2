package br.edu.iftm.tspi.service;

public class ImportadorArquivo {
    private final ProcessadorArquivos processador;

    public ImportadorArquivo(ProcessadorArquivos processador) {
        this.processador = processador;
    }

    public void importar() throws Exception {
        System.out.println("Iniciando importação...");
        processador.processar();
        System.out.println("Importação finalizada.");
    }
}
