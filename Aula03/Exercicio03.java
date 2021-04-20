import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, count;

        n = entrada.nextInt();
        count = 1;

        while (count <= n) {
            System.out.printf("%d", count);
            count *=2;
            if (count <= n) {
                System.out.printf(", ", count);
            }
        }

        entrada.close();
    }
}
