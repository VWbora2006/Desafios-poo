package br.com.desafios.poo.desafios.desafio2;

import br.com.desafios.poo.desafios.desafio2.ServicoTarefa;
import br.com.desafios.poo.desafios.desafio2.Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoTarefa servico = new ServicoTarefa();

        int opcao;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Visualizar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da tarefa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    Tarefa tarefa = new Tarefa(nome, descricao);
                    if (servico.adicionarTarefa(tarefa)) {
                        System.out.println("Tarefa adicionada com sucesso.");
                    } else {
                        System.out.println("Já existe uma tarefa com esse nome.");
                    }
                    break;
                case 2:
                    System.out.println("\nTarefas cadastradas:");
                    servico.visualizarTarefas();
                    break;
                case 3:
                    System.out.print("Digite o nome da tarefa que deseja remover: ");
                    String nomeTarefa = scanner.nextLine();
                    if (servico.removerTarefa(nomeTarefa)) {
                        System.out.println("Tarefa removida com sucesso.");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Valor inválido, por favor digite uma opção válida");
            }
        } while (opcao != 4);
        scanner.close();
    }
}