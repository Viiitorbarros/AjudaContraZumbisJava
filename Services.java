import java.util.ArrayList;
import java.util.List;

public class Services {

    private List<SoldadosBrasileiros> soldados;
    private List<Mercenarios> mercenarios;

    public Services() {
        this.soldados = new ArrayList<>();
        this.mercenarios = new ArrayList<>();
    }


    //  METODO PARA CADASTRAS SOLDADOS E MERCENARIOS
    public void cadastrarSoldado(SoldadosBrasileiros soldado) {// METODO PARA CADASTRAR OS SOLDADOS E POR EM LISTA

        this.soldados.add(soldado);

    }

    public void cadastrarMercenario(Mercenarios mercenarios) {// METODO PARA CADASTRAR OS MERCENAROS E POR EM LISTA
        this.mercenarios.add(mercenarios);
    }

    //  METODO PARA ADICONAR QUANTOS ZUMBIS  OS SOLDADOS E OS MERCENARIOS MATARAM
    public void addQuantidadeDeZumbisMortos(int matricula, int quantidade) {

        for (SoldadosBrasileiros soldadosBrasileiros : soldados) {

            if (matricula == soldadosBrasileiros.getMatricula()) {
                soldadosBrasileiros.adicionarZumbisMortos(quantidade);
            }
        }

        for (Mercenarios mercenarios : mercenarios) {
            if (matricula == mercenarios.getIdentificador()) {
                mercenarios.adicionarZumbisMortos(quantidade);
            }

        }

    }

    // METODO PARA CALCULAR A FOLHA DE PAGAMENTO
    public Double calcularFolhaDePagamentoTotal() {

        double totaldegastos = 0;

        for (SoldadosBrasileiros soldadosBrasileiros : soldados){
            totaldegastos += soldadosBrasileiros.calcularSalarioFixo() + soldadosBrasileiros.calularGratificao() ;

        }

        for (Mercenarios mercenarios : mercenarios){
            totaldegastos+= mercenarios.calularGratificao();
        }
        return totaldegastos;
    }

    public void mostrarQtdZumbisMortosPorPessoa(int matricula){
        for (SoldadosBrasileiros soldadosBrasileiros: soldados){
            if ( matricula == soldadosBrasileiros.getMatricula()){
                System.out.printf("\n O soldado(a): "+ soldadosBrasileiros.getNome() +" Matou " + soldadosBrasileiros.getZumbisMortos() + " zumbis.");
            }
        }
        for (Mercenarios mercenarios: mercenarios){
            if ( matricula == mercenarios.getIdentificador()){
                System.out.printf("\n O Mercenario(a): "+ mercenarios.getNome() +" Matou " + mercenarios.getTotKillZumbi() + " zumbis.");
            }
        }

    }


}