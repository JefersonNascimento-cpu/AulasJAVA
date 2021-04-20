import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, cont, contPar;

        contPar = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.println("Digite o " + cont + "º número: ");
            n1 = teclado.nextInt();

            if (n1 % 2 == 0) {
                contPar++;
            }
        }
        System.out.println("O total de pares é:" + contPar);
        System.out.println("O total de ímpares é:" + (cont - 1 - contPar));
        
        teclado.close();
    }
}
