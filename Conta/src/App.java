public class App {
    public static void main(String[] args) {
        try {
            Agencia caixaCentral = new Agencia("0309-12");
            Conta contaCorrente = new ContaCorrente(caixaCentral, "2098-3", 200.0, 1500);
            Conta contaPoupanca1 = new ContaPoupanca(caixaCentral, "3107-4", 300.0);
            Conta contaPoupanca2 = new ContaPoupanca(caixaCentral, "3108-5", 400.0);
            Conta contaSalario = new ContaSalario(caixaCentral, "1098-2", 500.0);

            caixaCentral.addConta(contaPoupanca1);
            caixaCentral.addConta(contaPoupanca2);
            caixaCentral.addConta(contaCorrente);
            caixaCentral.addConta(contaSalario);

            caixaCentral.cobrarTarifas();

            caixaCentral.saque("2098-3", 50);
            caixaCentral.saque("3107-4", 100);
            caixaCentral.saque("3108-5", 150); 
            caixaCentral.saque("1098-2", 200);
            
        } catch (ContaException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}