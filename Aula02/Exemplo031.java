import java.util.Scanner;

public class Exemplo031 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;

        n1 = entrada.nextInt();

        if (n1 > 20) {
            System.out.println("Metade do Valor: " + ((double)n1 / 2)); //promote temporario para double (somente nesta lina)
        }

        entrada.close();
    }
}
