public class Main {
    public static void main(String[] args) {
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        calculadora.setDescontoStrategy(new DescontoClienteRegular());
        double descontoRegular = calculadora.calcularDesconto(1200);
        System.out.println("Desconto Cliente Regular: " + descontoRegular);

        calculadora.setDescontoStrategy(new DescontoClienteVIP());
        double descontoVIP = calculadora.calcularDesconto(1200);
        System.out.println("Desconto Cliente VIP: " + descontoVIP);

        calculadora.setDescontoStrategy(new DescontoFuncionario());
        double descontoFuncionario = calculadora.calcularDesconto(1200);
        System.out.println("Desconto Funcionário: " + descontoFuncionario);
    }
}
