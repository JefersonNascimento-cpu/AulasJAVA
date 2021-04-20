package exemplos.exemplo03;

public class Pessoa {
    // atributos =  caracteristica, a Pessoa é
    String nome;
    double salario;

    // construtor = prepara, inicializa o objeto
    public Pessoa(String nome, double salario){
        this.nome = nome; //this se refere ao proprio objeto
        this.salario = salario; //this.salario é o atributo e salario o parametro
    }

    // métodos = Ação, a Pessoa faz
    public void apresentar() {
        System.out.println("Óla! Eu sou " + nome);

    }

    public String exibirDados() {
        return nome + " - " + salario;

    }

}
