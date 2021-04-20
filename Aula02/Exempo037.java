import java.util.Scanner;

public class Exempo037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a1, b1, c1;
        boolean ehtriangulo;
        String resposta;

        System.out.println("Digite os calores dos três lados:");
        a1 = entrada.nextInt();
        b1 = entrada.nextInt();
        c1 = entrada.nextInt();

        ehtriangulo = (a1 <= b1 + c1) && (b1 <= a1 + c1) && (c1 <= b1 + a1);
        
        if (ehtriangulo) {
            if (a1 == b1 && b1 == c1)  {
                resposta = "triâgulo é equilatero";
            } else {
                if (a1 == b1 || b1 == c1 || a1 == c1) {
                    resposta = "triângulo é isóceles";
                    } else {
                        resposta = "triângulo escaleno";
                    }
            }
        } else {
            resposta = "não forma triângulo";
        }
        System.out.println(resposta);
        }  
    }
            
    }

    
}
