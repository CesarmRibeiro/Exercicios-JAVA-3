package Exercicios3;

import javax.swing.JOptionPane;

public class B {
    public static void main(String[] args) {
        double num, padrao = 0;
             int contador = 0;

                do {
                    num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero ou digite o 0 para encerrar: "));
                    padrao += num;
                    contador++;
                } while (num != 0);
            }
}