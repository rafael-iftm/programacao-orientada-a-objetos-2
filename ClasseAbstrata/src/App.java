import java.util.Arrays;
import java.util.List;

import domain.Pessoa;
import domain.PessoaEstrangeira;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa rafael = new PessoaFisica();
        Pessoa iftm = new PessoaJuridica();
        Pessoa lewisHamilton = new PessoaEstrangeira();

        List<Pessoa> pessoas = Arrays.asList(rafael,iftm,lewisHamilton);

        for (Pessoa pessoa: pessoas) {
            chamaValidacao(pessoa);
        }
    }

    private static void chamaValidacao(Pessoa pessoa) {
        if (pessoa instanceof PessoaEstrangeira) {
            return;
        }
        pessoa.valida();
    }
}
