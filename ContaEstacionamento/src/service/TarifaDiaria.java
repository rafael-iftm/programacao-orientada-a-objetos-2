package service;

public class TarifaDiaria implements Tarifa {
    private double valorDia;

    public TarifaDiaria(double valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public double calcular(long dias) {
        return dias * valorDia;
    }
}
