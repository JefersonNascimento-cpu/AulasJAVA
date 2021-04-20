/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1; //inicialização

        while (cont < 16) {
            System.out.println(cont);
            cont++; // a mesma coisa que cont = cont + 1;
            // cont += 2; // cont = cont + 2; pulando de dois em dois
            // cont -= 2; // cont = cont - 2; pulando - dois em dois
        }
    System.out.println("Final - " + cont);
    }
}