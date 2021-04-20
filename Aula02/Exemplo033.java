import java.util.Scanner;

public class Exemplo033 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b;

        a = entrada.nextFloat();
        b = entrada.nextFloat();

        if (a < b) {
            System.out.println("Ordem dos números é essa: " + a + " - " + b);
        } else {
            System.out.println("Ordem dos números é essa: " + b + " - " + a);
        }

        entrada.close();

    }
}
