package setOrdenacao;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos =  new CadastroProdutos();
        cadastroProdutos.adcionarProduto(2l,"Leite",4.50, 2);
        cadastroProdutos.adcionarProduto(4l,"Café",9.50, 8);
        cadastroProdutos.adcionarProduto(3l,"Açucar",7.50, 2);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
        System.out.println(cadastroProdutos.produtoSet);
    }
    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adcionarProduto(long codigo, String nome, double preco , int quantidade){
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        // para organizar por nome
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);

        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        // para organizar por nome
        Set<Produto> produtoPorPreco = new TreeSet<>(new comparatoPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }





}
