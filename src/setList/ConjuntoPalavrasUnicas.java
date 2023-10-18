package setList;

import java.util.HashSet;
import java.util.Set;
import java.lang.String;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraUnicaSet ;


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.adicionarPalavraUnica("Eu");
        conjuntoPalavras.adicionarPalavraUnica("Quero");
        conjuntoPalavras.adicionarPalavraUnica("Dados");
        conjuntoPalavras.removerPalavraUnica("Eu");
        conjuntoPalavras.exibirPalavrasUnicas();

    }
    public ConjuntoPalavrasUnicas(){
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavraUnica(String palavra){
        palavraUnicaSet.add(palavra);
    }

    public void removerPalavraUnica(String palavra){
        if(palavraUnicaSet.contains(palavra)){
            palavraUnicaSet.remove(palavra);
        }
    }

    public boolean verificaPalvra(String palavra){
        return palavraUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavraUnicaSet.isEmpty()) {
            System.out.println(palavraUnicaSet);
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraUnicaSet=" + palavraUnicaSet +
                '}';
    }
}
