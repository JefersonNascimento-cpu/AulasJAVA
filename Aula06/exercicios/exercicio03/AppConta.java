public class AppConta {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca(1234);
        ContaPoupanca conta2 = new ContaPoupanca(4321);

        System.out.println(conta);
        System.out.println(conta2);
        
        conta.deposito(100);

        ContaPoupanca.setTaxa(0.20);

        conta.saque(20);

        System.out.println(conta);
        System.out.println(conta2);

    }
}
