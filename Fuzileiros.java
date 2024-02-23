public class Fuzileiros extends SoldadosBrasileiros{

    public Fuzileiros(String nome, int idade, int matricula, int tempoServico, double salarioBruto){
        super(nome,idade,matricula,tempoServico,salarioBruto);

    }


    @Override

    public double calcularSalarioFixo(){
        double salarioFixo = getSalarioBruto() + (getSalarioBruto() * (getTempoServico() * 0.03));

       return salarioFixo;

    }

    public double calularGratificao(){

        double gratificacao = 45 * 0.10 * this.getZumbisMortos();
        return  gratificacao;

    }
}