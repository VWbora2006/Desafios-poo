package br.com.desafios.poo.desafios.desafio2;

import java.util.HashSet;
import java.util.Set;

public class ServicoTarefa {
    private Set<Tarefa> tarefas;

    public ServicoTarefa() {
        tarefas = new HashSet<>();
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        return tarefas.add(tarefa);
    }

    public boolean removerTarefa(String nome) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nome)) {
                tarefas.remove(tarefa);
                return true;
            }
        }
        return false;
    }

    public void visualizarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }
}