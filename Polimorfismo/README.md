# Projeto de Exemplo de Polimorfismo em Java

Este projeto de exemplo ilustra o conceito de polimorfismo em Java, apresentando duas abordagens distintas: uma utilizando polimorfismo e outra sem. Através da análise e comparação das duas implementações, é possível entender como o polimorfismo pode simplificar o código e melhorar sua manutenibilidade.

## Estrutura do Projeto
```
📦 Polimorfismo
┣ 📂 .vscode
┃ ┗ 📜 settings.json
┣ 📂 bin
┃ ┣ 📂 domain
┃ ┃ ┣ 📜 Pessoa.class
┃ ┃ ┣ 📜 PessoaEstrangeira.class
┃ ┃ ┣ 📜 PessoaFisica.class
┃ ┃ ┗ 📜 PessoaJuridica.class
┃ ┣ 📜 App.class
┃ ┗ 📜 AppSemPolimorfismo.class
┣ 📂 lib
┣ 📂 src
┃ ┣ 📂 domain
┃ ┃ ┣ 📜 Pessoa.java
┃ ┃ ┣ 📜 PessoaEstrangeira.java
┃ ┃ ┣ 📜 PessoaFisica.java
┃ ┃ ┗ 📜 PessoaJuridica.java
┃ ┣ 📜 App.java
┃ ┗ 📜 AppSemPolimorfismo.java
┗ 📜 README.md
```


## Descrição

O projeto de exemplo demonstra a estrutura de um sistema de gerenciamento de pessoas, onde cada tipo de pessoa (física, jurídica, estrangeira) possui suas próprias características e métodos de validação. A implementação utiliza o conceito de herança e polimorfismo para lidar com diferentes tipos de pessoas de forma mais flexível e eficiente.

## Detalhes do Conteúdo

### Arquivos Java na pasta `domain`

- `Pessoa.java`: Classe base que representa uma pessoa comum, contendo atributos comuns como código e nome, e um método de validação genérico.
- `PessoaFisica.java`: Classe que herda de `Pessoa` e adiciona o atributo `cpf`, com implementação específica do método de validação para pessoas físicas.
- `PessoaJuridica.java`: Classe que herda de `Pessoa` e adiciona o atributo `cnpj`, com implementação específica do método de validação para pessoas jurídicas.
- `PessoaEstrangeira.java`: Classe que herda de `Pessoa` e adiciona o atributo `passaporte`, com implementação específica do método de validação para pessoas estrangeiras.

### Arquivos Java na pasta raiz

- `App.java`: Implementação do aplicativo com polimorfismo, onde diferentes tipos de pessoas são tratados de forma genérica através da classe base `Pessoa`.
- `AppSemPolimorfismo.java`: Implementação do aplicativo sem polimorfismo, onde é necessário usar condicionais para tratar cada tipo de pessoa separadamente.

## Comparação e Considerações

- **Polimorfismo vs. Condicionais:** O uso do polimorfismo permite tratar diferentes tipos de objetos de forma uniforme, simplificando o código e tornando-o mais flexível e extensível.
- **Manutenibilidade:** A abordagem com polimorfismo tende a ser mais fácil de manter e estender, pois novos tipos de pessoas podem ser adicionados sem a necessidade de modificar o código existente.
- **Legibilidade e Clareza:** O código com polimorfismo tende a ser mais legível e claro, pois reflete melhor a estrutura do problema e a lógica de negócios.

Explorar e comparar essas diferentes abordagens pode ajudar os desenvolvedores a entenderem melhor as vantagens do polimorfismo e como aplicá-lo de forma eficaz em seus projetos.
