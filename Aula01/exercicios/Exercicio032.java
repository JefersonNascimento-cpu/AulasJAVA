package exercicios;

import java.util.Scanner;

public class Exercicio032 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double atual, aumento;

        System.out.println("Digite o Salário: ");
        atual = entrada.nextDouble();
        aumento = (atual *25) /100; 
        System.out.println("Salário com Aumento: " + (atual + aumento));

        entrada.close();

    }
}
