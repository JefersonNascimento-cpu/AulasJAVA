package exercicios;

import java.util.Scanner;

public class Exercicio034 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custo, impostodistribuidor, custofinal, impostogov;

        System.out.println("Digite o Custo de Fábrica do carro: ");
        custo = entrada.nextDouble();

        impostodistribuidor = custo * 0.28;
        impostogov = custo * 0.45;
        custofinal = (custo + impostodistribuidor + impostogov);

        System.out.println("Custo final do Veículo: " + custofinal);
        System.out.println("Valor do Imposto: " + impostogov);
        
        entrada.close();
    }
}
