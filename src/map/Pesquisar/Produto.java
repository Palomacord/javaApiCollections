package map.Pesquisar;

import java.util.Objects;

public class Produto {

    private  String nome;
    private double preco;
    private  int quantidade;


    public Produto(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
