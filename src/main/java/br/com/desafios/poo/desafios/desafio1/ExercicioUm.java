package br.com.desafios.poo.desafios.desafio1;

import javax.swing.*;

public class ExercicioUm {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o numero");
        int numero = Integer.parseInt(input);

        if (numero > 0) {
            JOptionPane.showInputDialog(null, "Numero positivo");
        } else if (numero < 0) {
            JOptionPane.showInputDialog(null,"Numero negativo");
        } else {
            JOptionPane.showInputDialog(null, "Numero zero");
        }
    }
}
