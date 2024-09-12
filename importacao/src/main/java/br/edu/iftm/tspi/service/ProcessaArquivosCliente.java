package br.edu.iftm.tspi.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessaArquivosCliente {

    private final String path = "importacao\\arquivos\\";
    private final String processados = "importacao\\processados\\";
    private final String clientePrefix = "Cliente_*";

    public void processaCliente() throws Exception {
        List<Path> clientesAProcessar = getClientesAProcessar(); 
        for (Path clienteAProcessar: clientesAProcessar) {
            processaArquivo(clienteAProcessar);
            moveArquivoProcessado(clienteAProcessar);
        }
    }

    private List<Path> getClientesAProcessar() throws Exception {
        Path dir = Paths.get(path);

        List<Path> fileList = new ArrayList<>();
        Files.newDirectoryStream(dir, clientePrefix).forEach(fileList::add);
        Collections.sort(fileList);

        return fileList;
    }

    private void processaArquivo(Path clienteAProcessar) throws Exception {
        ProcessaLinhasCliente processaCliente = 
            new ProcessaLinhasCliente(Files.readAllLines(clienteAProcessar));
        processaCliente.processa();
    }

    private void moveArquivoProcessado(Path clienteAProcessar) throws Exception {
        Path dir = Paths.get(processados + clienteAProcessar.getFileName());
        Files.move(clienteAProcessar, dir);
    }
}
