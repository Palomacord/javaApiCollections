package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("O menino no espelho", "Fernando sabino",1982);
        catalogoLivros.adicionarLivros("O Encontro Marcado", "Fernando sabino",1988);
        catalogoLivros.adicionarLivros("orgulho e preconceito", "Jane Austen",1813);
        catalogoLivros.adicionarLivros("um dia", "David Nicholls",2011);
        //System.out.print(catalogoLivros.pesquisarPorAutor("Fernando sabino"));
        //System.out.print(catalogoLivros.pesquisarPorAutor("Jane Austen"));
        //System.out.print(catalogoLivros.pesquisarPorIntervaloAnos(1800,2000));
        System.out.print(catalogoLivros.pesquisarPorTitulo("um dia"));



    }
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();

    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);

                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro porTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    porTitulo = l;
                    break;
                }
            }
        }
        return porTitulo;
    }

    public  int obterNumeroLivros() {
        return livroList.size();
    }

}
