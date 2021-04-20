package exercicios;

import java.util.Scanner;

public class Exercicio031 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite Nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite Nota 2: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) /2;
        
        System.out.println("Sua nota foi: " + media);

        entrada.close();
    }
}
