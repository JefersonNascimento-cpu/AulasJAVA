import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double t1, t2, media1, media2;



        for (t1 = 0; t1 < 2; t1++) {
            System.out.println("Digite a Nota:" + t1);
            t1 = entrada.nextDouble();
            media1 = +t1;
                for (t2 = 0; t2 < 2; t2++) {
                System.out.println("Digite a Nota:" + t2);
                t2 = entrada.nextDouble();
                media2 = +t2;
            }
        }
        System.out.println((media1/));

        entrada.close();
    }
}
