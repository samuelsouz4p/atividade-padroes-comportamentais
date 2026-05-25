package br.edu.ifpb.ads.padroes.atv2;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> itens = List.of(new ProdutoFisico("Notebook", 3000),
                new Servico("Consultoria", 2000));

        Visitor relatorio = new RelatorioImpostoVisitor();

        Visitor impressao = new ImpressaoVisitor();

        System.out.println("RELATÓRIO DE IMPOSTOS");

        itens.forEach(i -> i.aceitar(relatorio));

        System.out.println("\nIMPRESSÃO DOS VALORES");

        itens.forEach(i -> i.aceitar(impressao));
    }
}
