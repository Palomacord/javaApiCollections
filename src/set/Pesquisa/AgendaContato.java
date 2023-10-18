package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContato {

    private Set<Contato> contatoSet;
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.adicionarContato("Paloma",9922228);
        agendaContato.adicionarContato("Manu",302030);
        agendaContato.adicionarContato("Ruan",5923652);
        System.out.println(agendaContato.pesquisarContatoNome("Paloma"));
        System.out.println(agendaContato.atualizaContato("Paloma",8861));
        agendaContato.exibirContato();

    }
    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome,telefone));
    }

    public void exibirContato(){
        if(!contatoSet.isEmpty()){
            System.out.println(contatoSet);
        }
    }

    public Set<Contato> pesquisarContatoNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }

        return contatoPorNome;
    }

    public Contato atualizaContato(String nome , int novoTelefone){
        Contato contatoAtualizado = null;

        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return  contatoAtualizado ;
    }

    @Override
    public String toString() {
        return "AgendaContato{" +
                "contatoSet=" + contatoSet +
                '}';
    }
}
