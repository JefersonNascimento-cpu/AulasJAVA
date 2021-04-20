package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Programar em Java", "Emerson", 3);

        livro.retrocederPagina();
        System.out.println("Página atual:" + livro.exibirPagina());
        livro.mostrarCapa();

        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();

        System.out.println("Página atual:" + livro.exibirPagina());
    }
}
