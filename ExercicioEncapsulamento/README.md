# Sistema de Precificação de Produtos

Este projeto em Java é um sistema simples para cálculo de preços de produtos, levando em consideração diferentes tipos de clientes e aplicando descontos, impostos e taxas adicionais.

## Estrutura do Projeto

- **Cliente**: Classe abstrata que representa um cliente genérico. Contém o método abstrato `aplicarDesconto` que deve ser implementado por subclasses.
- **ClienteFisico**: Subclasse de `Cliente`, representa um cliente do tipo Pessoa Física e implementa um desconto específico.
- **ClienteJuridico**: Subclasse de `Cliente`, representa um cliente do tipo Pessoa Jurídica e implementa um desconto específico.
- **Produto**: Classe que representa um produto, contendo métodos para aplicar impostos, taxas adicionais e calcular o preço final considerando o tipo de cliente.
- **App**: Classe principal que executa o programa e demonstra o cálculo de preços para diferentes tipos de clientes.

## Requisitos

- **Java 8+**: Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

## Como Compilar e Executar

### 1. Clonar o Repositório

Primeiro, clone o repositório para sua máquina local usando o seguinte comando:

```bash
git clone https://github.com/rafael-iftm/programacao-orientada-a-objetos-2.git
```

### 2. Navegar até o Diretório do Projeto

```bash
cd programacao-orientada-a-objetos-2/ExercicioEncapsulamento
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

O programa imprimirá os preços finais calculados para diferentes tipos de clientes no console:

```bash
Preço final para Rafael: 3020.0
Preço final para Empresa do Rafael: 2690.0
```

## Explicação das Mudanças

Neste projeto, a lógica de precificação foi distribuída de forma mais coesa e encapsulada, removendo a classe Precificacao e delegando responsabilidades específicas para as classes Produto e Cliente. A classe Produto agora contém métodos para calcular o preço final, enquanto os diferentes tipos de Cliente aplicam seus próprios descontos.