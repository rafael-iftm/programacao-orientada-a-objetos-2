# Projeto Calculadora de Descontos

Este projeto implementa uma calculadora de descontos utilizando o padrão de projeto Strategy. A calculadora é capaz de aplicar diferentes estratégias de desconto com base no tipo de cliente.

## Estrutura do Projeto

O projeto consiste nas seguintes classes:

- `DescontoStrategy`: Interface que define o método `calcularDesconto()`.
- `DescontoClienteRegular`: Implementação da estratégia de desconto para clientes regulares.
- `DescontoClienteVIP`: Implementação da estratégia de desconto para clientes VIP.
- `DescontoFuncionario`: Implementação da estratégia de desconto para funcionários.
- `CalculadoraDescontos`: Classe principal que utiliza uma estratégia de desconto para calcular o desconto.
- `Main`: Classe de exemplo para demonstrar o uso da calculadora de descontos.

## Como Utilizar

### Passo 1: Compilar o Projeto
Utilize o compilador Java para compilar as classes:

```bash
javac *.java
```

### Passo 2: Executar o Projeto
Execute a classe Main para ver a aplicação das diferentes estratégias de desconto:

```bash
java Main
```
