public class Mercenarios  {

    private String nome;

    private int totKillZumbi;
    private int identificador;

    public Mercenarios(String nome,int identificador) {
        this.nome = nome;
        this.identificador = identificador;
        this.totKillZumbi = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }


    public int getTotKillZumbi() {
        return totKillZumbi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setTotKillZumbi(int totKillZumbi) {
        this.totKillZumbi = totKillZumbi;
    }


    //Metodos

    public void adicionarZumbisMortos(int quantidade) {
        this.totKillZumbi += quantidade;
    }

    public double calularGratificao(){
        double gratificacao = (30 * 5 ) * 0.10 * totKillZumbi; // JA CONVERTO O DOLAR PRA REAL AQUI
        return  gratificacao ;
    }



}

