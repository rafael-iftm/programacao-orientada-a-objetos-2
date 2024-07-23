public class CalculadoraDescontos {
    private DescontoStrategy descontoStrategy;

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularDesconto(double consumo) {
        if (descontoStrategy == null) {
            throw new IllegalStateException("DescontoStrategy não definida");
        }
        return descontoStrategy.calcularDesconto(consumo);
    }
}
