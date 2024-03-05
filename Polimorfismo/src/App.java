import domain.Pessoa;
import domain.PessoaEstrangeira;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new PessoaFisica();
        // Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new PessoaJuridica();
        Pessoa pessoa4 = new PessoaEstrangeira();

        chamaValidacao(pessoa1);
        // chamaValidacao(pessoa2);
        chamaValidacao(pessoa3);
        chamaValidacao(pessoa4);
    }
    
    private static void chamaValidacao(Pessoa pessoa) {
        pessoa.valida();
    }
}
