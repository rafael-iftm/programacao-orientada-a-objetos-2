package br.edu.iftm.tspi.service;

import java.nio.file.Files;
import java.nio.file.Path;

public class ProcessadorConta extends ProcessadorBase {
    @Override
    protected String getPrefixo() {
        return "Conta_*";
    }

    @Override
    protected void processaArquivo(Path arquivo) throws Exception {
        ProcessaLinhasConta processaConta = new ProcessaLinhasConta(Files.readAllLines(arquivo));
        processaConta.processa();
    }
}

