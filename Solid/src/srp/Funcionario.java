package srp;

public class Funcionario {
    private Cargo cargo;
    private double salarioBase;

    public Funcionario(Cargo cargo, double salarioBase) {
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
