public class ContaSalario extends Conta {
    
   public ContaSalario(Agencia agencia, String numeroConta, double saldo) {
       super(agencia, numeroConta, saldo);
   }
   
   @Override
   public void saque(double valor) throws ContaException {
       if (valor > 0) {
           if (this.saldo >= valor) {
               this.saldo -= valor;
           } else {
               throw new ContaException("Saldo insuficiente para saque. Saldo atual: R$ " + this.saldo);
           }
       } else {
           throw new ContaException("Valor inválido para saque: R$ " + valor);
       }
   }
}