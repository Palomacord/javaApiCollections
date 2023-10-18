package map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;
public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;
    public static void main(String[] args) {
        AgendaContatos agendaContato = new AgendaContatos();
        agendaContato.adicionarContato("Paloma",9922228);
        agendaContato.adicionarContato("Manu",302030);
        agendaContato.adicionarContato("Ruan",5923652);
        agendaContato.remooverContato("Ruan");
        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Paloma"));

    }
    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);

    }

    public void remooverContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
}
