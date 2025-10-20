# Sistema de Gerenciamento de Atendimento ao Cliente

Este projeto em Java simula um sistema de atendimento ao cliente utilizando estrutura de dados do tipo lista encadeada para implementar uma fila (ordem de atendimento) e uma pilha (histórico de solicitações).


## Funcionalidades

- **Adicionar cliente à fila**: permite incluir clientes que aguardam atendimento.
- **Atender próximo cliente**: remove o cliente da frente da fila e adiciona sua solicitação ao histórico.
- **Visualizar fila de espera**: exibe todos os clientes na fila na ordem de chegada.
- **Adicionar solicitação diretamente ao histórico**: insere uma solicitação na pilha sem passar pela fila.
- **Visualizar histórico de solicitações**: mostra todas as solicitações atendidas (topo → base).
- **Remover última solicitação do histórico**: remove a solicitação mais recente da pilha.
- **Sair do sistema**: encerra o programa.


## Estrutura do Projeto

- `Elemento.java` – representa um cliente ou solicitação.  
- `Node.java` – node da lista encadeada, usado na fila e na pilha.  
- `Fila.java` – implementa a fila de clientes (FIFO).  
- `Pilha.java` – implementa a pilha de histórico de solicitações (LIFO).  
- `Main.java` – contém o menu interativo para uso do sistema.


## Como usar

1. Compile todos os arquivos `.java`:
```bash
javac *.java
Execute o programa:

java org.example.Main
Siga o menu para adicionar clientes, atender, visualizar fila/histórico e remover solicitações.

Observações
O sistema é totalmente interativo pelo terminal.

A fila e a pilha utilizam lista encadeada, permitindo consultar a qualquer momento a ordem de atendimento e o histórico de solicitações.
