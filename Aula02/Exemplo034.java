import java.util.Scanner;

public class Exemplo034 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao, analise;

        System.out.println("Digite o Salário Bruto: ");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor da Prestação: ");
        prestacao = entrada.nextDouble();

        analise = (salario * 30)/100;

        if (prestacao <= analise) {
                System.out.println("Empréstimo Aprovado!");
        } else { System.out.println("Empréstimo não foi Aprovado, devido ser maior de 30% do Salário!");
        }

        entrada.close();
    }
}
