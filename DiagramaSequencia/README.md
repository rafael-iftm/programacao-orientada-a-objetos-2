# Análise da Pasta DiagramaSequencia

## Estrutura de Pastas e Arquivos

```
📦 DiagramaSequencia
┣ 📂 .vscode
┃ ┗ 📜 settings.json
┣ 📂 bin
┃ ┣ 📂 exemplo1
┃ ┃ ┣ 📜 Cliente.class
┃ ┃ ┣ 📜 LinhaDePedido.class
┃ ┃ ┣ 📜 Pedido.class
┃ ┃ ┗ 📜 Produto.class
┃ ┗ 📜 App.class
┣ 📂 src
┃ ┣ 📂 exemplo1
┃ ┃ ┣ 📜 Cliente.java
┃ ┃ ┣ 📜 LinhaDePedido.java
┃ ┃ ┣ 📜 Pedido.java
┃ ┃ ┗ 📜 Produto.java
┃ ┣ 📂 exemplo2
┃ ┃ ┣ 📜 Cliente.java
┃ ┃ ┣ 📜 LinhaDePedido.java
┃ ┃ ┣ 📜 Pedido.java
┃ ┃ ┗ 📜 Produto.java
┃ ┗ 📜 App.java
┗ 📜 README.md
```


## Descrição

A pasta `DiagramaSequencia` contém um exemplo de implementação de um sistema de pedidos em Java, dividido em duas abordagens distintas (exemplo1 e exemplo2). O objetivo é demonstrar diferentes maneiras de estruturar e implementar funcionalidades similares.

## Detalhes do Conteúdo

### Pasta `.vscode`

- Contém o arquivo `settings.json`, que pode ser utilizado para configurar o ambiente de desenvolvimento no Visual Studio Code.

### Pasta `bin`

- Armazena os arquivos compilados das classes Java, incluindo os arquivos `.class` correspondentes às classes `Cliente`, `LinhaDePedido`, `Pedido`, `Produto` e `App`.

### Pasta `src`

- Contém o código-fonte Java das duas abordagens do sistema de pedidos:
  - `exemplo1`: Implementação da primeira abordagem do sistema de pedidos, com as classes `Cliente`, `LinhaDePedido`, `Pedido`, `Produto`.
  - `exemplo2`: Implementação da segunda abordagem do sistema de pedidos, com as mesmas classes `Cliente`, `LinhaDePedido`, `Pedido`, `Produto`.

- Cada subpasta contém arquivos `.java` correspondentes às classes mencionadas acima.

### Arquivo `README.md`

- Fornece uma descrição da estrutura da pasta `DiagramaSequencia` e uma breve explicação sobre o conteúdo do projeto.

## Observações

O projeto exemplifica a organização de código-fonte em Java, demonstrando diferentes abordagens para resolver um problema comum. Observar e comparar as duas implementações pode ser útil para entender como diferentes decisões de design podem influenciar a estrutura e o funcionamento de um sistema.

## Abordagens Implementadas

### Exemplo 1

Na abordagem do exemplo 1, o cálculo do preço final de um pedido é realizado dentro da classe `Pedido`. Aqui, o desconto é aplicado com base nas informações do cliente. A classe `Cliente` possui um método `obterInformacaoDesconto()`, que retorna o percentual de desconto do cliente. Esse desconto é então aplicado ao preço base de cada item do pedido.

### Exemplo 2

Já na abordagem do exemplo 2, a responsabilidade pelo cálculo do preço final é distribuída de forma diferente. A classe `Pedido` ainda é responsável por calcular o preço total do pedido, mas o desconto não é aplicado diretamente nela. Em vez disso, o desconto é aplicado na classe `Cliente`.

Na classe `Cliente`, há um método `obterValorComDesconto(Double precoBase)` que recebe o preço base do pedido e retorna o valor com desconto aplicado. Essa abordagem coloca a responsabilidade de aplicar o desconto no cliente, o que pode ser visto como uma separação de preocupações.

## Comparação e Considerações

Ao comparar as duas abordagens, podemos observar como diferentes decisões de design podem impactar a estrutura e o funcionamento do sistema:

- **Divisão de Responsabilidades:** No exemplo 1, a responsabilidade pelo cálculo do preço e aplicação do desconto é atribuída à classe `Pedido`, enquanto no exemplo 2, essa responsabilidade é dividida entre as classes `Pedido` e `Cliente`.

- **Flexibilidade e Manutenção:** A abordagem do exemplo 2 pode ser mais flexível em termos de manutenção, permitindo alterações nas regras de desconto com menos impacto no código.

- **Acoplamento e Coesão:** A abordagem do exemplo 2 pode levar a um acoplamento menor entre as classes e a uma maior coesão, já que cada classe tem uma responsabilidade mais claramente definida.

Explorar e comparar essas diferentes abordagens pode ajudar os desenvolvedores a entenderem melhor as vantagens e desvantagens de diferentes decisões de design e como elas podem impactar o desenvolvimento e a manutenção de um sistema ao longo do tempo.