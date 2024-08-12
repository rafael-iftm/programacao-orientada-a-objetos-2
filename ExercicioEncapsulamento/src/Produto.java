import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produto {
    private String nome;
    private double precoBase;
    private static final double IMPOSTO = 0.1; // 10% de imposto
    private static final double TAXA_ADICIONAL = 50.0;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public BigDecimal aplicarImposto(BigDecimal preco) {
        return preco.multiply(BigDecimal.valueOf(1 + IMPOSTO));
    }

    public BigDecimal aplicarTaxaAdicional(BigDecimal preco) {
        return preco.add(BigDecimal.valueOf(TAXA_ADICIONAL));
    }

    public double calcularPrecoFinal(Cliente cliente) {
        BigDecimal precoComDesconto = BigDecimal.valueOf(cliente.aplicarDesconto(this.precoBase));
        BigDecimal precoComImposto = aplicarImposto(precoComDesconto);
        BigDecimal precoFinal = aplicarTaxaAdicional(precoComImposto);
        return precoFinal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
