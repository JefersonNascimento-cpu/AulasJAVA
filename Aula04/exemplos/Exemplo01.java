package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int valor = 50;
        String mensagem = "Seja bem vindo [Carlos Albert]";

        linha();
        System.out.println("Sistema v0.1");
        linha();
        System.out.println("Seja bem vindo {Carlos Alberto");
        linha2(10);
        linha2(20);
        linha2(valor);
        System.out.println(mensagem);
        linha2(mensagem.length());
        linha3(12, '*');
        linha3(23, '_');
    }

    public static void linha() {
        System.out.println("-------------");

    }

    public static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void linha3(int tamanho, char tipo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();

}

}