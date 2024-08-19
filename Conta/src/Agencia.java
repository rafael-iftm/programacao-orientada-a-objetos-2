import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String numero;
    private List<Conta> contas = new ArrayList<>(); 

    public Agencia(String numero) {
        this.numero = numero;
    }

    public void addConta(Conta conta) throws ContaException {
        this.contas.add(conta);
    }

    public void saque(String numeroConta, double valor) throws ContaException {
        Conta conta = getConta(numeroConta);
        conta.saque(valor);    
        System.out.println("-> Saque de R$ " + valor + " realizado com sucesso -> Saldo atual: R$ " + conta.getSaldo());
    }

    public void deposito(String numeroConta, double valor) throws ContaException {
        Conta conta = getConta(numeroConta);
        conta.deposito(valor);
        System.out.println("-> Depósito de R$ " + valor + " realizado com sucesso -> Saldo atual: R$ " + conta.getSaldo());
    }
    
    private Conta getConta(String numeroConta) throws ContaException {
        for (Conta conta: contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        throw new ContaException("Número da conta " + numeroConta + " não existe.");
    }

    public void cobrarTarifas() throws ContaException {
        for (Conta conta : contas) {
            if (conta instanceof Tarifavel) {
                ((Tarifavel) conta).tarifar();
            }
        }
        System.out.println("-> Tarifas cobradas com sucesso.");
    }
}