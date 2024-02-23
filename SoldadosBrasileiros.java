public class SoldadosBrasileiros {

    private String nome;
    private int idade;
    private int matricula;
    private int tempoServico;
    private double salarioBruto;
    private int zumbisMortos;



    //CONSTRUTOR
    public SoldadosBrasileiros(String nome,int idade, int matricula, int tempoServico, double salarioBruto){
        this.nome = nome;
        this.idade= idade;
        this.matricula = matricula;
        this.tempoServico = tempoServico;
        this.salarioBruto = salarioBruto;
        this.zumbisMortos = zumbisMortos;

    }

    // GETS DAS VARIAVEIS
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public int getMatricula(){
        return matricula;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public int getZumbisMortos() {
        return zumbisMortos;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }



    //SETS DAS VARIAVEIS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }



    //METODOS


    public void adicionarZumbisMortos(int quantidade){
        this.zumbisMortos += quantidade;

    }

    public double calcularSalarioFixo() {
        return 0;
    }

    public double calularGratificao(){
        return 0;

    }




}
