package controller;

import java.time.LocalDateTime;
import model.Veiculo;
import service.ContaEstacionamento;

public class Estacionamento {
    public double calcularValor(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
        ContaEstacionamento conta = new ContaEstacionamento(inicio, fim, veiculo);
        return conta.valorConta();
    }
}
