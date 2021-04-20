import java.util.Scanner;

public class Exemplo035 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;

        System.out.print("Digite a Senha: ");
        senha = entrada.nextLine();

        if(senha.equals("R10p5")) {
            System.out.println("Senha Correta!");
            } else { 
                System.out.println("Senha Incorreta!");
        }

    entrada.close();
    }
}
