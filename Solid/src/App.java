import srp.Cargo;
import srp.Funcionario;
import srp.CalculadoraDeSalario;

public class App {
    public static void main(String[] args) {
        Funcionario desenvolvedor = new Funcionario(Cargo.DESENVOLVEDOR, 4000.0);
        Funcionario dba = new Funcionario(Cargo.DBA, 2500.0);
        Funcionario tester = new Funcionario(Cargo.TESTER, 1800.0);

        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

        System.out.println("Salário do desenvolvedor: " + calculadora.calcula(desenvolvedor));
        System.out.println("Salário do DBA: " + calculadora.calcula(dba));
        System.out.println("Salário do tester: " + calculadora.calcula(tester));
    }
}

