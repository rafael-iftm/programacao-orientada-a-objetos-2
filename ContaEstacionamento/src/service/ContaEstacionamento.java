package service;

import java.time.LocalDateTime;
import model.Veiculo;

public class ContaEstacionamento {
    private Veiculo veiculo;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public ContaEstacionamento(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
        this.inicio = inicio;
        this.fim = fim;
        this.veiculo = veiculo;
    }

    public Double valorConta() {
        Duracao duracao = new Duracao(inicio, fim);
        return CalculoTarifa.calcular(veiculo, duracao);
    }
}
