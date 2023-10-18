package map.Pesquisar;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(2l,"Leite",4.50, 2);
        estoqueProdutos.adicionarProduto(4l,"Café",9.50, 8);
        estoqueProdutos.adicionarProduto(3l,"Açucar",7.50, 2);
        estoqueProdutos.exibirProdutos();
        System.out.println(" O valor total do estoque é " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(" O produto mais caro é  " + estoqueProdutos.produtoMaisCaro());
    }
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigo,new Produto(nome,preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0.;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return  produtoMaisCaro;
    }
}

