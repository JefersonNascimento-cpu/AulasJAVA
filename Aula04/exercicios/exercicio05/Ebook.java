package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(int totalPaginas, int paginaAtual, String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;

    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public void irParaPagina(int pagina) {
        if (pagina >= 0 && pagina < totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        paginaAtual = 0;
        System.out.println(titulo + " - " + autor + " - " + totalPaginas);
    }

}
