# Sistema de Produção e Consumo com Depósito

Este projeto simula um sistema de produção e consumo em um depósito, onde um produtor adiciona caixas e um consumidor as retira em intervalos regulares de tempo. O programa foi implementado em Java e utiliza threads para simular a concorrência entre produção e consumo.

## Estrutura do Projeto

### Classes

1. **Deposito**:
    - Representa o armazenamento das caixas.
    - Atributos:
        - `items`: o número de caixas atualmente no depósito.
        - `capacidade`: capacidade máxima do depósito (10 caixas).
    - Métodos:
        - `colocar()`: adiciona uma caixa ao depósito, se houver espaço.
        - `retirar()`: retira uma caixa do depósito, se houver caixas.

2. **Produtor**:
    - Representa uma thread que adiciona caixas ao depósito.
    - Implementa a interface `Runnable`.
    - Atributos:
        - `deposito`: referência ao depósito compartilhado.
        - `tempoEntreProducao`: intervalo em segundos entre cada produção.
    - Método `run()`:
        - Executa continuamente a lógica de produção, adicionando uma caixa ao depósito e aguardando o tempo especificado.

3. **Consumidor**:
    - Representa uma thread que retira caixas do depósito.
    - Extende a classe `Thread`.
    - Atributos:
        - `deposito`: referência ao depósito compartilhado.
        - `tempoEntreConsumo`: intervalo em segundos entre cada consumo.
    - Método `run()`:
        - Executa continuamente a lógica de consumo, retirando uma caixa do depósito e aguardando o tempo especificado.

4. **Main**:
    - Classe principal do programa.
    - Cria e inicia as threads de produção e consumo, configurando o intervalo entre as operações.

## Como Executar

1. Compile o código-fonte com o comando:

   ```bash
   javac Main.java
