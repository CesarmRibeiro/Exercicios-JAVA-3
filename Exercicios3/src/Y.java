package Exercicios3;

public class Y {
    public static void main(String[] args) {

        double salarioInicial = 1000.0; //R$1.000,00 (Salario)
        double bonus = 0.005; //0.5%

            int anoInicial = 2000;
            int anoFinal = 2017;

            double salarioAtual = salarioInicial;

            System.out.println("Ano\tSalario");

                for (int ano = anoInicial; ano <= anoFinal; ano++){
                        salarioAtual += salarioAtual * bonus; //Para adicionar o aumento anual
                        System.out.println(ano + "\tR$ " + String.format("%.2f,", salarioAtual));
                        bonus *=2; //Dobrar o aumento para proximo ano

            }
        }
}