# Projeto Conta Bancária

## Descrição
Este projeto é um sistema básico de gerenciamento de contas bancárias, incluindo operações como depósito, saque e cálculo de rendimento.

## Estrutura do Projeto

- **`Principal`**: Classe principal que executa o programa e fornece um menu de opções para o usuário.
- **`Conta`**: Classe que representa uma conta bancária com informações como nome do titular, número da conta, agência, data de abertura e saldo.
- **`OperacoesConta`**: Classe responsável pelas operações bancárias, como depósitos, saques e cálculo de rendimento.

## Classes e Métodos

### `Principal`

- **`main(String[] args)`**: Método principal que executa o programa e exibe o menu de opções para o usuário.

### `Conta`

- **`Conta()`**: Construtor padrão que inicializa o saldo com 0 e a data de abertura com a data atual.
- **`Conta(String nome, int numero, int agencia)`**: Construtor que inicializa uma nova conta com o nome, número e agência fornecidos.
- **`cadastrarConta()`**: Realiza o cadastro da conta, gerando agência e número aleatórios e solicitando o nome do titular.
- **`mostrarConta()`**: Exibe as informações da conta.

#### Getters e Setters

- **`getNome()`**: Retorna o nome do titular da conta.
- **`setNome(String nome)`**: Define o nome do titular da conta.
- **`getNumero()`**: Retorna o número da conta.
- **`setNumero(int numero)`**: Define o número da conta.
- **`getAgencia()`**: Retorna a agência da conta.
- **`setAgencia(int agencia)`**: Define a agência da conta.
- **`getDataAbertura()`**: Retorna a data de abertura da conta.
- **`setDataAbertura(LocalDate dataAbertura)`**: Define a data de abertura da conta.
- **`getSaldo()`**: Retorna o saldo da conta.
- **`setSaldo(double saldo)`**: Define o saldo da conta.

### `OperacoesConta`

- **`OperacoesConta(Conta conta)`**: Construtor que inicializa a classe com uma instância de `Conta`.
- **`depositar()`**: Realiza um depósito na conta.
- **`sacarSaldo()`**: Realiza um saque na conta.
- **`calcularRendimento()`**: Calcula o rendimento mensal da conta com base em uma taxa fixa de 10%.

#### Métodos Privados

- **`ePossivelSacar(double valor)`**: Verifica se é possível realizar um saque com o valor fornecido.

## Como Executar

1. Clone o repositório: `git clone https://github.com/username/repository.git`
2. Compile o código: `javac -d bin src/contabancaria/*.java src/contabancaria/conta/*.java src/contabancaria/operacoes/*.java`
3. Execute o programa: `java -cp bin contabancaria.Principal`

## Contribuições

Sinta-se à vontade para contribuir com melhorias e correções. Para isso, siga as diretrizes de contribuição descritas no arquivo `CONTRIBUTING.md`.

## Licença
Este projeto está licenciado sob a [Licença MIT](LICENSE).

