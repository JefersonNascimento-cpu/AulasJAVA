public class Gerente extends Funcionario{
    //herança - atributos e métodos

    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome, salario); //chama o construtor da classe base (super)
        this.numFuncionarios = numFuncionarios;
    }
    public Gerente(String nome, double salario){
        super(nome, salario); //chama o construtor da classe base (super)
        this.numFuncionarios = 0;
    }
    public void exibir(){
        System.out.println(getNome()+","+ numFuncionarios);
    }
    @Override
    public String toString(){
        return super.toString() + "," +numFuncionarios;
    }

}
