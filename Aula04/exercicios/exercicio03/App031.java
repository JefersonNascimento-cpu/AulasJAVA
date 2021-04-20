package exercicios.exercicio03;

public class App031 {
    public static void main(String[] args) {
        Prog031 p1 = new Prog031("X1", "BMW", "10 km/l");
        Prog031 p2 = new Prog031("X2", "BMW", "08 km/l");
        Prog031 p3 = new Prog031("X3", "BMW", "06 km/l");
        
        p1.apresentar();
        p1.exibirDados();

        p2.apresentar();
        p1.exibirDados();

        p3.apresentar();
        p1.exibirDados();
    }
}
