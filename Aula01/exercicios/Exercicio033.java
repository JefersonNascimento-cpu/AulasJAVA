package exercicios;

import java.util.Scanner;

public class Exercicio033 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, quilowatt,total, desconto, novovalor;

        System.out.println("Digite o Valor do Salário Mínimo: ");
        salario = entrada.nextDouble();
        salario = salario / 500;
        System.out.println("Digite Quilowat Consumidos: ");
        quilowatt = entrada.nextDouble();

        System.out.println("Valor de Cada Quilowatt: " + salario);
        System.out.println("Valor a ser Pago: " + (salario * quilowatt));
        total = (salario * quilowatt);
        desconto = (total*15) /100;
        novovalor = (total - desconto);
        System.out.println("Valor com desconto a ser pago: " + novovalor);
        
        entrada.close();
        }
}
