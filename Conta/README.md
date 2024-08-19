# Projeto de Sistema Bancário

Este projeto é um exemplo de sistema bancário simples implementado em Java. Ele simula operações básicas como criação de contas, saques, depósitos e cobrança de tarifas, utilizando o conceito de classes abstratas, interfaces e exceções personalizadas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Agencia.java**: Representa uma agência bancária que gerencia várias contas. Permite adicionar contas, realizar saques, depósitos e cobrar tarifas.
- **Conta.java**: Classe abstrata que define a estrutura básica de uma conta bancária, incluindo métodos para saque, depósito e manipulação de saldo.
- **ContaCorrente.java**: Representa uma conta corrente, que possui um limite de cheque especial e implementa a interface `Tarifavel`.
- **ContaPoupanca.java**: Representa uma conta poupança, com métodos para atualizar o rendimento e cobrar tarifas.
- **ContaSalario.java**: Representa uma conta salário, que não permite cobrança de tarifas.
- **Tarifavel.java**: Interface que define o método `tarifar` para contas que podem ser tarifadas.
- **ContaException.java**: Classe de exceção personalizada para tratar erros relacionados a operações de conta.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Criar Contas**: Permite a criação de diferentes tipos de contas (corrente, poupança, salário) associadas a uma agência bancária.
- **Realizar Saques**: Permite realizar saques em uma conta específica, com validação de saldo disponível.
- **Realizar Depósitos**: Permite realizar depósitos em uma conta específica.
- **Cobrar Tarifas**: Aplica tarifas às contas que implementam a interface `Tarifavel`.
- **Tratamento de Exceções**: Lida com erros comuns como saldo insuficiente ou valores inválidos para saque e depósito.

## Como Executar

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior.

## Como Compilar e Executar

### 1. Clonar o Repositório

Primeiro, clone o repositório para sua máquina local usando o seguinte comando:

```bash
git clone https://github.com/rafael-iftm/programacao-orientada-a-objetos-2.git
```

### 2. Navegar até o Diretório do Projeto

```bash
cd programacao-orientada-a-objetos-2/Conta
```

### 3. Compilar o Código

Dentro do diretório src, compile o código Java usando o seguinte comando:

```bash
javac -d ../bin src/*.java
```

Este comando compilará todos os arquivos .java dentro do diretório src e colocará os arquivos .class compilados no diretório bin.

### 4. Executar o Programa

Após a compilação, execute o programa a partir do diretório bin:

```bash
java -cp bin App
```

### 5. Verificar a Saída

A saída do programa pode ser algo como:
```bash
-> Tarifas cobradas com sucesso.
-> Saque de R$ 50.0 realizado com sucesso -> Saldo atual: R$ 147.0
-> Saque de R$ 100.0 realizado com sucesso -> Saldo atual: R$ 195.0
-> Saque de R$ 150.0 realizado com sucesso -> Saldo atual: R$ 245.0
-> Saque de R$ 200.0 realizado com sucesso -> Saldo atual: R$ 300.0
```


