public class AppFuncionario{

public static void main(String[] args) {
    Funcionario f = new Funcionario("Marcio", 2000);
    Gerente g = new Gerente("Camila", 2500, 10);
    Gerente g2 = new Gerente("Rodrigo", 3500);
    

    f.exibir();
    
    g.exibir();

    g2.exibir();

    System.out.println(f.toString());
    System.out.println(g);

    }

}