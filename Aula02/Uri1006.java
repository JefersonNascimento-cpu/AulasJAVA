import java.util.Scanner;

/**
 * Uri1006
 */
public class Uri1006 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1a, n1b, n1c, nota;

        n1a = entrada.nextDouble();
        n1b = entrada.nextDouble();
        n1c = entrada.nextDouble();
        
        nota = (n1a*2 + n1b*3 + n1c*5) / 10;
        System.out.printf("MEDIA = %.1f\n", nota);

        entrada.close();

    }
}