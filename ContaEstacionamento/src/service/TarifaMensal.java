package service;

public class TarifaMensal implements Tarifa {
    private double valorMes;

    public TarifaMensal(double valorMes) {
        this.valorMes = valorMes;
    }

    @Override
    public double calcular(long meses) {
        return meses * valorMes;
    }
}
