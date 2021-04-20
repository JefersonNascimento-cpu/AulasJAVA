public class Placar {
    private String time1, time2;
    private int golstime1, golstime2;

    public Placar(){
        time1 = "Time da casa";
        time2 = "Visitante";
    }

    public Placar(String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;
    }

    public Placar(String time1, String time2, int golstime1, int golstime2){
        this.time1 = time1;
        this.time2 = time2;
        this.golstime1 = golstime1;
        this.golstime2 = golstime2;
    }

    public String exibirPlacar(){
        return time1 + " " + golstime1 + " x " + golstime2 + " " + time2;
    }
}


