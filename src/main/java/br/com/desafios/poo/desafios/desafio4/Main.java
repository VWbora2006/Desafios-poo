package br.com.desafios.poo.desafios.desafio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeroContaStr =JOptionPane.showInputDialog(null, "Insira o numero da conta:");
        int numeroConta = Integer.parseInt(numeroContaStr);

        String nomeTitular = JOptionPane.showInputDialog(null, "Insira o titular da conta:");

        int temDepositoInicial = JOptionPane.showConfirmDialog(null, "Existe deposito inicial?");
        double depositoInicial = 0;
        if (temDepositoInicial == JOptionPane.YES_OPTION) {
            String depositoInicialStr = JOptionPane.showInputDialog(null, "Insira o valor inicial:");
            depositoInicial = Double.parseDouble(depositoInicialStr);
        }

        var conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
        JOptionPane.showInputDialog(null, "Dados da Conta: " + conta);

        String valorDepositoStr = JOptionPane.showInputDialog(null, "Insira o valor de deposito:");
        double valorDeposito = Double.parseDouble(valorDepositoStr);
        conta.depositar(valorDeposito);
        JOptionPane.showConfirmDialog(null, "Dados da conta atualizado: " + conta);

        String valorSaqueStr = JOptionPane.showInputDialog(null, "Insira o valor saque:");
        double valorSaque = Double.parseDouble(valorSaqueStr);
        conta.sacar(valorSaque);
        JOptionPane.showInputDialog(null, "Dados da conta atualizado: " + conta);
    }

    private record ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        public void depositar(double valorDeposito) {
            
        }

        public void sacar(double valorSaque) {
        }
    }
}

