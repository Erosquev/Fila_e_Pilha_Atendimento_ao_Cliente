package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando a fila e a pilha
        Fila fila = new Fila();
        Pilha historico = new Pilha();

        boolean continuar = true;

        // Loop principal do menu
        while (continuar) {
            System.out.println("\n=== Sistema de Atendimento ao Cliente ===");
            System.out.println("1 - Adicionar cliente à fila");
            System.out.println("2 - Atender próximo cliente");
            System.out.println("3 - Mostrar fila de espera");
            System.out.println("4 - Adicionar solicitação diretamente ao histórico");
            System.out.println("5 - Mostrar histórico de solicitações");
            System.out.println("6 - Remover última solicitação do histórico");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    // Adiciona cliente à fila
                    Elemento cliente = new Elemento();
                    System.out.print("ID do cliente: ");
                    cliente.setId(sc.nextLine());
                    System.out.print("Nome do cliente: ");
                    cliente.setNome(sc.nextLine());
                    System.out.print("Motivo da solicitação: ");
                    cliente.setDescricao(sc.nextLine());

                    fila.adicionarCliente(cliente);
                    System.out.println("Cliente adicionado à fila!");
                    break;

                case 2:
                    // Atender próximo cliente da fila e adicionar ao histórico
                    if (!fila.conferirVazia()) {
                        fila.atenderProximoCliente();
                        System.out.println("Cliente atendido !");
                    } else {
                        System.out.println("Não há clientes para atender!");
                    }
                    break;

                case 3:
                    // Mostrar fila de espera
                    System.out.println("\n=== Fila de Espera ===");
                    fila.printarFila();
                    break;

                case 4:
                    // Adicionar solicitação diretamente ao histórico (pilha)
                    Elemento solicitacao = new Elemento();
                    System.out.print("ID da solicitação: ");
                    solicitacao.setId(sc.nextLine());
                    System.out.print("Descrição da solicitação: ");
                    solicitacao.setDescricao(sc.nextLine());
                    System.out.print("Data e hora da solicitação ");
                    solicitacao.setData(sc.nextLine());

                    historico.adicionarSolicitacao(solicitacao);
                    System.out.println("Solicitação adicionada ao histórico!");
                    break;

                case 5:
                    // Mostrar histórico de solicitações
                    System.out.println("\n=== Histórico de Solicitações ===");
                    historico.printarHistorico();
                    break;

                case 6:
                    // Remover última solicitação do histórico
                    if (!historico.conferirVazia()) {
                        historico.removerSolicitacao();
                        System.out.println("Última solicitação removida do histórico!");
                    } else {
                        System.out.println("O histórico já está vazio!");
                    }
                    break;

                case 7:
                    // Sai do sistema
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
