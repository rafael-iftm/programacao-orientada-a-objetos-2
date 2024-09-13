package br.edu.iftm.tspi.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ProcessadorBase implements ProcessadorArquivos {
    protected final String PATH = "arquivos\\";
    protected final String PROCESSADOS = "processados\\";

    protected abstract String getPrefixo();

    @Override
    public void processar() throws Exception {
        List<Path> arquivosAProcessar = getArquivosAProcessar();
        for (Path arquivo : arquivosAProcessar) {
            processaArquivo(arquivo);
            moveArquivo(arquivo);
        }
    }

    private List<Path> getArquivosAProcessar() throws Exception {
        Path dir = Paths.get(PATH);
        List<Path> fileList = new ArrayList<>();
        Files.newDirectoryStream(dir, getPrefixo()).forEach(fileList::add);
        Collections.sort(fileList);
        return fileList;
    }

    private void moveArquivo(Path arquivo) throws Exception {
        Path dir = Paths.get(PROCESSADOS + arquivo.getFileName());
        Files.move(arquivo, dir);
    }

    protected abstract void processaArquivo(Path arquivo) throws Exception;
}

