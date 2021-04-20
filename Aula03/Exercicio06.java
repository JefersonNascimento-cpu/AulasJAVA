import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v1, cont, contPar, somaPar;

        contPar = 0;
        somaPar = 0;

        for (cont = 0; cont <= 2; cont++) {
            System.out.println("Digite o " + cont + "º número: ");
            v1 = entrada.nextInt();

            if (v1 % 2 == 0) {
                contPar++;
                somaPar = (v1 + somaPar);
            }
        }
        System.out.println("A média de pares é:" + ((double)somaPar/contPar));
        System.out.println("A média de ímpares é:" + ((double)(v1 - contPar)/contPar);
    }
}
