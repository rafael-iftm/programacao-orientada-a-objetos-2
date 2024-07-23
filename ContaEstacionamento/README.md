# Projeto Estacionamento

## Descrição

Este projeto em Java calcula o valor da conta de estacionamento para veículos de passeio e carga. A estrutura do projeto é modularizada, com diferentes classes responsáveis por representar veículos, calcular a duração do estacionamento, definir tarifas e calcular o valor da conta.

## Estrutura do Projeto

```
📦src
┣ 📂model
┃ ┣ 📜Veiculo.java
┃ ┣ 📜Passeio.java
┃ ┗ 📜Carga.java
┣ 📂service
┃ ┣ 📜ContaEstacionamento.java
┃ ┣ 📜Duracao.java
┃ ┣ 📜CalculoTarifa.java
┃ ┗ 📜Tarifa.java
┣ 📂controller
┃ ┗ 📜Estacionamento.java
┗ 📜App.java
```


### model

- **Veiculo.java**: Classe abstrata base para todos os veículos, contendo o atributo `placa`.
- **Passeio.java**: Subclasse de `Veiculo` representando veículos de passeio.
- **Carga.java**: Subclasse de `Veiculo` representando veículos de carga.

### service

- **Duracao.java**: Classe para calcular a duração do estacionamento em horas, dias e meses.
- **Tarifa.java**: Classe para definir as tarifas por hora, dia e mês.
- **CalculoTarifa.java**: Classe para calcular a tarifa com base no tipo de veículo e na duração.
- **ContaEstacionamento.java**: Classe para calcular o valor da conta de estacionamento usando `Duracao` e `CalculoTarifa`.

### controller

- **Estacionamento.java**: Classe controladora para gerenciar as operações de estacionamento.

### App

- **App.java**: Classe principal que instancia os objetos e calcula o valor da conta de estacionamento.

## Como Executar

1. **Compile o projeto**:
    ```bash
    javac -d bin model/*.java service/*.java controller/*.java App.java
    ```

2. **Execute o projeto**:
    ```bash
    java -cp bin App
    ```
