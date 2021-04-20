import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, resto1, resto2, resto3, resto4, resto5, resto6, qnt;

        resto1 = 0;
        resto2 = 0;
        resto3 = 0;
        resto4 = 0;
        resto5 = 0;
        resto6 = 0;
        
        n = entrada.nextInt();
        System.out.println(n);
        
        qnt = n / 100;
        resto1 = n % 100;
        System.out.printf("%d nota(s) de R$ 100,00 \n", qnt);

        qnt = resto1 / 50;
        resto2 = resto1 % 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", qnt);

        qnt = resto2 / 20;
        resto3 = resto2 % 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", qnt);

        qnt = resto3 / 10;
        resto4 = resto3 % 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", qnt);

        qnt = resto4 / 5;
        resto5 = resto4 % 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", qnt);

        qnt = resto5 / 2;
        resto6 = resto5 % 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", qnt);

        qnt = resto6 / 1;
        resto6 = resto6 % 1;
        System.out.printf("%d nota(s) de R$ 1,00\n", qnt);

        
       entrada.close();
    }
}
