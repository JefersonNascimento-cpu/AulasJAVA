import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, vezes;

        numero = entrada.nextInt();
        vezes = 0;

        while (vezes < 11) {
            System.out.println(numero + " x " + vezes + " = " + (vezes * numero));
            vezes++;
            //System.out.printf("%d x %02d = %2d\n", numero, vezes);
        }
        System.out.println("Fim");

        entrada.close();
    }
}
