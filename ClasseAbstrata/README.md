# Projeto de Exemplo de Classe Abstrata em Java

Este projeto de exemplo ilustra o uso de classes abstratas em Java para criar uma estrutura comum para diferentes tipos de pessoas. As classes `PessoaFisica` e `PessoaJuridica` herdam da classe abstrata `Pessoa`, implementando métodos específicos para validar os dados de cada tipo de pessoa.

## Estrutura do Projeto

```
📦 ClasseAbstrata
┣ 📂 .vscode
┃ ┗ 📜 settings.json
┣ 📂 bin
┃ ┣ 📂 domain
┃ ┃ ┣ 📜 Pessoa.class
┃ ┃ ┣ 📜 PessoaFisica.class
┃ ┃ ┣ 📜 PessoaJuridica.class
┃ ┃ ┗ 📜 PessoaEstrangeira.class
┃ ┗ 📜 App.class
┣ 📂 lib
┣ 📂 src
┃ ┣ 📂 domain
┃ ┃ ┣ 📜 Pessoa.java
┃ ┃ ┣ 📜 PessoaFisica.java
┃ ┃ ┣ 📜 PessoaJuridica.java
┃ ┃ ┗ 📜 PessoaEstrangeira.java
┃ ┗ 📜 App.java
┗ 📜 README.md
```

## Descrição

O projeto utiliza uma classe abstrata `Pessoa` como modelo genérico para representar qualquer tipo de pessoa. Essa classe contém um método abstrato `validaAbstract()`, que deve ser implementado pelas subclasses para realizar a validação específica de cada tipo de pessoa. Além disso, a classe abstrata possui um método `valida()` que chama o método abstrato e realiza validações genéricas comuns a todas as pessoas.

## Detalhes do Conteúdo

### Arquivos Java na pasta `domain`

- `Pessoa.java`: Classe abstrata que define uma estrutura comum para diferentes tipos de pessoas. Contém métodos genéricos e abstratos para validação.
- `PessoaFisica.java`: Classe que herda de `Pessoa` e implementa o método abstrato `validaAbstract()` para validar dados específicos de pessoas físicas, como o CPF.
- `PessoaJuridica.java`: Classe que herda de `Pessoa` e implementa o método abstrato `validaAbstract()` para validar dados específicos de pessoas jurídicas, como o CNPJ.
- `PessoaEstrangeira.java`: Classe que herda de `Pessoa` e implementa o método abstrato `validaAbstract()` para validar dados específicos de pessoas estrangeiras, como o passaporte.

### Arquivo Java na pasta raiz

- `App.java`: Implementação do aplicativo que instancia objetos de `PessoaFisica`, `PessoaJuridica` e `PessoaEstrangeira`, demonstrando o uso da classe abstrata e dos métodos de validação.

## Comparação e Considerações

- **Uso de Classe Abstrata:** A classe abstrata `Pessoa` fornece uma estrutura comum para diferentes tipos de pessoas, permitindo a implementação de métodos específicos em suas subclasses.
- **Flexibilidade e Extensibilidade:** O uso de classes abstratas permite que novos tipos de pessoas sejam facilmente adicionados ao sistema, mantendo a coesão e o encapsulamento dos dados.
- **Padrão Template Method:** A classe abstrata `Pessoa` utiliza o padrão Template Method para definir uma estrutura comum de validação, com partes do algoritmo definidas na classe base e partes específicas implementadas nas subclasses.

## Quebra de Herança

A quebra de herança ocorre na classe `PessoaEstrangeira`, que implementa um comportamento específico de validação para pessoas estrangeiras, mas não herda o comportamento de verificação de nome sujo das outras subclasses. Isso é demonstrado pelo lançamento de uma exceção não suportada no método `isNomeSujo()`. Essa abordagem garante a coesão e a consistência do código, evitando a implementação de métodos desnecessários para determinados tipos de objetos.

Explorar e entender o uso de classes abstratas em Java é fundamental para criar hierarquias de classes flexíveis e extensíveis em seus projetos.
