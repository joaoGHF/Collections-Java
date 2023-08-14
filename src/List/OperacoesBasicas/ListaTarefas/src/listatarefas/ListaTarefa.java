/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatarefas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoGHF
 */
public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void rmTarefa(String descricao) {
        List<Tarefa> toRemove = new ArrayList<>();
        
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.descricao.equalsIgnoreCase(descricao)) {
                System.out.println("rm tarefa: " + tarefa.descricao);
                toRemove.add(tarefa);
            }
        }
        
        tarefaList.removeAll(toRemove);
    }
    
    public int numTarefas() {
        return tarefaList.size();
    }
    
    public String getTarefas() {
        StringBuilder sb = new StringBuilder();
        for (Tarefa tarefa : tarefaList) {
            sb.append(String.format("Tarefa: %s\n",tarefa.getDescricao()));
        }
        
        return sb.toString();
    }
}
