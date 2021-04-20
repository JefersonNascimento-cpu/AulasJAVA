package exercicios;

import java.util.Scanner;

// F2 para trocar uma variável em vários lugares
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorInteiro;
        double valorDecimal;

        System.out.println("Digite o Valor Inteiro: ");
        valorInteiro = entrada.nextInt();
        System.out.println("Digite o Valor Decimal: "); //digite com virgula
        valorDecimal = entrada.nextDouble();

        System.out.println("Você digitou " + valorInteiro + " e " + valorDecimal);

        entrada.close();
    }
}
