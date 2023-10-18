package compras;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private  List<Item> comprasList;
    private double valorTotal;

    public static void main(String[] args) {
        CarrinhoDeCompras listaCompras = new CarrinhoDeCompras();
        listaCompras.adicionarItem("Caneta",12.50, 3);
        listaCompras.adicionarItem("Lapis",12.50, 3);
        listaCompras.adicionarItem("Jogo",12.50, 3);
        listaCompras.removerItem("Jogo");
        System.out.println("O numero total de compras é : " + listaCompras.obterNumeroTotalCompras());
        System.out.print("O valor total das compras é " + listaCompras.calcularValorTotal());
        listaCompras.exibirItens();
    }

    public CarrinhoDeCompras() {
        this.comprasList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        comprasList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> comprasRemover = new ArrayList<>();

        for(Item i :  comprasList){
            if(i.getNome().equalsIgnoreCase(nome)){
                comprasRemover.add(i);
            }
        }
        comprasList.removeAll(comprasRemover);
    }

    public  int obterNumeroTotalCompras() {
        return comprasList.size();
    }

    public double calcularValorTotal(){

        for(Item i :  comprasList){
           this.valorTotal += i.getPreco();
        }
        return  this.valorTotal;
    }

    public void exibirItens(){
        System.out.println(comprasList);
    }
}

