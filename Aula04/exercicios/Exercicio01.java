package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String resp;

        System.out.printf("Digite o Número: ");
        num = entrada.nextInt();

        resp = numPar(num);
        System.out.println(resp);

        entrada.close();
    }
    public static String numPar(int a) {
        String resposta;

        if (a % 2 == 0) {
            resposta = "Número Par!";
        } else {
                resposta = "Número Impar!";
        }
        return resposta;
    }

}
