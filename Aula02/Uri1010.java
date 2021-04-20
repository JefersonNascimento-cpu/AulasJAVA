import java.util.Scanner;

//Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
//o valor unitário de cada peça 1, o código de uma peça 2,
//o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int q1, q2;
        double v1, v2, t1, t2;

        entrada.nextInt();
        q1 = entrada.nextInt();
        v1 = entrada.nextDouble();

        entrada.nextInt();
        q2 = entrada.nextInt();
        v2 = entrada.nextDouble();

        t1 = q1 * v1;
        t2 = q2 * v2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (t1+t2));

        entrada.close();
    }
}
