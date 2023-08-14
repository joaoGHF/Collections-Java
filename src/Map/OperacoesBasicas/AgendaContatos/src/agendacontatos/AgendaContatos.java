/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontatos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joaoGHF
 */
public class AgendaContatos {
    Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }
    
    public void addContato(String nome, Integer numero) {
        agendaContatos.put(nome, numero);
    }
    
    public void rmContato(String nome) {
        if(!agendaContatos.isEmpty()) {
            agendaContatos.remove(nome);
        }
    }
    
    public void showContatos() {
        System.out.println(this.agendaContatos);
    }
    
    public Integer srcNome(String nome) {
        Integer numeroValue = null;
        if (!agendaContatos.isEmpty()) {
            numeroValue = agendaContatos.get(nome);
        }
        
        return numeroValue;
    }  
}
