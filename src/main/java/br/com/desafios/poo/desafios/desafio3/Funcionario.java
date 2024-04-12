package org.example;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Funcionario(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public double obterSalarioLiquido() {
        return salarioBruto - (salarioBruto * taxa);
    }

    public void aumentoSalario(double percentage) {
        salarioBruto += salarioBruto * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário Bruto: " + salarioBruto + ", Salário Líquido: " + obterSalarioLiquido();
    }
}
