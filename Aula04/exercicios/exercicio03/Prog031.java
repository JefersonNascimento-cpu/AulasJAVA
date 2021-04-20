package exercicios.exercicio03;

public class Prog031 {
    String modelo, marca, consumo;

    public Prog031(String mod, String mar, String con) {
        modelo = mod;
        marca = mar;
        consumo = con;
    }

public void apresentar() {
    System.out.println("Modelo: " + modelo + " Marca: " + marca);
}

public void exibirDados() {
    System.out.println("Consumo: " + modelo + " é " + consumo);
}
// obter = get
// alterar = set
}
