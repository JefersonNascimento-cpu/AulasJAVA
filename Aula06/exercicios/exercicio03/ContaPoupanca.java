public class ContaPoupanca extends Conta {
    private static double taxa_saque = 0.1;

    public ContaPoupanca(int numero){
        super(numero);
    }
    public static void setTaxa(double novaTaxa){
        if(novaTaxa > 0){
            taxa_saque = novaTaxa;
        }
    }
    @Override
    public boolean saque(double valor){
        if(valor + taxa_saque <= getSaldo()){
            return super.saque(valor + taxa_saque);
        }
        return false;
    }
    @Override
    public String toString(){
        return super.toString() + " taxa:" + taxa_saque;
    }
}
