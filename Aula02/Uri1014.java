import java.util.Scanner;

public class Uri1014 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int v1;
       double v2;

       v1 = entrada.nextInt();
       v2 = entrada.nextDouble();
    
       System.out.printf("%.3f km/l\n", (v1 / v2));


    entrada.close();
    }
}
