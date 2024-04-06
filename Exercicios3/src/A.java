package Exercicios3;

import javax.swing.JOptionPane;

public class A {
    public static void main(String[] args) {
        double a1 , a2;
          int contador = 1;
                do {
                    a1 =
                            Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
                    a2 =
                            Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
                    JOptionPane.showMessageDialog(null, "Média: " + ((a1 + a2)/2));
                    contador = contador + 1;
                } while (contador <=5);
                System.out.println("Fim do Programa!");
            }
}
