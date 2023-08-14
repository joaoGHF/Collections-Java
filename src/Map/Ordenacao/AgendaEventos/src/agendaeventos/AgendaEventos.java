/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaeventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author joaoGHF
 */
public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao) {
        Evento e = new Evento(nome, atracao);
        this.agenda.put(data, e);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.agenda);
        System.out.println(eventosTreeMap);
    }

    public void getNextEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.agenda);

        Evento nextEvento = null;
        LocalDate nextData = null;

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            
            if (entry.getKey().isEqual(dataAtual)
                    || entry.getKey().isAfter(dataAtual)) {

                nextData = entry.getKey();
                nextEvento = entry.getValue();

                System.out.println("Proximo Evento: " + nextEvento
                        + " na data " + nextData);
                break;
            }
        }
    }
}
