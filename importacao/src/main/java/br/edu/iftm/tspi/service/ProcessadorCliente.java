package br.edu.iftm.tspi.service;

import java.nio.file.Files;
import java.nio.file.Path;

public class ProcessadorCliente extends ProcessadorBase {
    @Override
    protected String getPrefixo() {
        return "Cliente_*";
    }

    @Override
    protected void processaArquivo(Path arquivo) throws Exception {
        ProcessaLinhasCliente processaCliente = new ProcessaLinhasCliente(Files.readAllLines(arquivo));
        processaCliente.processa();
    }
}
