import domain.Pessoa;
import domain.PessoaEstrangeira;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa rafael = new PessoaFisica();
        Pessoa iftm = new PessoaJuridica();
        Pessoa lewisHamilton = new PessoaEstrangeira();
        
        chamaValidacao(rafael);
        chamaValidacao(iftm);
        chamaValidacao(lewisHamilton);
    }

    private static void chamaValidacao(Pessoa pessoa) {
        pessoa.valida();
    }
}
