package br.edu.iftm.tspi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.edu.iftm.tspi.dao.ClienteDao;
import br.edu.iftm.tspi.domain.Cliente;

public class ProcessaLinhasCliente extends ProcessadorLinha<Cliente> {

    private ClienteDao clienteDao;

    public ProcessaLinhasCliente(List<String> lines) {
        super(lines);
        this.clienteDao = new ClienteDao();
    }

    @Override
    protected void processaCabecalho(String linha) throws Exception {
        Integer lote = Integer.parseInt(linha.substring(1, 4));
        Integer loteBanco = clienteDao.getUltimoLote();
        Integer loteEsperado = loteBanco + 1;
        if (!lote.equals(loteEsperado)) {
            throw new Exception("Lote recebido: " + lote + " diferente do lote esperado:" + loteEsperado);
        }
        this.lote = lote;
    }

    @Override
    protected void processaDetalhe(String linha) throws Exception {
        Cliente cliente = getCliente(linha);
        clienteDao.persistir(cliente);
    }

    @Override
    protected void salvarLote() throws Exception {
        clienteDao.salvarLote(lote);
    }

    private Cliente getCliente(String linha) throws ParseException {
        Cliente cliente = new Cliente();
        cliente.setInclusaoAlteracao(linha.substring(1, 2));
        cliente.setCpf(linha.substring(2, 13));
        cliente.setNome(linha.substring(13, 43));
        cliente.setEndereco(linha.substring(43, 73));
        cliente.setBairro(linha.substring(73, 103));
        cliente.setCidade(linha.substring(103, 133));
        cliente.setEstado(linha.substring(133, 135));
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
        Date dataHoraCadastro = sdf.parse(linha.substring(135, 143) + linha.substring(143, 149));
        cliente.setDataHoraCadastro(dataHoraCadastro);
        return cliente;
    }
}
