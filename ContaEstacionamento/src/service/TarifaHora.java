package service;

public class TarifaHora implements Tarifa {
    private double valorHora;

    public TarifaHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcular(long horas) {
        return horas * valorHora;
    }
}
