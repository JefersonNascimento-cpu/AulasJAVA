import java.util.Scanner;

public class Exemplo032 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, media;

        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();

        media = n1 * 0.4 + n2 * 0.6;
        
        if (media >= 6) {        
            System.out.println("Aprovado com: " + media);
                    } else {
                        System.out.println("Reprovado com: " + media);
        }

        entrada.close();
    }
}
