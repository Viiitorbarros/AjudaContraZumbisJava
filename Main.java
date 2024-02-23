
public class Main { // main para rodar meu programa
    public static void main(String[] args) {


       Services services = new Services();


       //CADASTRO DE SOLDADOS E MERCENARIOS

        services.cadastrarSoldado(new Fuzileiros("Vitor",28,1001,5,1000));//CADASTRA SOLDADOS ( FUZILEIRO)
        services.cadastrarSoldado(new AtiradoresDeElite("Joao",35,1002,10,1000 , 5));//CADASTRA SOLDADOS ( AT.ELITE)
        services.cadastrarMercenario(new Mercenarios("Marcos",2001));//CADASTRA MERCENARIO
        services.cadastrarMercenario(new Mercenarios("Joelma",2002));//CADASTRA MERCENARIO

        // ADICIONAR ZUMBIS MORTOS

        services.addQuantidadeDeZumbisMortos(1002,5);
        services.addQuantidadeDeZumbisMortos(1001,10);
        services.addQuantidadeDeZumbisMortos(2001,10);
        services.addQuantidadeDeZumbisMortos(2002,7);

        // CALCULAR FOLHA DE PAGAMENTO

        double totalGastoPeloGoverno = services.calcularFolhaDePagamentoTotal();
        System.out.printf("Total gasto pelo governo na Folha de Pagamento: " + totalGastoPeloGoverno + "R$");


        // MOSTRAR QUANTOS ZUMBIS UMA PESSOA MATOU.

        //services.mostrarQtdZumbisMortosPorPessoa(1001);
        //services.mostrarQtdZumbisMortosPorPessoa(2002);



    }
}