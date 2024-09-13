package br.edu.iftm.tspi;

import br.edu.iftm.tspi.service.ImportadorArquivo;
import br.edu.iftm.tspi.service.ProcessadorCliente;
import br.edu.iftm.tspi.service.ProcessadorConta;

public class Main {

    public static void main(String[] args) throws Exception {
        ImportadorArquivo importadorCliente = new ImportadorArquivo(new ProcessadorCliente());
        importadorCliente.importar();
        ImportadorArquivo importadorConta = new ImportadorArquivo(new ProcessadorConta());
        importadorConta.importar();

    }

}