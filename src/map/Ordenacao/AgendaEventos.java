package map.Ordenacao;
import java.time.Month;
import java.util.Map;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventoMap;
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.JULY,23),"KP6","Katy Perry");
        agendaEventos.adicionarEvento(LocalDate.of(2029,Month.AUGUST,13),"Voz e Violão","Nando Reis");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.SEPTEMBER,27),"Eras Tour","Taylor Swift");
        agendaEventos.exibirAgenda();
        agendaEventos.proximoEvento();
    }
    public  AgendaEventos(){
        this.agendaEventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        agendaEventoMap.put(data,evento);
    }

    public  void exibirAgenda(){
        Map<LocalDate,Evento>  eventosMap = new TreeMap<>(agendaEventoMap);
        System.out.println(eventosMap);
    }
    public void proximoEvento(){
        //keyset() - retorna todas as chaves;
        // Set<LocalDate> dataSet = agendaEventoMap.keySet();
        //agendaEventoMap.values();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento>  eventosMap = new TreeMap<>(agendaEventoMap);
        //entrySet - consegue informar a chave e o valor;
        for(Map.Entry<LocalDate,Evento> entry: eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento é " + proximoEvento + " acontecerá na data " + proximaData);
                break;

            }
        }

    }

}
