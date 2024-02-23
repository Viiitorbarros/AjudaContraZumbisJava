public class AtiradoresDeElite extends SoldadosBrasileiros {

    private int pontoDePrecisao;

    public AtiradoresDeElite(String nome, int idade, int matricula, int tempoServico, double salarioBruto, int pontoDePrecisao) {
        super(nome, idade, matricula, tempoServico, salarioBruto);
        this.pontoDePrecisao  = pontoDePrecisao;
    }


    @Override

    public double calcularSalarioFixo(){
        double salarioFixo =  getSalarioBruto() + (getSalarioBruto() * (getTempoServico() * 0.05));
        return salarioFixo;
    }

    public double calularGratificao(){

        double gratificacao = 45 * 0.10 * this.getZumbisMortos();
        return  gratificacao + (7 * pontoDePrecisao);

    }


}
