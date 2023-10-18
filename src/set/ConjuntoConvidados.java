package set;
import java.util.Set;
import java.util.HashSet;
public class ConjuntoConvidados {

    private  Set<Convidado> convidadoSet ;
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarCondidados("Paloma",23512);
        conjuntoConvidados.adicionarCondidados("Manu",23532);
        conjuntoConvidados.adicionarCondidados("Ruan",23546);
        conjuntoConvidados.removerConvidado(23546);
        conjuntoConvidados.exibirConvidados();
    }
    public ConjuntoConvidados(){
       this.convidadoSet = new HashSet<>();
    }
    public void adicionarCondidados(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigo() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        }
    }
}
