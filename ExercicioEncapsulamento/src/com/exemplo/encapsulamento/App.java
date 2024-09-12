package com.exemplo.encapsulamento;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00);

        Cliente cliente1 = new ClienteFisico("Rafael");
        Cliente cliente2 = new ClienteJuridico("Empresa do Rafael");

        double precoFinalPessoaFisica = produto.calcularPrecoFinal(cliente1);
        double precoFinalPessoaJuridica = produto.calcularPrecoFinal(cliente2);

        logger.info("Preço final para " + cliente1.getNome() + ": " + precoFinalPessoaFisica);
        logger.info("Preço final para " + cliente2.getNome() + ": " + precoFinalPessoaJuridica);
    }
}
