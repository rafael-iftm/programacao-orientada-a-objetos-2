# Projeto Solid

Este é um projeto simples que demonstra a aplicação dos princípios SOLID na programação orientada a objetos. O projeto consiste em uma calculadora de salários para funcionários com diferentes cargos.

## Estrutura do Projeto
```
📦Solid
┣ 📂.vscode
┣ 📂bin
┣ 📂lib
┣ 📂src
┃ ┣ 📂srp
┃ ┃ ┣ 📜CalculadoraDeSalario.java
┃ ┃ ┣ 📜Cargo.java
┃ ┃ ┣ 📜DezOuVintePorCento.java
┃ ┃ ┣ 📜Funcionario.java
┃ ┃ ┣ 📜QuinzeOuVinteCincoPorCento.java
┃ ┃ ┗ 📜RegraDeCalculo.java
┃ ┗ 📜App.java
┗ 📜README.md
```

Aqui está a organização dos arquivos:
- `src/srp`: Contém as classes relacionadas à regra de cálculo de salário.
- `App.java`: Arquivo principal para execução do programa.
- `README.md`: Este arquivo que você está lendo agora.

## Princípios SOLID

### 1. Princípio da Responsabilidade Única (SRP)
Cada classe neste projeto tem uma única responsabilidade bem definida. Por exemplo, a classe `CalculadoraDeSalario` é responsável apenas por calcular o salário dos funcionários com base em suas regras de cálculo.

### 2. Princípio Aberto/Fechado (OCP)
O código foi projetado de forma a permitir a extensão do comportamento sem modificar o código existente. Por exemplo, se quisermos adicionar uma nova regra de cálculo de salário, podemos fazer isso criando uma nova classe que implementa a interface `RegraDeCalculo`.

### 3. Princípio da Substituição de Liskov (LSP)
Embora não haja herança direta no código, o princípio LSP também se aplica quando temos interfaces que devem ser substituíveis por suas implementações sem afetar o comportamento do programa. Neste projeto, as classes que implementam a interface `RegraDeCalculo` são substituíveis entre si.

### 4. Princípio da Segregação de Interfaces (ISP)
Cada interface neste projeto tem um único método, seguindo o princípio ISP. Por exemplo, a interface `RegraDeCalculo` tem apenas o método `calcula`.

### 5. Princípio da Inversão de Dependência (DIP)
A classe `CalculadoraDeSalario` depende apenas de abstrações (`RegraDeCalculo`), não de implementações concretas. Isso permite que a implementação da regra de cálculo seja alterada sem afetar o código da `CalculadoraDeSalario`.

## Como Executar o Projeto

Para executar o projeto, siga estes passos:
1. Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema.
2. Navegue até o diretório `src` do projeto.
3. Compile o código-fonte executando o comando `javac srp/*.java`.
4. Execute o programa principal com o comando `java App.java`.

Isso é tudo! Agora você pode explorar o projeto e verificar como os princípios SOLID foram aplicados.
