package org.example;

import org.example.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Gabriel", 3000, 0.15);
        Funcionario funcionario2 = new Funcionario("Maria", 4000, 0.20);


        System.out.println("Detalhes dos funcionarios antes do aumento");
        System.out.println("org.example.Funcionario 1: " + funcionario1);
        System.out.println("org.example.Funcionario 2: " + funcionario2);


        funcionario1.aumentoSalario(10);

        System.out.println("\nDetalhes dos funcionarios apos do aumento");
        System.out.println("org.example.Funcionario 1: " + funcionario1);
        System.out.println("org.example.Funcionario 2: " + funcionario2);

        System.out.println("\nSalarios liquidos:");
        System.out.println("funcionario 1: " + funcionario1.obterSalarioLiquido());
        System.out.println("funcionario 2: " + funcionario2.obterSalarioLiquido());
    }
}
